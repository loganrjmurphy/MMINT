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
package edu.toronto.cs.se.mmint.mid.operator.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import edu.toronto.cs.se.mmint.MIDTypeHierarchy;
import edu.toronto.cs.se.mmint.MIDTypeRegistry;
import edu.toronto.cs.se.mmint.MMINT;
import edu.toronto.cs.se.mmint.MMINTConstants;
import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mid.GenericElement;
import edu.toronto.cs.se.mmint.mid.MID;
import edu.toronto.cs.se.mmint.mid.MIDPackage;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.ModelEndpoint;
import edu.toronto.cs.se.mmint.mid.operator.Operator;
import edu.toronto.cs.se.mmint.mid.operator.OperatorFactory;
import edu.toronto.cs.se.mmint.mid.operator.OperatorGeneric;
import edu.toronto.cs.se.mmint.mid.operator.OperatorInput;
import edu.toronto.cs.se.mmint.mid.operator.OperatorPackage;
import edu.toronto.cs.se.mmint.mid.operator.RandomOperator;
import edu.toronto.cs.se.mmint.mid.operator.WorkflowOperator;
import edu.toronto.cs.se.mmint.mid.ui.GMFUtils;
import edu.toronto.cs.se.mmint.mid.utils.FileUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WorkflowOperatorImpl extends NestingOperatorImpl implements WorkflowOperator {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public WorkflowOperatorImpl() {
        super();
    }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return OperatorPackage.Literals.WORKFLOW_OPERATOR;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
    switch (operationID) {
      case OperatorPackage.WORKFLOW_OPERATOR___GET_NESTED_WORKFLOW_MID:
        try {
          return getNestedWorkflowMID();
        }
        catch (Throwable throwable) {
          throw new InvocationTargetException(throwable);
        }
    }
    return super.eInvoke(operationID, arguments);
  }

    /**
     * @generated NOT
     */
    @Override
    public String toString() {

        return "[workflow] " + super.toString();
    }

    /**
     * @generated NOT
     */
    @Override
    public MID getNestedWorkflowMID() throws MMINTException {

        MMINTException.mustBeType(this);

        try {
            MID workflowMID;
            if (this.isDynamic()) {
                workflowMID = (MID) FileUtils.readModelFileInState(this.getNestedMIDPath());
            }
            else {
                //TODO MMINT[WORKFLOW] Generalize addSubtype for heavy factory, setting nestedMIDPath there, then use it
                var workflowMIDPath = this.getClass().getName().replace('.', IPath.SEPARATOR) + "." + MIDPackage.eNAME;
                var workflowMIDBundlePath = MIDTypeRegistry.getBundlePath(this, workflowMIDPath);
                workflowMID = (MID) FileUtils.readModelFile(workflowMIDBundlePath, null, false);
            }
            return workflowMID;
        }
        catch (Exception e) {
            return null;
        }
    }

    /**
     * @generated NOT
     */
    @Override
    public void deleteType() throws MMINTException {

        super.deleteType();
        if (this.isDynamic()) {
            FileUtils.deleteFileInState(this.getNestedMIDPath());
            FileUtils.deleteFileInState(this.getNestedMIDPath() + GMFUtils.DIAGRAM_SUFFIX);
        }
    }

    /**
     * Opens the MID with the intermediate models generated by this workflow operator instance, if it exists.
     *
     * @throws Exception
     *             If this is not a workflow operator instance, or if the MID diagram can't be opened.
     * @generated NOT
     */
    @Override
    public void openType() throws Exception {

        MMINTException.mustBeType(this);

        var midDiagramTypeId = MIDTypeRegistry.getMIDDiagramType().getId();
        if (this.isDynamic()) {
            FileUtils.openEclipseEditorInState(this.getNestedMIDPath() + GMFUtils.DIAGRAM_SUFFIX, midDiagramTypeId);
        }
        else {
            //TODO MMINT[WORKFLOW] Generalize addSubtype for heavy factory, setting nestedMIDPath there, then use it
            var workflowMIDPath = this.getClass().getName().replace('.', IPath.SEPARATOR) + "." + MIDPackage.eNAME;
            // in a binary install, extracts the file from the jar as a side effect
            MIDTypeRegistry.getBundlePath(this, workflowMIDPath);
            var workflowMIDDiagramBundlePath = MIDTypeRegistry.getBundlePath(this, workflowMIDPath +
                                                                                 GMFUtils.DIAGRAM_SUFFIX);
            FileUtils.openEclipseEditor(workflowMIDDiagramBundlePath, midDiagramTypeId, false);
        }
    }

    /**
     * Runs this workflow operator instance, i.e. executes its Workflow MID implementation.
     *
     * @param inputsByName
     *            The input model instances, identified by their formal parameter name, i.e. the models in the Workflow
     *            MID that are not output of any operator.
     * @param genericsByName
     *            The generic types, identified by their metatype name.
     * @param outputMIDsByName
     *            The instance MIDs where the output models are created, identified by the output name. A null Instance
     *            MID means that the output model isn't added to it.
     * @return The output model instances, identified by their name, i.e. the models in the Workflow MID that are not
     *         input of any operator.
     * @throws Exception
     *             If something went wrong running the operator.
     * @generated NOT
     */
    @Override
    public Map<String, Model> run(Map<String, Model> inputsByName, Map<String, GenericElement> genericsByName,
            Map<String, MID> outputMIDsByName) throws Exception {

        MMINTException.mustBeInstance(this);

        // workflowMID is executed, intermediate models are stored in nestedMID, outputs in outputMIDsByName
        var workflowMID = ((WorkflowOperator) this.getMetatype()).getNestedWorkflowMID();
        var nestedMID = this.getNestedInstanceMID();
        var nestedMIDPath = this.getNestedMIDPath();
        var allModelsByName = new HashMap<>(inputsByName);
        Random state = null;
        // create shortcuts to input models
        if (nestedMIDPath != null) {
            createNestedInstanceMIDModelShortcuts(new HashSet<>(inputsByName.values()));
        }
        // the order of operator creation in the workflow is a safe order of execution too
        var outputsByName = new HashMap<String, Model>();
        for (Operator workflowOperator : workflowMID.getOperators()) {
            EList<OperatorInput> workflowInputs = new BasicEList<>();
            for (var inputModelEndpoint : workflowOperator.getInputs()) {
                var inputModel = allModelsByName.get(inputModelEndpoint.getTargetUri());
                var workflowInput = OperatorFactory.eINSTANCE.createOperatorInput();
                workflowInput.setModel(inputModel);
                workflowInput.setModelTypeEndpoint(inputModelEndpoint.getMetatype());
                workflowInputs.add(workflowInput);
            }
            var workflowGenerics = new BasicEList<OperatorGeneric>();
            for (var workflowGenericEndpoint : workflowOperator.getGenerics()) {
                var workflowGeneric = OperatorFactory.eINSTANCE.createOperatorGeneric();
                workflowGeneric.setGenericSuperTypeEndpoint(workflowGenericEndpoint.getMetatype());
                workflowGeneric.setGeneric(workflowGenericEndpoint.getTarget());
                workflowGenerics.add(workflowGeneric);
            }
            var workflowOutputMIDsByName = new HashMap<String, MID>();
            for (var outputModelEndpoint : workflowOperator.getOutputs()) {
                var outputMID = outputMIDsByName.getOrDefault(outputModelEndpoint.getTargetUri(), nestedMID); // match workflow ids..
                workflowOutputMIDsByName.put(outputModelEndpoint.getName(), outputMID); // ..with operator output names
            }
            var workflowOperatorType = workflowOperator.getMetatype();
            if (Boolean.parseBoolean(MMINT.getPreference(
                                       MMINTConstants.PREFERENCE_MENU_POLYMORPHISM_MULTIPLEDISPATCH_ENABLED))
            ) { // multiple dispatch enabled
                var polyOperators = ECollections.asEList(MIDTypeHierarchy.getSubtypes(workflowOperatorType));
                var polyIter = MIDTypeHierarchy.getInverseTypeHierarchyIterator(polyOperators);
                var inputModels = ECollections.asEList(
                  workflowInputs.stream()
                    .map(OperatorInput::getModel)
                    .collect(Collectors.toList()));
                while (polyIter.hasNext()) { // start from the most specialized operator backwards
                    var polyOperator = polyIter.next();
                    var polyInputs = polyOperator.checkAllowedInputs(inputModels);
                    if (polyInputs != null) {
                        workflowOperatorType = polyOperator;
                        workflowInputs = polyInputs;
                        break;
                    }
                }
            }
            workflowOperatorType.setWorkingPath(getWorkingPath());
            if (state != null && workflowOperatorType instanceof RandomOperator) {
                ((RandomOperator) workflowOperatorType).setState(state);
            }
            //TODO MMINT[WORKFLOW] Add api getWorkflowData(Operator prevOperator) to fetch in-memory data
            var operator = workflowOperatorType.startInstance(
                workflowInputs,
                null,
                workflowGenerics,
                workflowOutputMIDsByName,
                nestedMID);
            if (operator instanceof RandomOperator) {
               state = ((RandomOperator) operator).getState();
            }
            var workflowOutputsByName = operator.getOutputsByName();
            var outputModels = new HashSet<Model>();
            for (ModelEndpoint outputModelEndpoint : workflowOperator.getOutputs()) {
                var outputModel = workflowOutputsByName.get(outputModelEndpoint.getName());
                allModelsByName.put(outputModelEndpoint.getTargetUri(), outputModel); // ids are unique in a workflowMID
                if (outputMIDsByName.containsKey(outputModelEndpoint.getTargetUri())) { // final outputs
                    outputsByName.put(outputModelEndpoint.getTargetUri(), outputModel);
                    outputModels.add(outputModel);
                }
            }
            // create shortcuts to output models
            if (nestedMIDPath != null && !outputModels.isEmpty()) {
                createNestedInstanceMIDModelShortcuts(outputModels);
            }
        }
        if (nestedMIDPath != null) {
            super.writeNestedInstanceMID();
        }

        return outputsByName;
    }

} //WorkflowOperatorImpl
