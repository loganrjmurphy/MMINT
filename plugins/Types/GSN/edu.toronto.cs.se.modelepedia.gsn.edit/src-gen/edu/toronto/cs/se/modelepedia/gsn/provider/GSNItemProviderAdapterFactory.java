/**
 * Copyright (c) 2012-2022 Alessio Di Sandro, Marsha Chechik, Nick Fung.
 * All rights reserved. This program and the accompanying materials are made available under the terms
 * of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Alessio Di Sandro - Implementation
 *   Nick Fung - Implementation.
 *
 */
package edu.toronto.cs.se.modelepedia.gsn.provider;

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

import edu.toronto.cs.se.modelepedia.gsn.util.GSNAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The adapters generated by this
 * factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}. The adapters
 * also support Eclipse property sheets. Note that most of the adapters are shared among multiple instances. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class GSNItemProviderAdapterFactory extends GSNAdapterFactory implements ComposeableAdapterFactory,
  IChangeNotifier, IDisposable {
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public GSNItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.SafetyCase} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected SafetyCaseItemProvider safetyCaseItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.SafetyCase}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createSafetyCaseAdapter() {
    if (safetyCaseItemProvider == null) {
      safetyCaseItemProvider = new SafetyCaseItemProvider(this);
    }

    return safetyCaseItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.SupportedBy} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected SupportedByItemProvider supportedByItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.SupportedBy}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createSupportedByAdapter() {
    if (supportedByItemProvider == null) {
      supportedByItemProvider = new SupportedByItemProvider(this);
    }

    return supportedByItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.InContextOf} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected InContextOfItemProvider inContextOfItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.InContextOf}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createInContextOfAdapter() {
    if (inContextOfItemProvider == null) {
      inContextOfItemProvider = new InContextOfItemProvider(this);
    }

    return inContextOfItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.BasicGoal} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected BasicGoalItemProvider basicGoalItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.BasicGoal}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createBasicGoalAdapter() {
    if (basicGoalItemProvider == null) {
      basicGoalItemProvider = new BasicGoalItemProvider(this);
    }

    return basicGoalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.IndependenceGoal}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected IndependenceGoalItemProvider independenceGoalItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.IndependenceGoal}. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createIndependenceGoalAdapter() {
    if (independenceGoalItemProvider == null) {
      independenceGoalItemProvider = new IndependenceGoalItemProvider(this);
    }

    return independenceGoalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.DomainGoal} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected DomainGoalItemProvider domainGoalItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.DomainGoal}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDomainGoalAdapter() {
    if (domainGoalItemProvider == null) {
      domainGoalItemProvider = new DomainGoalItemProvider(this);
    }

    return domainGoalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.Property} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PropertyItemProvider propertyItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.Property}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPropertyAdapter() {
    if (propertyItemProvider == null) {
      propertyItemProvider = new PropertyItemProvider(this);
    }

    return propertyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionStrategy} instances. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected PropertyDecompositionStrategyItemProvider propertyDecompositionStrategyItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionStrategy}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPropertyDecompositionStrategyAdapter() {
    if (propertyDecompositionStrategyItemProvider == null) {
      propertyDecompositionStrategyItemProvider = new PropertyDecompositionStrategyItemProvider(this);
    }

    return propertyDecompositionStrategyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.PropertyGoal} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PropertyGoalItemProvider propertyGoalItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.PropertyGoal}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createPropertyGoalAdapter() {
    if (propertyGoalItemProvider == null) {
      propertyGoalItemProvider = new PropertyGoalItemProvider(this);
    }

    return propertyGoalItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.BasicStrategy} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected BasicStrategyItemProvider basicStrategyItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.BasicStrategy}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createBasicStrategyAdapter() {
    if (basicStrategyItemProvider == null) {
      basicStrategyItemProvider = new BasicStrategyItemProvider(this);
    }

    return basicStrategyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link edu.toronto.cs.se.modelepedia.gsn.ASILDecompositionStrategy} instances. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected ASILDecompositionStrategyItemProvider asilDecompositionStrategyItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.ASILDecompositionStrategy}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createASILDecompositionStrategyAdapter() {
    if (asilDecompositionStrategyItemProvider == null) {
      asilDecompositionStrategyItemProvider = new ASILDecompositionStrategyItemProvider(this);
    }

    return asilDecompositionStrategyItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.Solution} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected SolutionItemProvider solutionItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.Solution}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createSolutionAdapter() {
    if (solutionItemProvider == null) {
      solutionItemProvider = new SolutionItemProvider(this);
    }

    return solutionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.Context} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ContextItemProvider contextItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.Context}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createContextAdapter() {
    if (contextItemProvider == null) {
      contextItemProvider = new ContextItemProvider(this);
    }

    return contextItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.Justification} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected JustificationItemProvider justificationItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.Justification}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createJustificationAdapter() {
    if (justificationItemProvider == null) {
      justificationItemProvider = new JustificationItemProvider(this);
    }

    return justificationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.Assumption} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected AssumptionItemProvider assumptionItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.Assumption}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createAssumptionAdapter() {
    if (assumptionItemProvider == null) {
      assumptionItemProvider = new AssumptionItemProvider(this);
    }

    return assumptionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.ASIL} instances. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ASILItemProvider asilItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.ASIL}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createASILAdapter() {
    if (asilItemProvider == null) {
      asilItemProvider = new ASILItemProvider(this);
    }

    return asilItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.ImpactAnnotation}
   * instances. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ImpactAnnotationItemProvider impactAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.ImpactAnnotation}. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createImpactAnnotationAdapter() {
    if (impactAnnotationItemProvider == null) {
      impactAnnotationItemProvider = new ImpactAnnotationItemProvider(this);
    }

    return impactAnnotationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.AndSupporter} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected AndSupporterItemProvider andSupporterItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.AndSupporter}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createAndSupporterAdapter() {
    if (andSupporterItemProvider == null) {
      andSupporterItemProvider = new AndSupporterItemProvider(this);
    }

    return andSupporterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.OrSupporter} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected OrSupporterItemProvider orSupporterItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.OrSupporter}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createOrSupporterAdapter() {
    if (orSupporterItemProvider == null) {
      orSupporterItemProvider = new OrSupporterItemProvider(this);
    }

    return orSupporterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.XorSupporter} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected XorSupporterItemProvider xorSupporterItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.XorSupporter}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createXorSupporterAdapter() {
    if (xorSupporterItemProvider == null) {
      xorSupporterItemProvider = new XorSupporterItemProvider(this);
    }

    return xorSupporterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.MofNSupporter} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected MofNSupporterItemProvider mofNSupporterItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.MofNSupporter}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createMofNSupporterAdapter() {
    if (mofNSupporterItemProvider == null) {
      mofNSupporterItemProvider = new MofNSupporterItemProvider(this);
    }

    return mofNSupporterItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.IntDomain} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected IntDomainItemProvider intDomainItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.IntDomain}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createIntDomainAdapter() {
    if (intDomainItemProvider == null) {
      intDomainItemProvider = new IntDomainItemProvider(this);
    }

    return intDomainItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.RealDomain} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected RealDomainItemProvider realDomainItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.RealDomain}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createRealDomainAdapter() {
    if (realDomainItemProvider == null) {
      realDomainItemProvider = new RealDomainItemProvider(this);
    }

    return realDomainItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.EnumDomain} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EnumDomainItemProvider enumDomainItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.EnumDomain}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createEnumDomainAdapter() {
    if (enumDomainItemProvider == null) {
      enumDomainItemProvider = new EnumDomainItemProvider(this);
    }

    return enumDomainItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.gsn.ValueDomain} instances.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ValueDomainItemProvider valueDomainItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.ValueDomain}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createValueDomainAdapter() {
    if (valueDomainItemProvider == null) {
      valueDomainItemProvider = new ValueDomainItemProvider(this);
    }

    return valueDomainItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all
   * {@link edu.toronto.cs.se.modelepedia.gsn.DomainDecompositionStrategy} instances. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected DomainDecompositionStrategyItemProvider domainDecompositionStrategyItemProvider;

  /**
   * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.gsn.DomainDecompositionStrategy}. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter createDomainDecompositionStrategyAdapter() {
    if (domainDecompositionStrategyItemProvider == null) {
      domainDecompositionStrategyItemProvider = new DomainDecompositionStrategyItemProvider(this);
    }

    return domainDecompositionStrategyItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void dispose() {
    if (safetyCaseItemProvider != null)
      safetyCaseItemProvider.dispose();
    if (supportedByItemProvider != null)
      supportedByItemProvider.dispose();
    if (inContextOfItemProvider != null)
      inContextOfItemProvider.dispose();
    if (basicGoalItemProvider != null)
      basicGoalItemProvider.dispose();
    if (independenceGoalItemProvider != null)
      independenceGoalItemProvider.dispose();
    if (basicStrategyItemProvider != null)
      basicStrategyItemProvider.dispose();
    if (asilDecompositionStrategyItemProvider != null)
      asilDecompositionStrategyItemProvider.dispose();
    if (solutionItemProvider != null)
      solutionItemProvider.dispose();
    if (contextItemProvider != null)
      contextItemProvider.dispose();
    if (justificationItemProvider != null)
      justificationItemProvider.dispose();
    if (assumptionItemProvider != null)
      assumptionItemProvider.dispose();
    if (asilItemProvider != null)
      asilItemProvider.dispose();
    if (impactAnnotationItemProvider != null)
      impactAnnotationItemProvider.dispose();
    if (andSupporterItemProvider != null)
      andSupporterItemProvider.dispose();
    if (orSupporterItemProvider != null)
      orSupporterItemProvider.dispose();
    if (xorSupporterItemProvider != null)
      xorSupporterItemProvider.dispose();
    if (mofNSupporterItemProvider != null)
      mofNSupporterItemProvider.dispose();
    if (intDomainItemProvider != null)
      intDomainItemProvider.dispose();
    if (realDomainItemProvider != null)
      realDomainItemProvider.dispose();
    if (enumDomainItemProvider != null)
      enumDomainItemProvider.dispose();
    if (valueDomainItemProvider != null)
      valueDomainItemProvider.dispose();
    if (domainDecompositionStrategyItemProvider != null)
      domainDecompositionStrategyItemProvider.dispose();
    if (domainGoalItemProvider != null)
      domainGoalItemProvider.dispose();
    if (propertyItemProvider != null)
      propertyItemProvider.dispose();
    if (propertyDecompositionStrategyItemProvider != null)
      propertyDecompositionStrategyItemProvider.dispose();
    if (propertyGoalItemProvider != null)
      propertyGoalItemProvider.dispose();
  }

}
