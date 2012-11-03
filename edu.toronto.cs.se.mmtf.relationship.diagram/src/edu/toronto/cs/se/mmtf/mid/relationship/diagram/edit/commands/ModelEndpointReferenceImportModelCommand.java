/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmtf.mid.relationship.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.se.mmtf.MMTFException;
import edu.toronto.cs.se.mmtf.mid.Model;
import edu.toronto.cs.se.mmtf.mid.ModelOrigin;
import edu.toronto.cs.se.mmtf.mid.MultiModel;
import edu.toronto.cs.se.mmtf.mid.diagram.trait.MidDiagramTrait;
import edu.toronto.cs.se.mmtf.mid.editor.Editor;
import edu.toronto.cs.se.mmtf.mid.relationship.BinaryModelRel;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelRel;
import edu.toronto.cs.se.mmtf.mid.relationship.diagram.part.MidDiagramEditor;
import edu.toronto.cs.se.mmtf.mid.relationship.diagram.trait.RelationshipDiagramTrait;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelConstraintChecker;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelInstanceFactory;

/**
 * The command to create a model reference by importing an existing model.
 * 
 * @author Alessio Di Sandro
 * 
 */
public class ModelEndpointReferenceImportModelCommand extends ModelEndpointReferenceCreateCommand {

	/**
	 * Constructor: initialises the superclass.
	 * 
	 * @param req
	 *            The request.
	 */
	public ModelEndpointReferenceImportModelCommand(CreateElementRequest req) {

		super(req);
	}

	/**
	 * Checks if a model reference can be imported. In the INSTANCES case,
	 * disallows the command to be executed when the diagram root is a binary
	 * model relationship and is either not standalone or has already two
	 * models.
	 * 
	 * @return True if a model reference can be imported, false otherwise.
	 */
	@Override
	public boolean canExecute() {

		ModelRel owner = (ModelRel) getElementToEdit();
		if (!MultiModelConstraintChecker.isInstancesLevel(owner)) {
			return false;
		}
		if (owner instanceof BinaryModelRel) {
			// a binary relationship which is not standalone can be only modified through the mid diagram
			// a binary relationship which is standalone must have at most 2 models
			if (owner.eContainer() != null || owner.getModelEndpoints().size() >= 2) {
				return false;
			}
		}

		return super.canExecute();
	}

	protected ModelEndpointReference doExecuteInstancesLevel() throws Exception{

		//TODO MMTF: completely review this whole class
		URI modelUri = MidDiagramTrait.selectModelToImport(false);
		ModelRel owner = (ModelRel) getElementToEdit();
		Model newModel;

		MultiModelInstanceFactory.assertModelUnique(owner, modelUri); // model must not be already in the mapping
		if (owner.eContainer() == null) { // standalone mapping reference
			newModel = MultiModelInstanceFactory.createModel(null, ModelOrigin.IMPORTED, null, modelUri);
		}
		else {
			newModel = MultiModelInstanceFactory.getModelUnique((MultiModel) owner.eContainer(), modelUri); // model can be already in the MID
			if (newModel == null) {
				newModel = MultiModelInstanceFactory.createModel(null, ModelOrigin.IMPORTED, (MultiModel) owner.eContainer(), modelUri);
				Editor editor = MultiModelInstanceFactory.createEditor(newModel);
				if (editor != null) {
					MultiModelInstanceFactory.addModelEditor(editor, (MultiModel) owner.eContainer());
				}
			}
		}
		EList<String> modelTypeEndpointUris = MultiModelConstraintChecker.getAllowedModelEndpoints(owner, (Model) newModel);
		ModelEndpointReference modelTypeEndpointRef = RelationshipDiagramTrait.selectModelTypeEndpointToCreate(owner, modelTypeEndpointUris, "");
		ModelEndpointReference newModelEndpointRef = MultiModelInstanceFactory.createModelEndpointAndModelEndpointReference(
			modelTypeEndpointRef.getObject(),
			owner,
			newModel,
			false
		);

		// update outline
		MidDiagramEditor editor = (MidDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		editor.getOutlinePage().addInput(modelUri);

		return newModelEndpointRef;
	}

	/**
	 * Creates a new model reference by importing a model.
	 * 
	 * @param monitor
	 *            The progress monitor.
	 * @param info
	 *            Additional parameter, not used.
	 * @return The ok result, or the error result if the model could not be
	 *         imported.
	 * @throws ExecutionException
	 *             If configuration command execution goes wrong.
	 */
	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {

		try {
			ModelEndpointReference newElement = doExecuteInstancesLevel();
			doConfigure(newElement, monitor, info);
			((CreateElementRequest) getRequest()).setNewElement(newElement);

			return CommandResult.newOKCommandResult(newElement);
		}
		catch (ExecutionException ee) {
			throw ee;
		}
		catch (Exception e) {
			MMTFException.print(MMTFException.Type.WARNING, "No model imported", e);
			return CommandResult.newErrorCommandResult("No model imported");
		}
	}

}
