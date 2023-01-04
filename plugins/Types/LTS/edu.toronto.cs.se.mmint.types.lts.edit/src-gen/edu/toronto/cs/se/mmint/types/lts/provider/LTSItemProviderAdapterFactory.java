/*******************************************************************************
 * Copyright (c) 2020, 2023 Alessio Di Sandro.
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
package edu.toronto.cs.se.mmint.types.lts.provider;

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

import edu.toronto.cs.se.mmint.types.lts.util.LTSAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LTSItemProviderAdapterFactory extends LTSAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
  protected Collection<Object> supportedTypes = new ArrayList<>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LTSItemProviderAdapterFactory() {
    this.supportedTypes.add(IEditingDomainItemProvider.class);
    this.supportedTypes.add(IStructuredItemContentProvider.class);
    this.supportedTypes.add(ITreeItemContentProvider.class);
    this.supportedTypes.add(IItemLabelProvider.class);
    this.supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmint.types.lts.LTS} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LTSItemProvider ltsItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.mmint.types.lts.LTS}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createLTSAdapter() {
    if (this.ltsItemProvider == null) {
      this.ltsItemProvider = new LTSItemProvider(this);
    }

    return this.ltsItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmint.types.lts.State} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateItemProvider stateItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.mmint.types.lts.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createStateAdapter() {
    if (this.stateItemProvider == null) {
      this.stateItemProvider = new StateItemProvider(this);
    }

    return this.stateItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmint.types.lts.InitialState} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialStateItemProvider initialStateItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.mmint.types.lts.InitialState}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createInitialStateAdapter() {
    if (this.initialStateItemProvider == null) {
      this.initialStateItemProvider = new InitialStateItemProvider(this);
    }

    return this.initialStateItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.mmint.types.lts.Transition} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionItemProvider transitionItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.mmint.types.lts.Transition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createTransitionAdapter() {
    if (this.transitionItemProvider == null) {
      this.transitionItemProvider = new TransitionItemProvider(this);
    }

    return this.transitionItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
    return this.supportedTypes.contains(type) || super.isFactoryForType(type);
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
      var adapter = super.adapt(object, type);
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
  @Override
  public void addListener(INotifyChangedListener notifyChangedListener) {
    this.changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    this.changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void fireNotifyChanged(Notification notification) {
    this.changeNotifier.fireNotifyChanged(notification);

    if (this.parentAdapterFactory != null) {
      this.parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void dispose() {
    if (this.ltsItemProvider != null) this.ltsItemProvider.dispose();
    if (this.stateItemProvider != null) this.stateItemProvider.dispose();
    if (this.initialStateItemProvider != null) this.initialStateItemProvider.dispose();
    if (this.transitionItemProvider != null) this.transitionItemProvider.dispose();
  }

}
