/*******************************************************************************
 * Copyright (c) 2020, 2021 Alessio Di Sandro.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Alessio Di Sandro - Implementation
 *******************************************************************************/
package edu.toronto.cs.se.mmint.lean.reasoning;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.ECollections;

import edu.toronto.cs.se.mmint.MIDTypeHierarchy;
import edu.toronto.cs.se.mmint.MMINT;
import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.lean.menu.MMINTLeanMathlibPathMenu;
import edu.toronto.cs.se.mmint.lean.operators.ToLean;
import edu.toronto.cs.se.mmint.mid.ExtendibleElementConstraint;
import edu.toronto.cs.se.mmint.mid.MIDLevel;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.reasoning.IModelConstraintTrait;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;

public class LeanReasoner implements IModelConstraintTrait {

  protected final static String ENCODER_ID = "edu.toronto.cs.se.mmint.lean.operators.ToLean";
  protected final static String LEAN_DIR = "lean/";
  protected final static String LEAN_COMMENT = "--";
  private final static String LEAN_PROPERTY = "property.lean";
  private final static String LEAN_CONFIG = "leanpkg.path";
  private final static String LEAN_EXEC = "lean";

  @Override
  public String getName() {
    return "Lean";
  }

  protected String generateEncoding(ToLean encoder, Model model, String workingPath) throws Exception {
    var encoderInputs = encoder.checkAllowedInputs(ECollections.newBasicEList(model)); //TODO MMINT[JAVA16] Refactor using records?
    encoder.setWorkingPath(workingPath);
    var encoded = encoder.startInstance(encoderInputs, null, ECollections.emptyEList(), Map.of(), null);

    // when multiple files are created, the first is the one we feed into Lean (i.e. a main)
    return FileUtils.getLastSegmentFromPath(encoded.getOutputModels().get(0).getUri());
  }

  public boolean checkProperty(String encodingFileName, String property, String workingPath) throws Exception {
    var absWorkingPath = FileUtils.prependWorkspacePath(workingPath);
    // write property file
    Files.writeString(Path.of(absWorkingPath, LeanReasoner.LEAN_PROPERTY), property, StandardOpenOption.CREATE);
    // run lean from a shell
    var builder = new ProcessBuilder(LeanReasoner.LEAN_EXEC, encodingFileName);
    builder.redirectErrorStream(true);
    builder.directory(new File(absWorkingPath));
    var process = builder.start();
    var output = new StringBuilder();
    int exitValue;
    Thread readerThread;
    try (var reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
      readerThread = new Thread(() -> {
        String line;
        try {
          while ((line = reader.readLine()) != null) {
            output.append(line + System.lineSeparator());
          }
        }
        catch (IOException e) {
          // just terminate
        }
      });
      readerThread.start();
      exitValue = process.waitFor();
    }
    readerThread.join();
    var result = output.toString().trim();
    if (exitValue != 0) {
      throw new MMINTException(result);
    }

    return Boolean.valueOf(result);
  }

  public boolean checkProperty(Model model, String property, String workingPath) throws Exception {
    var absWorkingPath = FileUtils.prependWorkspacePath(workingPath);
    // get encoder
    var encoder = (ToLean) MIDTypeHierarchy.getPolyOperator(LeanReasoner.ENCODER_ID, ECollections.newBasicEList(model));
    // write lean config file
    var mathlibPath = MMINT.getPreference(MMINTLeanMathlibPathMenu.PREFERENCE_MENU_LEAN_MATHLIB_PATH);
    if (mathlibPath == null) {
      throw new MMINTException("Mathlib path not configured (you can do it through the MMINT top menu)");
    }
    var config = """
      builtin_path
      path .
      path\s""" + mathlibPath + File.separator + "src\n" +
      encoder.getImportPaths().stream().map(p -> "path " + p).collect(Collectors.joining("\n"));
    Files.writeString(Path.of(absWorkingPath, LeanReasoner.LEAN_CONFIG), config, StandardOpenOption.CREATE);
    // generate model encoding files
    var mainEncoding = generateEncoding(encoder, model, workingPath);

    // run lean
    return checkProperty(mainEncoding, property, workingPath);
  }

  @Override
  public boolean checkModelConstraint(Model model, ExtendibleElementConstraint constraint, MIDLevel constraintLevel)
                                     throws Exception {
    var workingPath = MMINT.getActiveInstanceMIDFile().getParent().getFullPath().toString() + IPath.SEPARATOR +
                      LeanReasoner.LEAN_DIR;
    var absWorkingPath = FileUtils.prependWorkspacePath(workingPath);
    try {
      // create project dir
      Files.createDirectory(Path.of(absWorkingPath));
      // check property
      return checkProperty(model, constraint.getImplementation(), workingPath);
    }
    finally {
      // clean up generated dir
      FileUtils.deleteDirectory(absWorkingPath, false);
    }
  }
}
