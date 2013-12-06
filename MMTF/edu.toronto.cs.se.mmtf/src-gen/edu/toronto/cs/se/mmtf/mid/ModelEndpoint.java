/**
 * Copyright (c) 2013 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.mmtf.mid;

import edu.toronto.cs.se.mmtf.MMTFException;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference;
import edu.toronto.cs.se.mmtf.mid.relationship.ModelRel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The model endpoint for a model relationship.
 * <!-- end-model-doc -->
 *
 *
 * @see edu.toronto.cs.se.mmtf.mid.MidPackage#getModelEndpoint()
 * @model
 * @generated
 */
public interface ModelEndpoint extends ExtendibleElementEndpoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@inheritDoc}<br />
	 * Gets the model supertype endpoint of this model type endpoint.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ExtendibleElementEndpoint supertype = super.getSupertype();\nreturn (supertype == null) ? null : (ModelEndpoint) supertype;'"
	 * @generated
	 */
	ModelEndpoint getSupertype();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@inheritDoc}<br />
	 * Gets the model target of this model endpoint.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ExtendibleElement target = super.getTarget();\nreturn (target == null) ? null : (Model) target;'"
	 * @generated
	 */
	Model getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@inheritDoc}<br />
	 * Gets the model type endpoint of this model instance endpoint.
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ExtendibleElementEndpoint metatype = super.getMetatype();\nreturn (metatype == null) ? null : (ModelEndpoint) metatype;'"
	 * @generated
	 */
	ModelEndpoint getMetatype();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" newModelTypeEndpointNameRequired="true" newModelTypeRequired="true" isBinarySrcRequired="true" containerModelRelTypeRequired="true"
	 * @generated
	 */
	ModelEndpointReference createSubtypeAndReference(ModelEndpointReference modelTypeEndpointRef, String newModelTypeEndpointName, Model newModelType, boolean isBinarySrc, ModelRel containerModelRelType) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" oldModelTypeEndpointRequired="true" newModelTypeEndpointNameRequired="true" newModelTypeRequired="true" containerModelRelTypeRequired="true"
	 * @generated
	 */
	void replaceSubtypeAndReference(ModelEndpoint oldModelTypeEndpoint, ModelEndpointReference modelTypeEndpointRef, String newModelTypeEndpointName, Model newModelType, ModelRel containerModelRelType) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isFullDeleteRequired="true"
	 * @generated
	 */
	void deleteTypeAndReference(boolean isFullDelete) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" newModelRequired="true" isBinarySrcRequired="true" containerModelRelRequired="true"
	 * @generated
	 */
	ModelEndpointReference createInstanceAndReference(Model newModel, boolean isBinarySrc, ModelRel containerModelRel) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isFullDeleteRequired="true"
	 * @generated
	 */
	void deleteInstanceAndReference(boolean isFullDelete) throws MMTFException;

} // ModelEndpoint
