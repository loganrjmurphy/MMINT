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
package edu.toronto.cs.se.mmtf.mid.relationship.provider;

import edu.toronto.cs.se.mmtf.mid.relationship.util.RelationshipAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipItemProviderAdapterFactory extends RelationshipAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelRel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRelItemProvider modelRelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelRel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelRelAdapter() {
		if (modelRelItemProvider == null) {
			modelRelItemProvider = new ModelRelItemProvider(this);
		}

		return modelRelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryModelRel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryModelRelItemProvider binaryModelRelItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryModelRel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryModelRelAdapter() {
		if (binaryModelRelItemProvider == null) {
			binaryModelRelItemProvider = new BinaryModelRelItemProvider(this);
		}

		return binaryModelRelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelEndpointReferenceItemProvider modelEndpointReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelEndpointReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelEndpointReferenceAdapter() {
		if (modelEndpointReferenceItemProvider == null) {
			modelEndpointReferenceItemProvider = new ModelEndpointReferenceItemProvider(this);
		}

		return modelEndpointReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementReferenceItemProvider modelElementReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementReferenceAdapter() {
		if (modelElementReferenceItemProvider == null) {
			modelElementReferenceItemProvider = new ModelElementReferenceItemProvider(this);
		}

		return modelElementReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.Link} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkItemProvider linkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkAdapter() {
		if (linkItemProvider == null) {
			linkItemProvider = new LinkItemProvider(this);
		}

		return linkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLinkItemProvider binaryLinkItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryLinkAdapter() {
		if (binaryLinkItemProvider == null) {
			binaryLinkItemProvider = new BinaryLinkItemProvider(this);
		}

		return binaryLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpoint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementEndpointItemProvider modelElementEndpointItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementEndpointAdapter() {
		if (modelElementEndpointItemProvider == null) {
			modelElementEndpointItemProvider = new ModelElementEndpointItemProvider(this);
		}

		return modelElementEndpointItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.LinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkReferenceItemProvider linkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.LinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinkReferenceAdapter() {
		if (linkReferenceItemProvider == null) {
			linkReferenceItemProvider = new LinkReferenceItemProvider(this);
		}

		return linkReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryLinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryLinkReferenceItemProvider binaryLinkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.BinaryLinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryLinkReferenceAdapter() {
		if (binaryLinkReferenceItemProvider == null) {
			binaryLinkReferenceItemProvider = new BinaryLinkReferenceItemProvider(this);
		}

		return binaryLinkReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpointReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementEndpointReferenceItemProvider modelElementEndpointReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.mmtf.mid.relationship.ModelElementEndpointReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelElementEndpointReferenceAdapter() {
		if (modelElementEndpointReferenceItemProvider == null) {
			modelElementEndpointReferenceItemProvider = new ModelElementEndpointReferenceItemProvider(this);
		}

		return modelElementEndpointReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modelRelItemProvider != null) modelRelItemProvider.dispose();
		if (binaryModelRelItemProvider != null) binaryModelRelItemProvider.dispose();
		if (modelEndpointReferenceItemProvider != null) modelEndpointReferenceItemProvider.dispose();
		if (modelElementReferenceItemProvider != null) modelElementReferenceItemProvider.dispose();
		if (linkItemProvider != null) linkItemProvider.dispose();
		if (binaryLinkItemProvider != null) binaryLinkItemProvider.dispose();
		if (modelElementEndpointItemProvider != null) modelElementEndpointItemProvider.dispose();
		if (linkReferenceItemProvider != null) linkReferenceItemProvider.dispose();
		if (binaryLinkReferenceItemProvider != null) binaryLinkReferenceItemProvider.dispose();
		if (modelElementEndpointReferenceItemProvider != null) modelElementEndpointReferenceItemProvider.dispose();
	}

}
