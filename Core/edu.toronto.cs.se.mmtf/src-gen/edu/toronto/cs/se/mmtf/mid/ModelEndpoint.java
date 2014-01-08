/**
 * Copyright (c) 2012-2014 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
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
	 * <!-- begin-user-doc --> Creates and adds a reference to this model type
	 * endpoint to the Type MID.
	 * 
	 * @param modelTypeEndpointRef
	 *            The reference to the supertype of the model type endpoint,
	 *            null if such reference doesn't exist in the model relationship
	 *            type container.
	 * @param isModifiable
	 *            True if the new reference will allow modifications of the
	 *            referenced model type endpoint, false otherwise.
	 * @param isBinarySrc
	 *            True if the referenced model type endpoint is the source in
	 *            the binary model relationship container, false otherwise.
	 * @param containerModelRelType
	 *            The model relationship type that will contain the new
	 *            reference to the model type endpoint.
	 * @return The created reference to the model type endpoint.
	 * @throws MMTFException
	 *             If this is a model instance endpoint. <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isModifiableRequired="true" isBinarySrcRequired="true" containerModelRelTypeRequired="true"
	 * @generated
	 */
	ModelEndpointReference createTypeReference(ModelEndpointReference modelTypeEndpointRef, boolean isModifiable, boolean isBinarySrc, ModelRel containerModelRelType) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Creates and adds a subtype of this model type
	 * endpoint and a reference to it to the Type MID.
	 * 
	 * @param modelTypeEndpointRef
	 *            The reference to the supertype of the new model type endpoint,
	 *            null if such reference doesn't exist in the model relationship
	 *            type container.
	 * @param newModelTypeEndpointName
	 *            The name of the new model type endpoint.
	 * @param targetModelType
	 *            The model type that is the target of the new model type
	 *            endpoint.
	 * @param isBinarySrc
	 *            True if the model type endpoint is the source in the binary
	 *            model relationship type container, false otherwise.
	 * @param containerModelRelType
	 *            The model relationship type that will contain the new model
	 *            type endpoint.
	 * @return The created reference to the new model type endpoint.
	 * @throws MMTFException
	 *             If this is a model instance endpoint, or if the uri of the
	 *             new model type endpoint is already registered in the Type
	 *             MID. <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" newModelTypeEndpointNameRequired="true" targetModelTypeRequired="true" isBinarySrcRequired="true" containerModelRelTypeRequired="true"
	 * @generated
	 */
	ModelEndpointReference createSubtypeAndReference(ModelEndpointReference modelTypeEndpointRef, String newModelTypeEndpointName, Model targetModelType, boolean isBinarySrc, ModelRel containerModelRelType) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Replaces an old subtype of this model type
	 * endpoint and a reference to it with new ones in the Type MID.
	 * 
	 * @param oldModelTypeEndpoint
	 *            The old model type endpoint to be replaced.
	 * @param modelTypeEndpointRef
	 *            The reference to the supertype of the new model type endpoint,
	 *            null if such reference doesn't exist in the model relationship
	 *            type container.
	 * @param newModelTypeEndpointName
	 *            The name of the new model type endpoint.
	 * @param targetModelType
	 *            The model type that is the target of the new model type
	 *            endpoint.
	 * @param containerModelRelType
	 *            The model relationship type that will contain the new model
	 *            type endpoint.
	 * @throws MMTFException
	 *             If this is a model instance endpoint, or if the uri of the
	 *             new model type endpoint is already registered in the Type
	 *             MID. <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" oldModelTypeEndpointRequired="true" newModelTypeEndpointNameRequired="true" targetModelTypeRequired="true" containerModelRelTypeRequired="true"
	 * @generated
	 */
	void replaceSubtypeAndReference(ModelEndpoint oldModelTypeEndpoint, ModelEndpointReference modelTypeEndpointRef, String newModelTypeEndpointName, Model targetModelType, ModelRel containerModelRelType) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Deletes this model type endpoint and all
	 * references to it from the Type MID.
	 * 
	 * @param isFullDelete
	 *            True if this model type endpoint is going to be fully deleted,
	 *            false if it is going to be replaced later.
	 * @throws MMTFException
	 *             If this is a model endpoint instance. <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isFullDeleteRequired="true"
	 * @generated
	 */
	void deleteTypeAndReference(boolean isFullDelete) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Creates and adds a reference to this model
	 * instance endpoint to an Instance MID.
	 * 
	 * @param isBinarySrc
	 *            True if the model endpoint is the source in the binary model
	 *            relationship container, false otherwise.
	 * @param containerModelRel
	 *            The model relationship that will contain the new reference to
	 *            the model endpoint.
	 * @return The created reference to the model endpoint.
	 * @throws MMTFException
	 *             If this is a model type endpoint. <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isBinarySrcRequired="true" containerModelRelRequired="true"
	 * @generated
	 */
	ModelEndpointReference createInstanceReference(boolean isBinarySrc, ModelRel containerModelRel) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Creates and adds a model instance endpoint of
	 * this model endpoint type and the reference to it to an Instance MID.
	 * 
	 * @param targetModel
	 *            The model that is the target of the new model endpoint.
	 * @param isBinarySrc
	 *            True if the model endpoint is the source in the binary model
	 *            relationship container, false otherwise.
	 * @param containerModelRel
	 *            The model relationship that will contain the new model
	 *            endpoint.
	 * @return The created reference to the new model endpoint.
	 * @throws MMTFException
	 *             If this is a model instance endpoint. <!-- end-user-doc -->
	 * @model required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" targetModelRequired="true" isBinarySrcRequired="true" containerModelRelRequired="true"
	 * @generated
	 */
	ModelEndpointReference createInstanceAndReference(Model targetModel, boolean isBinarySrc, ModelRel containerModelRel) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Deletes this model instance endpoint and the
	 * reference to it from the Instance MID that contains them.
	 * 
	 * @param isFullDelete
	 *            True if this model endpoint is going to be fully deleted,
	 *            false if it is going to be replaced later.
	 * @throws MMTFException
	 *             If this is a model type endpoint. <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" isFullDeleteRequired="true"
	 * @generated
	 */
	void deleteInstanceAndReference(boolean isFullDelete) throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Replaces an old model instance endpoint and the
	 * reference to it with new ones in an Instance MID.
	 * 
	 * @param oldModelEndpoint
	 *            The old model endpoint to be replaced.
	 * @param targetModel
	 *            The model that is the target of the new model endpoint.
	 * @throws MMTFException
	 *             If this is a model instance endpoint, or if a user-defined
	 *             model endpoint is being replaced with a native one.
	 *             <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException" oldModelEndpointRequired="true" targetModelRequired="true"
	 * @generated
	 */
	void replaceInstanceAndReference(ModelEndpoint oldModelEndpoint, Model targetModel) throws MMTFException;

} // ModelEndpoint
