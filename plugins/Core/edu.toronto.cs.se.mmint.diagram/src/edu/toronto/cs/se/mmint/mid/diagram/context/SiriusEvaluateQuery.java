/**
 * Copyright (c) 2012-2022 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmint.mid.diagram.context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

import edu.toronto.cs.se.mmint.MIDTypeHierarchy;
import edu.toronto.cs.se.mmint.MMINT;
import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.diagram.library.MIDDiagramUtils;
import edu.toronto.cs.se.mmint.mid.reasoning.IQueryTrait;
import edu.toronto.cs.se.mmint.mid.relationship.ModelRel;
import edu.toronto.cs.se.mmint.mid.ui.FileExtensionsDialogFilter;
import edu.toronto.cs.se.mmint.mid.ui.FilesOnlyDialogSelectionValidator;
import edu.toronto.cs.se.mmint.mid.ui.MIDDialogCancellation;
import edu.toronto.cs.se.mmint.mid.ui.MIDDialogs;
import edu.toronto.cs.se.mmint.mid.ui.MIDTreeSelectionDialog;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;
import edu.toronto.cs.se.mmint.mid.utils.MIDRegistry;

public class SiriusEvaluateQuery extends AbstractExternalJavaAction {

  public record QuerySpec(IQueryTrait reasoner, String filePath, String name) {}

  private static String selectQueryFileToEvaluate(Set<String> fileExtensions) throws MIDDialogCancellation {
    var dialog = new MIDTreeSelectionDialog(new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider(),
                                            ResourcesPlugin.getWorkspace().getRoot());
    dialog.addFilter(new FileExtensionsDialogFilter(fileExtensions));
    dialog.setValidator(new FilesOnlyDialogSelectionValidator());
    var title = "Evaluate query";
    var message = "Select query file";
    var queryFile = (IFile) MIDDialogs.openTreeDialog(dialog, title, message);

    return queryFile.getFullPath().toString();
  }

  public static QuerySpec selectQuery(EObject context) throws MMINTException {
    var allReasoners = MMINT.getReasonersForTrait(IQueryTrait.class, context);
    if (allReasoners.isEmpty()) {
      throw new MMINTException("There are no reasoners installed that implement querying");
    }
    var fileExtToReasoners = new HashMap<String, Set<IQueryTrait>>();
    for (var reasoner : allReasoners) {
      reasoner.getQueryFileExtensions().forEach(fe -> {
        var reasoners = fileExtToReasoners.computeIfAbsent(fe, k -> new HashSet<>());
        reasoners.add(reasoner);
      });
    }
    var queryFilePath = selectQueryFileToEvaluate(fileExtToReasoners.keySet());
    var fileExtension = FileUtils.getFileExtensionFromPath(queryFilePath);
    var reasoners = fileExtToReasoners.get(fileExtension);
    var queryReasoner = MIDDialogs.selectReasoner(reasoners, fileExtension + " queries");
    var queryName = queryReasoner.selectQueryName(queryFilePath);

    return new QuerySpec(queryReasoner, queryFilePath, queryName);
  }

  private static String queryResultToString(Object queryResult) {
    if (queryResult instanceof EObject) {
      try {
        var name = FileUtils.getModelObjectFeature((EObject) queryResult, "name");
        if (name != null) {
          queryResult = name;
        }
      }
      catch (MMINTException e) {}
    }
    return queryResult.toString();
  }

  private static void storeQueryResultsAsModelRel(String queryName, List<Object> queryResults, MID instanceMID) {
    var rels = new HashMap<String, ModelRel>();
    var relType = MIDTypeHierarchy.getRootModelRelType();
    for (var queryResult : queryResults) {
      //TODO MMINT[QUERY] Handle tuples/collections as results
      if (!(queryResult instanceof EObject)) {
        continue;
      }
      var modelPath = MIDRegistry.getModelUri((EObject) queryResult);
      var rel = rels.get(modelPath);
      try {
        if (rel == null) {
          var model = instanceMID.<Model>getExtendibleElement(modelPath);
          if (model == null) {
            continue;
          }
          rel = relType.createInstanceAndEndpoints(null, "query_" + queryName, ECollections.asEList(model),
                                                   instanceMID);
          rels.put(modelPath, rel);
        }
        rel.getModelEndpointRefs().get(0).createModelElementInstanceAndReference((EObject) queryResult, null);
      }
      catch (MMINTException e) {
        MMINTException.print(IStatus.WARNING, "Failed to store query result " + queryResult + " for model " +
                             modelPath, e);
        continue;
      }
    }
  }

  public static void displayQueryResults(EObject context, List<Object> queryResults, String queryName) {
    var printResults = new ArrayList<String>();
    for (var result : queryResults) {
      var printResult = (result instanceof Collection) ?
        ((Collection) result).stream().map(o -> queryResultToString(o)).collect(Collectors.toList()).toString() :
        queryResultToString(result);
      printResults.add(printResult);
    }
    var shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    var title = "Query Results";
    var message = (queryResults.isEmpty()) ? "No Results" : String.join("\n", printResults);
    if (!queryResults.isEmpty() && context instanceof MID) {
      message += "\n\nDo you want to store the results as model relationships for future use?";
      var store = MessageDialog.openQuestion(shell, title, message);
      if (store) {
        storeQueryResultsAsModelRel(queryName, queryResults, (MID) context);
      }
    }
    else {
      MessageDialog.openInformation(shell, title, message);
    }
  }

  @Override
  public boolean canExecute(Collection<? extends EObject> arg0) {
    return true;
  }

  @Override
  public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
    try {
      var modelObjs = arg0.stream()
        .map(obj -> ((DSemanticDecorator) obj).getTarget())
        .collect(Collectors.toList());
      var model = MIDDiagramUtils.getInstanceMIDModelFromModelEditor(modelObjs.get(0));
      //TODO MMINT[QUERY] in case of exception the context should simply be the sirius model
      var instanceMID = model.getMIDContainer();
      var modelElems = model.getModelElems().stream()
        .collect(Collectors.toMap(e -> MIDRegistry.getModelObjectUri(e), e -> e));
      /**TODO MMINT[QUERY]
       * Filtering by model elements was done to convert modelObjs into modelElems
       * (no longer necessary now with connectedEMFObjects library query)
       * Except it won't work anyway: queryArgs are from the Sirius editing domain,
       * while the instanceMID context has its own editing domain
       */
      var queryArgs = modelObjs.stream()
        .map(obj -> modelElems.get(MIDRegistry.getModelElementUri(obj)))
        .filter(elem -> elem != null)
        .collect(Collectors.toList());
      var querySpec = selectQuery(instanceMID);
      var queryResults = querySpec.reasoner().evaluateQuery(querySpec.filePath(), querySpec.name(), instanceMID,
                                                            queryArgs);
      displayQueryResults(instanceMID, queryResults, querySpec.name());
    }
    catch (Exception e) {
      MMINTException.print(IStatus.ERROR, "Query error", e);
    }
  }

}
