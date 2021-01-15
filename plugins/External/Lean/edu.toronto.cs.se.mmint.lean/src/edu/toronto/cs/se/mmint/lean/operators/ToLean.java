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
package edu.toronto.cs.se.mmint.lean.operators;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;

import edu.toronto.cs.se.mmint.MIDTypeRegistry;
import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.GenericElement;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.operator.impl.OperatorImpl;
import edu.toronto.cs.se.mmint.mid.utils.AcceleoUtils;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;
import edu.toronto.cs.se.mmint.mid.utils.MIDOperatorIOUtils;

public class ToLean extends OperatorImpl {

  protected Input input;
  protected Output output;
  protected AbstractAcceleoGenerator leanGenerator;

  protected static class Input {
    public final static String MODEL = "model";
    public Model model;

    public Input(Map<String, Model> inputsByName) {
      this.model = inputsByName.get(Input.MODEL);
    }
  }

  protected static class Output {
    public static final String MODEL_TYPE_ID = "http://se.cs.toronto.edu/mmint/File";
    public final static String MODELS = "encoding";
    public File leanFolder;
    public List<String> leanPaths;
    public List<Model> leanModels;
    public MID mid;

    public Output(Map<String, MID> outputMIDsByName, String workingPath) {
      this.leanFolder = new File(FileUtils.prependWorkspacePath(workingPath));
      this.leanPaths = new ArrayList<>();
      this.leanModels = new ArrayList<>();
      this.mid = outputMIDsByName.get(Output.MODELS);
    }

    public Map<String, Model> packed() throws MMINTException, IOException {
      if (this.leanPaths.stream().anyMatch(path -> !FileUtils.isFile(path, true))) {
        throw new MMINTException("Acceleo generation failed");
      }
      var fileModelType = MIDTypeRegistry.<Model>getType(Output.MODEL_TYPE_ID);
      for (var i = 0; i < this.leanPaths.size(); i++) {
        this.leanModels.add(fileModelType.createInstance(null, this.leanPaths.get(i), this.mid));
      }

      return MIDOperatorIOUtils.setVarargs(this.leanModels, Output.MODELS);
    }
  }

  public List<String> getConfigPaths() {
    return List.of();
  }

  protected void init(Map<String, Model> inputsByName, Map<String, MID> outputMIDsByName) throws Exception {
    this.input = new Input(inputsByName);
    this.output = new Output(outputMIDsByName, getWorkingPath());
  }

  @Override
  public Map<String, Model> run(Map<String, Model> inputsByName, Map<String, GenericElement> genericsByName,
                                Map<String, MID> outputMIDsByName) throws Exception {
    init(inputsByName, outputMIDsByName);
    AcceleoUtils.runAcceleo(this.leanGenerator);

    return this.output.packed();
  }

}
