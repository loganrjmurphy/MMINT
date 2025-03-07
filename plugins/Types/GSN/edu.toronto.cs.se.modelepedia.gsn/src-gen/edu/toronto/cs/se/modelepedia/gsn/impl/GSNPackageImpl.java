/*******************************************************************************
 * Copyright (c) 2017, 2022 Alessio Di Sandro, Nick Fung.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Alessio Di Sandro - Implementation
 *     Nick Fung - Implementation
 *******************************************************************************/
package edu.toronto.cs.se.modelepedia.gsn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import edu.toronto.cs.se.modelepedia.gsn.ASILDecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.ASILLevel;
import edu.toronto.cs.se.modelepedia.gsn.ASILfulElement;
import edu.toronto.cs.se.modelepedia.gsn.AndSupporter;
import edu.toronto.cs.se.modelepedia.gsn.ArgumentElement;
import edu.toronto.cs.se.modelepedia.gsn.Assumption;
import edu.toronto.cs.se.modelepedia.gsn.BasicGoal;
import edu.toronto.cs.se.modelepedia.gsn.BasicStrategy;
import edu.toronto.cs.se.modelepedia.gsn.Context;
import edu.toronto.cs.se.modelepedia.gsn.ContextualElement;
import edu.toronto.cs.se.modelepedia.gsn.CoreElement;
import edu.toronto.cs.se.modelepedia.gsn.DecomposableCoreElement;
import edu.toronto.cs.se.modelepedia.gsn.DecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.Domain;
import edu.toronto.cs.se.modelepedia.gsn.DomainDecompositionElement;
import edu.toronto.cs.se.modelepedia.gsn.DomainDecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.DomainGoal;
import edu.toronto.cs.se.modelepedia.gsn.EnumDomain;
import edu.toronto.cs.se.modelepedia.gsn.GSNFactory;
import edu.toronto.cs.se.modelepedia.gsn.GSNPackage;
import edu.toronto.cs.se.modelepedia.gsn.Goal;
import edu.toronto.cs.se.modelepedia.gsn.ImpactAnnotation;
import edu.toronto.cs.se.modelepedia.gsn.ImpactType;
import edu.toronto.cs.se.modelepedia.gsn.InContextOf;
import edu.toronto.cs.se.modelepedia.gsn.IndependenceGoal;
import edu.toronto.cs.se.modelepedia.gsn.IntDomain;
import edu.toronto.cs.se.modelepedia.gsn.Justification;
import edu.toronto.cs.se.modelepedia.gsn.MofNSupporter;
import edu.toronto.cs.se.modelepedia.gsn.OrSupporter;
import edu.toronto.cs.se.modelepedia.gsn.Property;
import edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionElement;
import edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionStrategy;
import edu.toronto.cs.se.modelepedia.gsn.PropertyGoal;
import edu.toronto.cs.se.modelepedia.gsn.RealDomain;
import edu.toronto.cs.se.modelepedia.gsn.SafetyCase;
import edu.toronto.cs.se.modelepedia.gsn.Solution;
import edu.toronto.cs.se.modelepedia.gsn.StatefulElement;
import edu.toronto.cs.se.modelepedia.gsn.Strategy;
import edu.toronto.cs.se.modelepedia.gsn.SupportConnector;
import edu.toronto.cs.se.modelepedia.gsn.Supportable;
import edu.toronto.cs.se.modelepedia.gsn.SupportedBy;
import edu.toronto.cs.se.modelepedia.gsn.Supporter;
import edu.toronto.cs.se.modelepedia.gsn.ValidityValue;
import edu.toronto.cs.se.modelepedia.gsn.ValueDomain;
import edu.toronto.cs.se.modelepedia.gsn.XorSupporter;
import edu.toronto.cs.se.modelepedia.gsn.util.GSNValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class GSNPackageImpl extends EPackageImpl implements GSNPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass safetyCaseEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass statefulElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass asiLfulElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass coreElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass decomposableCoreElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass contextualElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass supportedByEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass inContextOfEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass basicGoalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass independenceGoalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass domainGoalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDecompositionElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDecompositionStrategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyGoalEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass strategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass basicStrategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass asilDecompositionStrategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass solutionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass contextEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass justificationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass assumptionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass asilEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass impactAnnotationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass supportableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass supporterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass supportConnectorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass andSupporterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass orSupporterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass xorSupporterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass mofNSupporterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionStrategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass domainEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass intDomainEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass realDomainEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDomainEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass valueDomainEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass domainDecompositionElementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EClass domainDecompositionStrategyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum asilLevelEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum validityValueEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EEnum impactTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private EDataType exceptionEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private GSNPackageImpl() {
    super(GSNPackage.eNS_URI, GSNFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link GSNPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static GSNPackage init() {
    if (GSNPackageImpl.isInited) return (GSNPackage)EPackage.Registry.INSTANCE.getEPackage(GSNPackage.eNS_URI);

    // Obtain or create and register package
    var registeredGSNPackage = EPackage.Registry.INSTANCE.get(GSNPackage.eNS_URI);
    var theGSNPackage = registeredGSNPackage instanceof GSNPackageImpl ? (GSNPackageImpl)registeredGSNPackage : new GSNPackageImpl();

    GSNPackageImpl.isInited = true;

    // Create package meta-data objects
    theGSNPackage.createPackageContents();

    // Initialize created meta-data
    theGSNPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theGSNPackage,
       new EValidator.Descriptor() {
         @Override
         public EValidator getEValidator() {
           return GSNValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theGSNPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(GSNPackage.eNS_URI, theGSNPackage);
    return theGSNPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSafetyCase() {
    return this.safetyCaseEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Goals() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Strategies() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Solutions() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Contexts() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Justifications() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Assumptions() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSafetyCase_Connectors() {
    return (EReference)this.safetyCaseEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArgumentElement() {
    return this.argumentElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArgumentElement_Id() {
    return (EAttribute)this.argumentElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArgumentElement_Description() {
    return (EAttribute)this.argumentElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArgumentElement_ContentValidity() {
    return (EAttribute)this.argumentElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArgumentElement_Status() {
    return (EReference)this.argumentElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStatefulElement() {
    return this.statefulElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStatefulElement_StateValidity() {
    return (EAttribute)this.statefulElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getASILfulElement() {
    return this.asiLfulElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getASILfulElement_Asil() {
    return (EReference)this.asiLfulElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCoreElement() {
    return this.coreElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDecomposableCoreElement() {
    return this.decomposableCoreElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDecomposableCoreElement_InContextOf() {
    return (EReference)this.decomposableCoreElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContextualElement() {
    return this.contextualElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getContextualElement_ContextOf() {
    return (EReference)this.contextualElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupportedBy() {
    return this.supportedByEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupportedBy_Source() {
    return (EReference)this.supportedByEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupportedBy_Target() {
    return (EReference)this.supportedByEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInContextOf() {
    return this.inContextOfEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInContextOf_Context() {
    return (EReference)this.inContextOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInContextOf_ContextOf() {
    return (EReference)this.inContextOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGoal() {
    return this.goalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBasicGoal() {
    return this.basicGoalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIndependenceGoal() {
    return this.independenceGoalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDomainGoal() {
    return this.domainGoalEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getProperty() {
    return this.propertyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Informal() {
    return (EAttribute)this.propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getProperty_Formal() {
    return (EAttribute)this.propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyDecompositionElement() {
    return this.propertyDecompositionElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPropertyDecompositionElement_Property() {
    return (EReference)this.propertyDecompositionElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyDecompositionStrategy() {
    return this.propertyDecompositionStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPropertyDecompositionStrategy_ReasonerName() {
    return (EAttribute)this.propertyDecompositionStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyGoal() {
    return this.propertyGoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPropertyGoal_Valid() {
    return (EAttribute)this.propertyGoalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPropertyGoal_Hint() {
    return (EAttribute)this.propertyGoalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStrategy() {
    return this.strategyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBasicStrategy() {
    return this.basicStrategyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getASILDecompositionStrategy() {
    return this.asilDecompositionStrategyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSolution() {
    return this.solutionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getContext() {
    return this.contextEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJustification() {
    return this.justificationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAssumption() {
    return this.assumptionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getASIL() {
    return this.asilEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getASIL_Value() {
    return (EAttribute)this.asilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getASIL_Target() {
    return (EReference)this.asilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getASIL_Status() {
    return (EReference)this.asilEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getImpactAnnotation() {
    return this.impactAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getImpactAnnotation_Type() {
    return (EAttribute)this.impactAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getImpactAnnotation_Source() {
    return (EAttribute)this.impactAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupportable() {
    return this.supportableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupportable_SupportedBy() {
    return (EReference)this.supportableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupporter() {
    return this.supporterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupporter_Supports() {
    return (EReference)this.supporterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupportConnector() {
    return this.supportConnectorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndSupporter() {
    return this.andSupporterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrSupporter() {
    return this.orSupporterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getXorSupporter() {
    return this.xorSupporterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMofNSupporter() {
    return this.mofNSupporterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMofNSupporter_Target() {
    return (EAttribute)this.mofNSupporterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDecompositionStrategy() {
    return this.decompositionStrategyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperation getDecompositionStrategy__Validate() {
    return this.decompositionStrategyEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDomain() {
    return this.domainEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperation getDomain__ValidateDecomposition__EList() {
    return this.domainEClass.getEOperations().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntDomain() {
    return this.intDomainEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntDomain_LowerBound() {
    return (EAttribute)this.intDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntDomain_UpperBound() {
    return (EAttribute)this.intDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRealDomain() {
    return this.realDomainEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRealDomain_LowerBound() {
    return (EAttribute)this.realDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRealDomain_UpperBound() {
    return (EAttribute)this.realDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEnumDomain() {
    return this.enumDomainEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEnumDomain_Values() {
    return (EAttribute)this.enumDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getValueDomain() {
    return this.valueDomainEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getValueDomain_Value() {
    return (EAttribute)this.valueDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDomainDecompositionElement() {
    return this.domainDecompositionElementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDomainDecompositionElement_Domain() {
    return (EReference)this.domainDecompositionElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDomainDecompositionStrategy() {
    return this.domainDecompositionStrategyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getASILLevel() {
    return this.asilLevelEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getValidityValue() {
    return this.validityValueEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getImpactType() {
    return this.impactTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataType getException() {
    return this.exceptionEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GSNFactory getGSNFactory() {
    return (GSNFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (this.isCreated) return;
    this.isCreated = true;

    // Create classes and their features
    this.safetyCaseEClass = createEClass(GSNPackage.SAFETY_CASE);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__GOALS);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__STRATEGIES);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__SOLUTIONS);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__CONTEXTS);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__JUSTIFICATIONS);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__ASSUMPTIONS);
    createEReference(this.safetyCaseEClass, GSNPackage.SAFETY_CASE__CONNECTORS);

    this.argumentElementEClass = createEClass(GSNPackage.ARGUMENT_ELEMENT);
    createEAttribute(this.argumentElementEClass, GSNPackage.ARGUMENT_ELEMENT__ID);
    createEAttribute(this.argumentElementEClass, GSNPackage.ARGUMENT_ELEMENT__DESCRIPTION);
    createEAttribute(this.argumentElementEClass, GSNPackage.ARGUMENT_ELEMENT__CONTENT_VALIDITY);
    createEReference(this.argumentElementEClass, GSNPackage.ARGUMENT_ELEMENT__STATUS);

    this.statefulElementEClass = createEClass(GSNPackage.STATEFUL_ELEMENT);
    createEAttribute(this.statefulElementEClass, GSNPackage.STATEFUL_ELEMENT__STATE_VALIDITY);

    this.asiLfulElementEClass = createEClass(GSNPackage.ASI_LFUL_ELEMENT);
    createEReference(this.asiLfulElementEClass, GSNPackage.ASI_LFUL_ELEMENT__ASIL);

    this.coreElementEClass = createEClass(GSNPackage.CORE_ELEMENT);

    this.decomposableCoreElementEClass = createEClass(GSNPackage.DECOMPOSABLE_CORE_ELEMENT);
    createEReference(this.decomposableCoreElementEClass, GSNPackage.DECOMPOSABLE_CORE_ELEMENT__IN_CONTEXT_OF);

    this.contextualElementEClass = createEClass(GSNPackage.CONTEXTUAL_ELEMENT);
    createEReference(this.contextualElementEClass, GSNPackage.CONTEXTUAL_ELEMENT__CONTEXT_OF);

    this.supportedByEClass = createEClass(GSNPackage.SUPPORTED_BY);
    createEReference(this.supportedByEClass, GSNPackage.SUPPORTED_BY__SOURCE);
    createEReference(this.supportedByEClass, GSNPackage.SUPPORTED_BY__TARGET);

    this.inContextOfEClass = createEClass(GSNPackage.IN_CONTEXT_OF);
    createEReference(this.inContextOfEClass, GSNPackage.IN_CONTEXT_OF__CONTEXT);
    createEReference(this.inContextOfEClass, GSNPackage.IN_CONTEXT_OF__CONTEXT_OF);

    this.goalEClass = createEClass(GSNPackage.GOAL);

    this.basicGoalEClass = createEClass(GSNPackage.BASIC_GOAL);

    this.independenceGoalEClass = createEClass(GSNPackage.INDEPENDENCE_GOAL);

    this.strategyEClass = createEClass(GSNPackage.STRATEGY);

    this.basicStrategyEClass = createEClass(GSNPackage.BASIC_STRATEGY);

    this.asilDecompositionStrategyEClass = createEClass(GSNPackage.ASIL_DECOMPOSITION_STRATEGY);

    this.solutionEClass = createEClass(GSNPackage.SOLUTION);

    this.contextEClass = createEClass(GSNPackage.CONTEXT);

    this.justificationEClass = createEClass(GSNPackage.JUSTIFICATION);

    this.assumptionEClass = createEClass(GSNPackage.ASSUMPTION);

    this.asilEClass = createEClass(GSNPackage.ASIL);
    createEAttribute(this.asilEClass, GSNPackage.ASIL__VALUE);
    createEReference(this.asilEClass, GSNPackage.ASIL__TARGET);
    createEReference(this.asilEClass, GSNPackage.ASIL__STATUS);

    this.impactAnnotationEClass = createEClass(GSNPackage.IMPACT_ANNOTATION);
    createEAttribute(this.impactAnnotationEClass, GSNPackage.IMPACT_ANNOTATION__TYPE);
    createEAttribute(this.impactAnnotationEClass, GSNPackage.IMPACT_ANNOTATION__SOURCE);

    this.supportableEClass = createEClass(GSNPackage.SUPPORTABLE);
    createEReference(this.supportableEClass, GSNPackage.SUPPORTABLE__SUPPORTED_BY);

    this.supporterEClass = createEClass(GSNPackage.SUPPORTER);
    createEReference(this.supporterEClass, GSNPackage.SUPPORTER__SUPPORTS);

    this.supportConnectorEClass = createEClass(GSNPackage.SUPPORT_CONNECTOR);

    this.andSupporterEClass = createEClass(GSNPackage.AND_SUPPORTER);

    this.orSupporterEClass = createEClass(GSNPackage.OR_SUPPORTER);

    this.xorSupporterEClass = createEClass(GSNPackage.XOR_SUPPORTER);

    this.mofNSupporterEClass = createEClass(GSNPackage.MOF_NSUPPORTER);
    createEAttribute(this.mofNSupporterEClass, GSNPackage.MOF_NSUPPORTER__TARGET);

    this.decompositionStrategyEClass = createEClass(GSNPackage.DECOMPOSITION_STRATEGY);
    createEOperation(this.decompositionStrategyEClass, GSNPackage.DECOMPOSITION_STRATEGY___VALIDATE);

    this.domainEClass = createEClass(GSNPackage.DOMAIN);
    createEOperation(this.domainEClass, GSNPackage.DOMAIN___VALIDATE_DECOMPOSITION__ELIST);

    this.intDomainEClass = createEClass(GSNPackage.INT_DOMAIN);
    createEAttribute(this.intDomainEClass, GSNPackage.INT_DOMAIN__LOWER_BOUND);
    createEAttribute(this.intDomainEClass, GSNPackage.INT_DOMAIN__UPPER_BOUND);

    this.realDomainEClass = createEClass(GSNPackage.REAL_DOMAIN);
    createEAttribute(this.realDomainEClass, GSNPackage.REAL_DOMAIN__LOWER_BOUND);
    createEAttribute(this.realDomainEClass, GSNPackage.REAL_DOMAIN__UPPER_BOUND);

    this.enumDomainEClass = createEClass(GSNPackage.ENUM_DOMAIN);
    createEAttribute(this.enumDomainEClass, GSNPackage.ENUM_DOMAIN__VALUES);

    this.valueDomainEClass = createEClass(GSNPackage.VALUE_DOMAIN);
    createEAttribute(this.valueDomainEClass, GSNPackage.VALUE_DOMAIN__VALUE);

    this.domainDecompositionElementEClass = createEClass(GSNPackage.DOMAIN_DECOMPOSITION_ELEMENT);
    createEReference(this.domainDecompositionElementEClass, GSNPackage.DOMAIN_DECOMPOSITION_ELEMENT__DOMAIN);

    this.domainDecompositionStrategyEClass = createEClass(GSNPackage.DOMAIN_DECOMPOSITION_STRATEGY);

    this.domainGoalEClass = createEClass(GSNPackage.DOMAIN_GOAL);

    this.propertyEClass = createEClass(GSNPackage.PROPERTY);
    createEAttribute(this.propertyEClass, GSNPackage.PROPERTY__FORMAL);
    createEAttribute(this.propertyEClass, GSNPackage.PROPERTY__INFORMAL);

    this.propertyDecompositionElementEClass = createEClass(GSNPackage.PROPERTY_DECOMPOSITION_ELEMENT);
    createEReference(this.propertyDecompositionElementEClass, GSNPackage.PROPERTY_DECOMPOSITION_ELEMENT__PROPERTY);

    this.propertyDecompositionStrategyEClass = createEClass(GSNPackage.PROPERTY_DECOMPOSITION_STRATEGY);
    createEAttribute(this.propertyDecompositionStrategyEClass, GSNPackage.PROPERTY_DECOMPOSITION_STRATEGY__REASONER_NAME);

    this.propertyGoalEClass = createEClass(GSNPackage.PROPERTY_GOAL);
    createEAttribute(this.propertyGoalEClass, GSNPackage.PROPERTY_GOAL__VALID);
    createEAttribute(this.propertyGoalEClass, GSNPackage.PROPERTY_GOAL__HINT);

    // Create enums
    this.asilLevelEEnum = createEEnum(GSNPackage.ASIL_LEVEL);
    this.validityValueEEnum = createEEnum(GSNPackage.VALIDITY_VALUE);
    this.impactTypeEEnum = createEEnum(GSNPackage.IMPACT_TYPE);

    // Create data types
    this.exceptionEDataType = createEDataType(GSNPackage.EXCEPTION);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (this.isInitialized) return;
    this.isInitialized = true;

    // Initialize package
    setName(GSNPackage.eNAME);
    setNsPrefix(GSNPackage.eNS_PREFIX);
    setNsURI(GSNPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    this.coreElementEClass.getESuperTypes().add(this.getArgumentElement());
    this.coreElementEClass.getESuperTypes().add(this.getSupporter());
    this.decomposableCoreElementEClass.getESuperTypes().add(this.getSupportable());
    this.decomposableCoreElementEClass.getESuperTypes().add(this.getCoreElement());
    this.contextualElementEClass.getESuperTypes().add(this.getArgumentElement());
    this.goalEClass.getESuperTypes().add(this.getDecomposableCoreElement());
    this.goalEClass.getESuperTypes().add(this.getStatefulElement());
    this.goalEClass.getESuperTypes().add(this.getASILfulElement());
    this.basicGoalEClass.getESuperTypes().add(this.getGoal());
    this.independenceGoalEClass.getESuperTypes().add(this.getGoal());
    this.strategyEClass.getESuperTypes().add(this.getDecomposableCoreElement());
    this.basicStrategyEClass.getESuperTypes().add(this.getStrategy());
    this.asilDecompositionStrategyEClass.getESuperTypes().add(this.getStrategy());
    this.solutionEClass.getESuperTypes().add(this.getCoreElement());
    this.solutionEClass.getESuperTypes().add(this.getStatefulElement());
    this.contextEClass.getESuperTypes().add(this.getContextualElement());
    this.justificationEClass.getESuperTypes().add(this.getContextualElement());
    this.assumptionEClass.getESuperTypes().add(this.getContextualElement());
    this.supportableEClass.getESuperTypes().add(this.getSupporter());
    this.supportConnectorEClass.getESuperTypes().add(this.getSupportable());
    this.andSupporterEClass.getESuperTypes().add(this.getSupportConnector());
    this.orSupporterEClass.getESuperTypes().add(this.getSupportConnector());
    this.xorSupporterEClass.getESuperTypes().add(this.getSupportConnector());
    this.mofNSupporterEClass.getESuperTypes().add(this.getSupportConnector());
    this.decompositionStrategyEClass.getESuperTypes().add(this.getStrategy());
    this.intDomainEClass.getESuperTypes().add(this.getDomain());
    this.realDomainEClass.getESuperTypes().add(this.getDomain());
    this.enumDomainEClass.getESuperTypes().add(this.getDomain());
    this.valueDomainEClass.getESuperTypes().add(this.getDomain());
    this.domainDecompositionStrategyEClass.getESuperTypes().add(this.getDecompositionStrategy());
    this.domainDecompositionStrategyEClass.getESuperTypes().add(this.getDomainDecompositionElement());
    this.domainGoalEClass.getESuperTypes().add(this.getGoal());
    this.domainGoalEClass.getESuperTypes().add(this.getDomainDecompositionElement());
    this.propertyDecompositionStrategyEClass.getESuperTypes().add(this.getDecompositionStrategy());
    this.propertyDecompositionStrategyEClass.getESuperTypes().add(this.getPropertyDecompositionElement());
    this.propertyGoalEClass.getESuperTypes().add(this.getGoal());
    this.propertyGoalEClass.getESuperTypes().add(this.getPropertyDecompositionElement());

    // Initialize classes, features, and operations; add parameters
    initEClass(this.safetyCaseEClass, SafetyCase.class, "SafetyCase", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSafetyCase_Goals(), this.getGoal(), null, "goals", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Contexts(), this.getContext(), null, "contexts", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSafetyCase_Connectors(), this.getSupportConnector(), null, "connectors", null, 0, -1, SafetyCase.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.argumentElementEClass, ArgumentElement.class, "ArgumentElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgumentElement_Id(), this.ecorePackage.getEString(), "id", null, 1, 1, ArgumentElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getArgumentElement_Description(), this.ecorePackage.getEString(), "description", null, 0, 1, ArgumentElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getArgumentElement_ContentValidity(), this.getValidityValue(), "contentValidity", null, 0, 1, ArgumentElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getArgumentElement_Status(), this.getImpactAnnotation(), null, "status", null, 0, 1, ArgumentElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.statefulElementEClass, StatefulElement.class, "StatefulElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatefulElement_StateValidity(), this.getValidityValue(), "stateValidity", null, 0, 1, StatefulElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.asiLfulElementEClass, ASILfulElement.class, "ASILfulElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getASILfulElement_Asil(), this.getASIL(), this.getASIL_Target(), "asil", null, 0, 1, ASILfulElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.coreElementEClass, CoreElement.class, "CoreElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.decomposableCoreElementEClass, DecomposableCoreElement.class, "DecomposableCoreElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecomposableCoreElement_InContextOf(), this.getInContextOf(), this.getInContextOf_ContextOf(), "inContextOf", null, 0, -1, DecomposableCoreElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.contextualElementEClass, ContextualElement.class, "ContextualElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContextualElement_ContextOf(), this.getInContextOf(), this.getInContextOf_Context(), "contextOf", null, 1, -1, ContextualElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.supportedByEClass, SupportedBy.class, "SupportedBy", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupportedBy_Source(), this.getSupportable(), this.getSupportable_SupportedBy(), "source", null, 1, 1, SupportedBy.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getSupportedBy_Target(), this.getSupporter(), this.getSupporter_Supports(), "target", null, 1, 1, SupportedBy.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.inContextOfEClass, InContextOf.class, "InContextOf", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInContextOf_Context(), this.getContextualElement(), this.getContextualElement_ContextOf(), "context", null, 1, 1, InContextOf.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getInContextOf_ContextOf(), this.getDecomposableCoreElement(), this.getDecomposableCoreElement_InContextOf(), "contextOf", null, 1, 1, InContextOf.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.goalEClass, Goal.class, "Goal", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.basicGoalEClass, BasicGoal.class, "BasicGoal", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.independenceGoalEClass, IndependenceGoal.class, "IndependenceGoal", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.strategyEClass, Strategy.class, "Strategy", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.basicStrategyEClass, BasicStrategy.class, "BasicStrategy", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.asilDecompositionStrategyEClass, ASILDecompositionStrategy.class, "ASILDecompositionStrategy", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.solutionEClass, Solution.class, "Solution", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.contextEClass, Context.class, "Context", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.justificationEClass, Justification.class, "Justification", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.assumptionEClass, Assumption.class, "Assumption", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.asilEClass, edu.toronto.cs.se.modelepedia.gsn.ASIL.class, "ASIL", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getASIL_Value(), this.getASILLevel(), "value", null, 1, 1, edu.toronto.cs.se.modelepedia.gsn.ASIL.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getASIL_Target(), this.getASILfulElement(), this.getASILfulElement_Asil(), "target", null, 1, 1, edu.toronto.cs.se.modelepedia.gsn.ASIL.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEReference(getASIL_Status(), this.getImpactAnnotation(), null, "status", null, 0, 1, edu.toronto.cs.se.modelepedia.gsn.ASIL.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.impactAnnotationEClass, ImpactAnnotation.class, "ImpactAnnotation", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImpactAnnotation_Type(), this.getImpactType(), "type", null, 1, 1, ImpactAnnotation.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getImpactAnnotation_Source(), this.ecorePackage.getEString(), "source", null, 0, 1, ImpactAnnotation.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.supportableEClass, Supportable.class, "Supportable", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupportable_SupportedBy(), this.getSupportedBy(), this.getSupportedBy_Source(), "supportedBy", null, 1, -1, Supportable.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.supporterEClass, Supporter.class, "Supporter", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupporter_Supports(), this.getSupportedBy(), this.getSupportedBy_Target(), "supports", null, 0, -1, Supporter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_COMPOSITE, EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.supportConnectorEClass, SupportConnector.class, "SupportConnector", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.andSupporterEClass, AndSupporter.class, "AndSupporter", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.orSupporterEClass, OrSupporter.class, "OrSupporter", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.xorSupporterEClass, XorSupporter.class, "XorSupporter", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.mofNSupporterEClass, MofNSupporter.class, "MofNSupporter", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMofNSupporter_Target(), this.ecorePackage.getELong(), "target", "1", 1, 1, MofNSupporter.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.decompositionStrategyEClass, DecompositionStrategy.class, "DecompositionStrategy", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    var op = initEOperation(getDecompositionStrategy__Validate(), null, "validate", 0, 1, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_ORDERED);
    addEException(op, this.getException());

    initEClass(this.domainEClass, Domain.class, "Domain", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    op = initEOperation(getDomain__ValidateDecomposition__EList(), null, "validateDecomposition", 0, 1, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_ORDERED);
    addEParameter(op, this.getDomain(), "subDomains", 0, -1, EPackageImpl.IS_UNIQUE, EPackageImpl.IS_ORDERED);
    addEException(op, this.getException());

    initEClass(this.intDomainEClass, IntDomain.class, "IntDomain", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntDomain_LowerBound(), this.ecorePackage.getEInt(), "lowerBound", null, 1, 1, IntDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getIntDomain_UpperBound(), this.ecorePackage.getEInt(), "upperBound", null, 1, 1, IntDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.realDomainEClass, RealDomain.class, "RealDomain", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRealDomain_LowerBound(), this.ecorePackage.getEDouble(), "lowerBound", null, 1, 1, RealDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getRealDomain_UpperBound(), this.ecorePackage.getEDouble(), "upperBound", null, 1, 1, RealDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.enumDomainEClass, EnumDomain.class, "EnumDomain", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumDomain_Values(), this.ecorePackage.getEString(), "values", null, 2, -1, EnumDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.valueDomainEClass, ValueDomain.class, "ValueDomain", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValueDomain_Value(), this.ecorePackage.getEString(), "value", null, 1, 1, ValueDomain.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.domainDecompositionElementEClass, DomainDecompositionElement.class, "DomainDecompositionElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainDecompositionElement_Domain(), this.getDomain(), null, "domain", null, 1, 1, DomainDecompositionElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.domainDecompositionStrategyEClass, DomainDecompositionStrategy.class, "DomainDecompositionStrategy", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.domainGoalEClass, DomainGoal.class, "DomainGoal", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    initEClass(this.propertyEClass, Property.class, "Property", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Formal(), this.ecorePackage.getEString(), "formal", null, 1, 1, Property.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getProperty_Informal(), this.ecorePackage.getEString(), "informal", null, 1, 1, Property.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.propertyDecompositionElementEClass, PropertyDecompositionElement.class, "PropertyDecompositionElement", EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyDecompositionElement_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyDecompositionElement.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, EPackageImpl.IS_COMPOSITE, !EPackageImpl.IS_RESOLVE_PROXIES, !EPackageImpl.IS_UNSETTABLE, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.propertyDecompositionStrategyEClass, PropertyDecompositionStrategy.class, "PropertyDecompositionStrategy", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDecompositionStrategy_ReasonerName(), this.ecorePackage.getEString(), "reasonerName", null, 1, 1, PropertyDecompositionStrategy.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    initEClass(this.propertyGoalEClass, PropertyGoal.class, "PropertyGoal", !EPackageImpl.IS_ABSTRACT, !EPackageImpl.IS_INTERFACE, EPackageImpl.IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyGoal_Valid(), this.ecorePackage.getEBoolean(), "valid", null, 1, 1, PropertyGoal.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);
    initEAttribute(getPropertyGoal_Hint(), this.ecorePackage.getEString(), "hint", null, 0, 1, PropertyGoal.class, !EPackageImpl.IS_TRANSIENT, !EPackageImpl.IS_VOLATILE, EPackageImpl.IS_CHANGEABLE, !EPackageImpl.IS_UNSETTABLE, !EPackageImpl.IS_ID, EPackageImpl.IS_UNIQUE, !EPackageImpl.IS_DERIVED, EPackageImpl.IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(this.asilLevelEEnum, ASILLevel.class, "ASILLevel");
    addEEnumLiteral(this.asilLevelEEnum, ASILLevel.D);
    addEEnumLiteral(this.asilLevelEEnum, ASILLevel.C);
    addEEnumLiteral(this.asilLevelEEnum, ASILLevel.B);
    addEEnumLiteral(this.asilLevelEEnum, ASILLevel.A);
    addEEnumLiteral(this.asilLevelEEnum, ASILLevel.QM);

    initEEnum(this.validityValueEEnum, ValidityValue.class, "ValidityValue");
    addEEnumLiteral(this.validityValueEEnum, ValidityValue.INVALID);
    addEEnumLiteral(this.validityValueEEnum, ValidityValue.VALID);
    addEEnumLiteral(this.validityValueEEnum, ValidityValue.UNDETERMINED);

    initEEnum(this.impactTypeEEnum, ImpactType.class, "ImpactType");
    addEEnumLiteral(this.impactTypeEEnum, ImpactType.REVISE);
    addEEnumLiteral(this.impactTypeEEnum, ImpactType.RECHECK_CONTENT);
    addEEnumLiteral(this.impactTypeEEnum, ImpactType.RECHECK_STATE);
    addEEnumLiteral(this.impactTypeEEnum, ImpactType.REUSE);

    // Initialize data types
    initEDataType(this.exceptionEDataType, Exception.class, "Exception", EPackageImpl.IS_SERIALIZABLE, !EPackageImpl.IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(GSNPackage.eNS_URI);

    // Create annotations
    // http://www.eclipse.org/OCL/Import
    createImportAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
    createPivotAnnotations();
    // gmf.label
    createGmfAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @generated
   */
  protected void createImportAnnotations() {
    var source = "http://www.eclipse.org/OCL/Import";
    addAnnotation
      (this,
       source,
       new String[] {
         "ecore", "http://www.eclipse.org/emf/2002/Ecore"
       });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations() {
    var source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation
      (this,
       source,
       new String[] {
         "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });
    addAnnotation
      (this.safetyCaseEClass,
       source,
       new String[] {
         "constraints", "SingleRoot"
       });
    addAnnotation
      (this.contextualElementEClass,
       source,
       new String[] {
         "constraints", "ContextualElementSupporter ContextualElementContext"
       });
    addAnnotation
      (this.goalEClass,
       source,
       new String[] {
         "constraints", "GoalSupporter GoalContext ASILInheritance"
       });
    addAnnotation
      (this.strategyEClass,
       source,
       new String[] {
         "constraints", "StrategySupporter StrategyContext"
       });
    addAnnotation
      (this.asilDecompositionStrategyEClass,
       source,
       new String[] {
         "constraints", "ASILDecompositionIndependence ASILDecompositionComponents ASILDescendants"
       });
    addAnnotation
      (this.solutionEClass,
       source,
       new String[] {
         "constraints", "SolutionSupporter SolutionContext"
       });
    addAnnotation
      (this.supportableEClass,
       source,
       new String[] {
         "constraints", "SupportCycle NonSupportableLeaves"
       });
    addAnnotation
      (this.supporterEClass,
       source,
       new String[] {
         "constraints", "GoalRoot"
       });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createPivotAnnotations() {
    var source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
    addAnnotation
      (this.safetyCaseEClass,
       source,
       new String[] {
         "SingleRoot", "Supporter.allInstances() -> \n\t\t\tselect(d | d.supports.source -> isEmpty()) -> size() = 1"
       });
    addAnnotation
      (this.contextualElementEClass,
       source,
       new String[] {
         "ContextualElementSupporter", "self.oclAsType(DecomposableCoreElement).oclIsInvalid()",
         "ContextualElementContext", "self.oclAsType(DecomposableCoreElement).oclIsInvalid()"
       });
    addAnnotation
      (this.goalEClass,
       source,
       new String[] {
         "GoalSupporter", "\n\t\t\tlet children : Set(Supporter) = self.supportedBy.target -> closure(p | if p.oclIsKindOf(CoreElement) then p.oclAsSet() else p.oclAsType(Supportable).supportedBy.target endif) -> asSet()\n\t\t\tin children -> selectByKind(CoreElement) -> forAll(s | s.oclIsKindOf(Goal) or s.oclIsKindOf(Strategy) or s.oclIsKindOf(Solution))",
         "GoalContext", "self.inContextOf.context -> forAll(c | c.oclIsKindOf(Context) or c.oclIsKindOf(Assumption) or c.oclIsKindOf(Justification))",
         "ASILInheritance", "\n\t\t\tlet parents : Set(Goal) = self.supports.source -> closure(c | if c.oclIsKindOf(Goal) or c.oclIsKindOf(ASILDecompositionStrategy) then c.oclAsSet() else c.supports.source endif) -> selectByKind(Goal) -> asSet()\n\t\t\tin parents -> forAll(g | if g.asil = null then true else if self.asil = null then false else g.asil.value = ASILLevel::QM or (g.asil.value.toString() <= self.asil.value.toString() and self.asil.value <> ASILLevel::QM) endif endif)"
       });
    addAnnotation
      (this.strategyEClass,
       source,
       new String[] {
         "StrategySupporter", "\n\t\t\tlet children : Set(Supporter) = self.supportedBy.target -> closure(p | if p.oclIsKindOf(CoreElement) then p.oclAsSet() else p.oclAsType(Supportable).supportedBy.target endif) -> asSet() \n\t\t\tin children -> selectByKind(CoreElement) -> forAll(s | s.oclIsKindOf(Goal) or s.oclIsKindOf(Solution))",
         "StrategyContext", "self.inContextOf.context -> forAll(c | c.oclIsKindOf(Context) or c.oclIsKindOf(Assumption) or c.oclIsKindOf(Justification))"
       });
    addAnnotation
      (this.asilDecompositionStrategyEClass,
       source,
       new String[] {
         "ASILDecompositionIndependence", "\n\t\t\tlet children = self.supportedBy.target -> closure(s | if s.oclIsKindOf(SupportConnector) then s.oclAsType(SupportConnector).supportedBy.target else s.oclAsSet() endif)\n\t\t\tin children -> selectByType(IndependenceGoal) -> size() = 1",
         "ASILDecompositionComponents", " \n\t\t\tlet children = self.supportedBy.target -> closure(s | if s.oclIsKindOf(SupportConnector) then s.oclAsType(SupportConnector).supportedBy.target else s.oclAsSet() endif)\n\t\t\tin children -> selectByType(BasicGoal) -> size() = 2",
         "ASILDescendants", "\n\t\t\tlet goalSeq = self.supportedBy.target -> closure(s | if s.oclIsKindOf(SupportConnector) then s.oclAsType(SupportConnector).supportedBy.target else s.oclAsSet() endif) -> select(p | p.oclIsTypeOf(BasicGoal)), \n\t\t\tg1Descendants : Set(Supporter) = goalSeq -> at(1) -> closure(c | \n\t\t\t\t\tif c.oclIsKindOf(Supportable) then c.oclAsType(Supportable).supportedBy.target else null endif),\n\t\t\tg2Descendants : Set(Supporter) = goalSeq -> at(2) -> closure(c | \n\t\t\t\t\tif c.oclIsKindOf(Supportable) then c.oclAsType(Supportable).supportedBy.target else null endif) \n\t\t\tin g1Descendants -> intersection(g2Descendants) = Set{}"
       });
    addAnnotation
      (this.solutionEClass,
       source,
       new String[] {
         "SolutionSupporter", "self.oclAsType(DecomposableCoreElement).oclIsInvalid()",
         "SolutionContext", "self.oclAsType(DecomposableCoreElement).oclIsInvalid()"
       });
    addAnnotation
      (this.supportableEClass,
       source,
       new String[] {
         "SupportCycle", "self.supportedBy.target -> closure(p | if p.oclIsKindOf(Supportable) then \n\t\t\tp.oclAsType(Supportable).supportedBy.target else \n\t\t\tp.oclAsSet() endif) -> excludes(self)",
         "NonSupportableLeaves", "self.supportedBy.target -> size() > 0 and self.supportedBy.target -> excludes(null)"
       });
    addAnnotation
      (this.supporterEClass,
       source,
       new String[] {
         "GoalRoot", "self.supports.source -> isEmpty() implies self.oclIsTypeOf(BasicGoal)"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.label</b>.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations() {
    var source = "gmf.label";
    addAnnotation
      (getArgumentElement_Description(),
       source,
       new String[] {
         "label", "description"
       });
  }

} // GSNPackageImpl
