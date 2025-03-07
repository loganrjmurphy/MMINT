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
package edu.toronto.cs.se.modelepedia.gsn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage
 * @generated
 */
public interface GSNFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  GSNFactory eINSTANCE = edu.toronto.cs.se.modelepedia.gsn.impl.GSNFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Safety Case</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Safety Case</em>'.
   * @generated
   */
  SafetyCase createSafetyCase();

  /**
   * Returns a new object of class '<em>Supported By</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Supported By</em>'.
   * @generated
   */
  SupportedBy createSupportedBy();

  /**
   * Returns a new object of class '<em>In Context Of</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>In Context Of</em>'.
   * @generated
   */
  InContextOf createInContextOf();

  /**
   * Returns a new object of class '<em>Basic Goal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Goal</em>'.
   * @generated
   */
  BasicGoal createBasicGoal();

  /**
   * Returns a new object of class '<em>Independence Goal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Independence Goal</em>'.
   * @generated
   */
  IndependenceGoal createIndependenceGoal();

  /**
   * Returns a new object of class '<em>Domain Goal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Goal</em>'.
   * @generated
   */
  DomainGoal createDomainGoal();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Property Decomposition Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @return a new object of class '<em>Property Decomposition Strategy</em>'.
   * @generated
   */
  PropertyDecompositionStrategy createPropertyDecompositionStrategy();

  /**
   * Returns a new object of class '<em>Property Goal</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Property Goal</em>'.
   * @generated
   */
  PropertyGoal createPropertyGoal();

  /**
   * Returns a new object of class '<em>Basic Strategy</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Strategy</em>'.
   * @generated
   */
  BasicStrategy createBasicStrategy();

  /**
   * Returns a new object of class '<em>ASIL Decomposition Strategy</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>ASIL Decomposition Strategy</em>'.
   * @generated
   */
  ASILDecompositionStrategy createASILDecompositionStrategy();

  /**
   * Returns a new object of class '<em>Solution</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Solution</em>'.
   * @generated
   */
  Solution createSolution();

  /**
   * Returns a new object of class '<em>Context</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Context</em>'.
   * @generated
   */
  Context createContext();

  /**
   * Returns a new object of class '<em>Justification</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Justification</em>'.
   * @generated
   */
  Justification createJustification();

  /**
   * Returns a new object of class '<em>Assumption</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Assumption</em>'.
   * @generated
   */
  Assumption createAssumption();

  /**
   * Returns a new object of class '<em>ASIL</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>ASIL</em>'.
   * @generated
   */
  ASIL createASIL();

  /**
   * Returns a new object of class '<em>Impact Annotation</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Impact Annotation</em>'.
   * @generated
   */
  ImpactAnnotation createImpactAnnotation();

  /**
   * Returns a new object of class '<em>And Supporter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>And Supporter</em>'.
   * @generated
   */
  AndSupporter createAndSupporter();

  /**
   * Returns a new object of class '<em>Or Supporter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Or Supporter</em>'.
   * @generated
   */
  OrSupporter createOrSupporter();

  /**
   * Returns a new object of class '<em>Xor Supporter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Supporter</em>'.
   * @generated
   */
  XorSupporter createXorSupporter();

  /**
   * Returns a new object of class '<em>Mof NSupporter</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Mof NSupporter</em>'.
   * @generated
   */
  MofNSupporter createMofNSupporter();

  /**
   * Returns a new object of class '<em>Int Domain</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Int Domain</em>'.
   * @generated
   */
  IntDomain createIntDomain();

  /**
   * Returns a new object of class '<em>Real Domain</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Real Domain</em>'.
   * @generated
   */
  RealDomain createRealDomain();

  /**
   * Returns a new object of class '<em>Enum Domain</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Domain</em>'.
   * @generated
   */
  EnumDomain createEnumDomain();

  /**
   * Returns a new object of class '<em>Value Domain</em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return a new object of class '<em>Value Domain</em>'.
   * @generated
   */
  ValueDomain createValueDomain();

  /**
   * Returns a new object of class '<em>Domain Decomposition Strategy</em>'. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   *
   * @return a new object of class '<em>Domain Decomposition Strategy</em>'.
   * @generated
   */
  DomainDecompositionStrategy createDomainDecompositionStrategy();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GSNPackage getGSNPackage();

} // GSNFactory
