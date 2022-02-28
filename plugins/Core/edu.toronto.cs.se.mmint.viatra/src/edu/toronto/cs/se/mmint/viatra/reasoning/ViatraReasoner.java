/**
 * Copyright (c) 2012-2022 Alessio Di Sandro, Marsha Chechik.
 * All rights reserved. This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Alessio Di Sandro - Implementation
 */
package edu.toronto.cs.se.mmint.viatra.reasoning;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.viatra.query.patternlanguage.emf.specification.SpecificationBuilder;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.viatra.query.patternlanguage.emf.vql.PatternModel;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.GenericPatternMatch;
import org.eclipse.viatra.query.runtime.api.GenericPatternMatcher;
import org.eclipse.viatra.query.runtime.emf.EMFScope;

import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.reasoning.IQueryTrait;
import edu.toronto.cs.se.mmint.mid.relationship.ModelRel;
import edu.toronto.cs.se.mmint.mid.ui.MIDDialogs;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;

public class ViatraReasoner implements IQueryTrait {

  @Override
  public String getName() {
    return "Viatra";
  }

  @Override
  public Set<String> getQueryFileExtensions() {
    return Set.of("vql");
  }

  // gets model representation of query file
  protected PatternModel getVQLRoot(String queryFilePath, boolean isWorkspaceRelative) throws Exception {
    var queryRoot = FileUtils.readModelFile(queryFilePath, null, isWorkspaceRelative);
    if (!(queryRoot instanceof PatternModel vqlRoot)) {
      throw new MMINTException("Malformed VQL query file '" + queryFilePath + "'");
    }

    return vqlRoot;
  }

  @Override
  public String selectQueryName(String queryFilePath) throws Exception {
    var queryNames = getVQLRoot(queryFilePath, true).getPatterns().stream()
      .map(Pattern::getName)
      .collect(Collectors.toList());
    var title = "Evaluate query";
    var message = "Select query";

    return MIDDialogs.<String>openListDialog(title, message, queryNames, new ArrayContentProvider(),
                                             new LabelProvider());
  }

  // finds named query
  protected Pattern getPattern(PatternModel vqlRoot, String queryName) throws Exception {
    return vqlRoot.getPatterns().stream()
      .filter(p -> queryName.equals(p.getName()))
      .findFirst()
      .orElseThrow(() -> new MMINTException(MessageFormat.format("Pattern {0} not found", queryName)));
  }

  protected Pattern getPattern(String queryFilePath, String queryName) throws Exception {
    var vqlRoot = getVQLRoot(queryFilePath, true);
    return getPattern(vqlRoot, queryName);
  }

  protected List<Object> getMatches(Collection<GenericPatternMatch> vMatches) throws Exception {
    var matches = new ArrayList<>();
    for (var vMatch : vMatches) {
      var match = (vMatch.parameterNames().size() == 1) ?
        vMatch.get(0) :
        vMatch.parameterNames().stream().map(p -> vMatch.get(p)).collect(Collectors.toList());
      matches.add(match);
    }

    return matches;
  }

  @Override
  public List<Object> evaluateQuery(String queryFilePath, String queryName, EObject context,
                                    List<? extends EObject> queryArgs) throws Exception {
    AdvancedViatraQueryEngine engine = null;
    try {
      // handle query arguments
      var pattern = getPattern(queryFilePath, queryName);
      if (!queryArgs.isEmpty()) { // bound input arguments
        var numFormal = pattern.getParameters().size();
        var numActual = queryArgs.size();
        var diffArgs = numFormal - numActual;
        if (diffArgs < 0) { // too many actual
          throw new MMINTException(MessageFormat.format("Pattern {0} has {1} parameters but {2} were passed", queryName,
                                                        numFormal, numActual));
        }
        if (diffArgs > 0) { // partially bound, add extra null arguments
          for (var i = 0; i < diffArgs; i++) {
            queryArgs.add(null);
          }
        }
      }
      // if context is a MID, preload all model roots into the same resource set
      var resourceSet = context.eResource().getResourceSet();
      if (context instanceof MID) {
        for (var model : ((MID) context).getModels()) {
          if (model instanceof ModelRel) {
            continue;
          }
          var rootModelObj = FileUtils.readModelFile(model.getUri(), resourceSet, true);
          model.eSetDeliver(false); // we are not making a real model change, bypass the need for a write transaction
          model.setEMFInstanceRoot(rootModelObj);
          model.setEMFInstanceResource(rootModelObj.eResource());
        }
      }
      // find query matches within context
      engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resourceSet));
      var builder = new SpecificationBuilder();
      var spec = builder.getOrCreateSpecification(pattern);
      var matcher = (GenericPatternMatcher) engine.getMatcher(spec);
      if (matcher == null) {
        throw new MMINTException("Can't initialize matching engine");
      }
      var vMatches = (queryArgs.isEmpty()) ?
        matcher.getAllMatches() :
        matcher.getAllMatches(matcher.newMatch(queryArgs.toArray()));
      return getMatches(vMatches);
    }
    finally {
      if (engine != null) {
        engine.dispose();
      }
    }
  }
}
