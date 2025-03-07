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
package edu.toronto.cs.se.modelepedia.gsn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import edu.toronto.cs.se.modelepedia.gsn.ASIL;
import edu.toronto.cs.se.modelepedia.gsn.ASILDecompositionStrategy;
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
import edu.toronto.cs.se.modelepedia.gsn.GSNPackage;
import edu.toronto.cs.se.modelepedia.gsn.Goal;
import edu.toronto.cs.se.modelepedia.gsn.ImpactAnnotation;
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
import edu.toronto.cs.se.modelepedia.gsn.ValueDomain;
import edu.toronto.cs.se.modelepedia.gsn.XorSupporter;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage
 * @generated
 */
public class GSNSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected static GSNPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public GSNSwitch() {
    if (GSNSwitch.modelPackage == null) {
      GSNSwitch.modelPackage = GSNPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == GSNSwitch.modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
      case GSNPackage.SAFETY_CASE: {
        var safetyCase = (SafetyCase)theEObject;
        var result = caseSafetyCase(safetyCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ARGUMENT_ELEMENT: {
        var argumentElement = (ArgumentElement)theEObject;
        var result = caseArgumentElement(argumentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.STATEFUL_ELEMENT: {
        var statefulElement = (StatefulElement)theEObject;
        var result = caseStatefulElement(statefulElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ASI_LFUL_ELEMENT: {
        var asiLfulElement = (ASILfulElement)theEObject;
        var result = caseASILfulElement(asiLfulElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.CORE_ELEMENT: {
        var coreElement = (CoreElement)theEObject;
        var result = caseCoreElement(coreElement);
        if (result == null) result = caseArgumentElement(coreElement);
        if (result == null) result = caseSupporter(coreElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DECOMPOSABLE_CORE_ELEMENT: {
        var decomposableCoreElement = (DecomposableCoreElement)theEObject;
        var result = caseDecomposableCoreElement(decomposableCoreElement);
        if (result == null) result = caseSupportable(decomposableCoreElement);
        if (result == null) result = caseCoreElement(decomposableCoreElement);
        if (result == null) result = caseSupporter(decomposableCoreElement);
        if (result == null) result = caseArgumentElement(decomposableCoreElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.CONTEXTUAL_ELEMENT: {
        var contextualElement = (ContextualElement)theEObject;
        var result = caseContextualElement(contextualElement);
        if (result == null) result = caseArgumentElement(contextualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.SUPPORTED_BY: {
        var supportedBy = (SupportedBy)theEObject;
        var result = caseSupportedBy(supportedBy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.IN_CONTEXT_OF: {
        var inContextOf = (InContextOf)theEObject;
        var result = caseInContextOf(inContextOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.GOAL: {
        var goal = (Goal)theEObject;
        var result = caseGoal(goal);
        if (result == null) result = caseDecomposableCoreElement(goal);
        if (result == null) result = caseStatefulElement(goal);
        if (result == null) result = caseASILfulElement(goal);
        if (result == null) result = caseSupportable(goal);
        if (result == null) result = caseCoreElement(goal);
        if (result == null) result = caseSupporter(goal);
        if (result == null) result = caseArgumentElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.BASIC_GOAL: {
        var basicGoal = (BasicGoal)theEObject;
        var result = caseBasicGoal(basicGoal);
        if (result == null) result = caseGoal(basicGoal);
        if (result == null) result = caseDecomposableCoreElement(basicGoal);
        if (result == null) result = caseStatefulElement(basicGoal);
        if (result == null) result = caseASILfulElement(basicGoal);
        if (result == null) result = caseSupportable(basicGoal);
        if (result == null) result = caseCoreElement(basicGoal);
        if (result == null) result = caseSupporter(basicGoal);
        if (result == null) result = caseArgumentElement(basicGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.INDEPENDENCE_GOAL: {
        var independenceGoal = (IndependenceGoal)theEObject;
        var result = caseIndependenceGoal(independenceGoal);
        if (result == null) result = caseGoal(independenceGoal);
        if (result == null) result = caseDecomposableCoreElement(independenceGoal);
        if (result == null) result = caseStatefulElement(independenceGoal);
        if (result == null) result = caseASILfulElement(independenceGoal);
        if (result == null) result = caseSupportable(independenceGoal);
        if (result == null) result = caseCoreElement(independenceGoal);
        if (result == null) result = caseSupporter(independenceGoal);
        if (result == null) result = caseArgumentElement(independenceGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.STRATEGY: {
        var strategy = (Strategy)theEObject;
        var result = caseStrategy(strategy);
        if (result == null) result = caseDecomposableCoreElement(strategy);
        if (result == null) result = caseSupportable(strategy);
        if (result == null) result = caseCoreElement(strategy);
        if (result == null) result = caseSupporter(strategy);
        if (result == null) result = caseArgumentElement(strategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.BASIC_STRATEGY: {
        var basicStrategy = (BasicStrategy)theEObject;
        var result = caseBasicStrategy(basicStrategy);
        if (result == null) result = caseStrategy(basicStrategy);
        if (result == null) result = caseDecomposableCoreElement(basicStrategy);
        if (result == null) result = caseSupportable(basicStrategy);
        if (result == null) result = caseCoreElement(basicStrategy);
        if (result == null) result = caseSupporter(basicStrategy);
        if (result == null) result = caseArgumentElement(basicStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ASIL_DECOMPOSITION_STRATEGY: {
        var asilDecompositionStrategy = (ASILDecompositionStrategy)theEObject;
        var result = caseASILDecompositionStrategy(asilDecompositionStrategy);
        if (result == null) result = caseStrategy(asilDecompositionStrategy);
        if (result == null) result = caseDecomposableCoreElement(asilDecompositionStrategy);
        if (result == null) result = caseSupportable(asilDecompositionStrategy);
        if (result == null) result = caseCoreElement(asilDecompositionStrategy);
        if (result == null) result = caseSupporter(asilDecompositionStrategy);
        if (result == null) result = caseArgumentElement(asilDecompositionStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.SOLUTION: {
        var solution = (Solution)theEObject;
        var result = caseSolution(solution);
        if (result == null) result = caseCoreElement(solution);
        if (result == null) result = caseStatefulElement(solution);
        if (result == null) result = caseArgumentElement(solution);
        if (result == null) result = caseSupporter(solution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.CONTEXT: {
        var context = (Context)theEObject;
        var result = caseContext(context);
        if (result == null) result = caseContextualElement(context);
        if (result == null) result = caseArgumentElement(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.JUSTIFICATION: {
        var justification = (Justification)theEObject;
        var result = caseJustification(justification);
        if (result == null) result = caseContextualElement(justification);
        if (result == null) result = caseArgumentElement(justification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ASSUMPTION: {
        var assumption = (Assumption)theEObject;
        var result = caseAssumption(assumption);
        if (result == null) result = caseContextualElement(assumption);
        if (result == null) result = caseArgumentElement(assumption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ASIL: {
        var asil = (ASIL)theEObject;
        var result = caseASIL(asil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.IMPACT_ANNOTATION: {
        var impactAnnotation = (ImpactAnnotation)theEObject;
        var result = caseImpactAnnotation(impactAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.SUPPORTABLE: {
        var supportable = (Supportable)theEObject;
        var result = caseSupportable(supportable);
        if (result == null) result = caseSupporter(supportable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.SUPPORTER: {
        var supporter = (Supporter)theEObject;
        var result = caseSupporter(supporter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.SUPPORT_CONNECTOR: {
        var supportConnector = (SupportConnector)theEObject;
        var result = caseSupportConnector(supportConnector);
        if (result == null) result = caseSupportable(supportConnector);
        if (result == null) result = caseSupporter(supportConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.AND_SUPPORTER: {
        var andSupporter = (AndSupporter)theEObject;
        var result = caseAndSupporter(andSupporter);
        if (result == null) result = caseSupportConnector(andSupporter);
        if (result == null) result = caseSupportable(andSupporter);
        if (result == null) result = caseSupporter(andSupporter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.OR_SUPPORTER: {
        var orSupporter = (OrSupporter)theEObject;
        var result = caseOrSupporter(orSupporter);
        if (result == null) result = caseSupportConnector(orSupporter);
        if (result == null) result = caseSupportable(orSupporter);
        if (result == null) result = caseSupporter(orSupporter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.XOR_SUPPORTER: {
        var xorSupporter = (XorSupporter)theEObject;
        var result = caseXorSupporter(xorSupporter);
        if (result == null) result = caseSupportConnector(xorSupporter);
        if (result == null) result = caseSupportable(xorSupporter);
        if (result == null) result = caseSupporter(xorSupporter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.MOF_NSUPPORTER: {
        var mofNSupporter = (MofNSupporter)theEObject;
        var result = caseMofNSupporter(mofNSupporter);
        if (result == null) result = caseSupportConnector(mofNSupporter);
        if (result == null) result = caseSupportable(mofNSupporter);
        if (result == null) result = caseSupporter(mofNSupporter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DECOMPOSITION_STRATEGY: {
        var decompositionStrategy = (DecompositionStrategy)theEObject;
        var result = caseDecompositionStrategy(decompositionStrategy);
        if (result == null) result = caseStrategy(decompositionStrategy);
        if (result == null) result = caseDecomposableCoreElement(decompositionStrategy);
        if (result == null) result = caseSupportable(decompositionStrategy);
        if (result == null) result = caseCoreElement(decompositionStrategy);
        if (result == null) result = caseSupporter(decompositionStrategy);
        if (result == null) result = caseArgumentElement(decompositionStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DOMAIN: {
        var domain = (Domain)theEObject;
        var result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.INT_DOMAIN: {
        var intDomain = (IntDomain)theEObject;
        var result = caseIntDomain(intDomain);
        if (result == null) result = caseDomain(intDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.REAL_DOMAIN: {
        var realDomain = (RealDomain)theEObject;
        var result = caseRealDomain(realDomain);
        if (result == null) result = caseDomain(realDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.ENUM_DOMAIN: {
        var enumDomain = (EnumDomain)theEObject;
        var result = caseEnumDomain(enumDomain);
        if (result == null) result = caseDomain(enumDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.VALUE_DOMAIN: {
        var valueDomain = (ValueDomain)theEObject;
        var result = caseValueDomain(valueDomain);
        if (result == null) result = caseDomain(valueDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DOMAIN_DECOMPOSITION_ELEMENT: {
        var domainDecompositionElement = (DomainDecompositionElement)theEObject;
        var result = caseDomainDecompositionElement(domainDecompositionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DOMAIN_DECOMPOSITION_STRATEGY: {
        var domainDecompositionStrategy = (DomainDecompositionStrategy)theEObject;
        var result = caseDomainDecompositionStrategy(domainDecompositionStrategy);
        if (result == null) result = caseDecompositionStrategy(domainDecompositionStrategy);
        if (result == null) result = caseDomainDecompositionElement(domainDecompositionStrategy);
        if (result == null) result = caseStrategy(domainDecompositionStrategy);
        if (result == null) result = caseDecomposableCoreElement(domainDecompositionStrategy);
        if (result == null) result = caseSupportable(domainDecompositionStrategy);
        if (result == null) result = caseCoreElement(domainDecompositionStrategy);
        if (result == null) result = caseSupporter(domainDecompositionStrategy);
        if (result == null) result = caseArgumentElement(domainDecompositionStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.DOMAIN_GOAL: {
        var domainGoal = (DomainGoal)theEObject;
        var result = caseDomainGoal(domainGoal);
        if (result == null) result = caseGoal(domainGoal);
        if (result == null) result = caseDomainDecompositionElement(domainGoal);
        if (result == null) result = caseDecomposableCoreElement(domainGoal);
        if (result == null) result = caseStatefulElement(domainGoal);
        if (result == null) result = caseASILfulElement(domainGoal);
        if (result == null) result = caseSupportable(domainGoal);
        if (result == null) result = caseCoreElement(domainGoal);
        if (result == null) result = caseSupporter(domainGoal);
        if (result == null) result = caseArgumentElement(domainGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.PROPERTY: {
        var property = (Property)theEObject;
        var result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.PROPERTY_DECOMPOSITION_ELEMENT: {
        var propertyDecompositionElement = (PropertyDecompositionElement)theEObject;
        var result = casePropertyDecompositionElement(propertyDecompositionElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.PROPERTY_DECOMPOSITION_STRATEGY: {
        var propertyDecompositionStrategy = (PropertyDecompositionStrategy)theEObject;
        var result = casePropertyDecompositionStrategy(propertyDecompositionStrategy);
        if (result == null) result = caseDecompositionStrategy(propertyDecompositionStrategy);
        if (result == null) result = casePropertyDecompositionElement(propertyDecompositionStrategy);
        if (result == null) result = caseStrategy(propertyDecompositionStrategy);
        if (result == null) result = caseDecomposableCoreElement(propertyDecompositionStrategy);
        if (result == null) result = caseSupportable(propertyDecompositionStrategy);
        if (result == null) result = caseCoreElement(propertyDecompositionStrategy);
        if (result == null) result = caseSupporter(propertyDecompositionStrategy);
        if (result == null) result = caseArgumentElement(propertyDecompositionStrategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GSNPackage.PROPERTY_GOAL: {
        var propertyGoal = (PropertyGoal)theEObject;
        var result = casePropertyGoal(propertyGoal);
        if (result == null) result = caseGoal(propertyGoal);
        if (result == null) result = casePropertyDecompositionElement(propertyGoal);
        if (result == null) result = caseDecomposableCoreElement(propertyGoal);
        if (result == null) result = caseStatefulElement(propertyGoal);
        if (result == null) result = caseASILfulElement(propertyGoal);
        if (result == null) result = caseSupportable(propertyGoal);
        if (result == null) result = caseCoreElement(propertyGoal);
        if (result == null) result = caseSupporter(propertyGoal);
        if (result == null) result = caseArgumentElement(propertyGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Safety Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Safety Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSafetyCase(SafetyCase object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentElement(ArgumentElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateful Element</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateful Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatefulElement(StatefulElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASI Lful Element</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASI Lful Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASILfulElement(ASILfulElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Core Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Core Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoreElement(CoreElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposable Core Element</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposable Core Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecomposableCoreElement(DecomposableCoreElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextualElement(ContextualElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supported By</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supported By</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportedBy(SupportedBy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>In Context Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>In Context Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInContextOf(InContextOf object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Goal</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicGoal(BasicGoal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Independence Goal</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Independence Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndependenceGoal(IndependenceGoal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainGoal(DomainGoal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Decomposition Element</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Decomposition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDecompositionElement(PropertyDecompositionElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Decomposition Strategy</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Decomposition Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyDecompositionStrategy(PropertyDecompositionStrategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyGoal(PropertyGoal object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategy(Strategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicStrategy(BasicStrategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASIL Decomposition Strategy</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASIL Decomposition Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASILDecompositionStrategy(ASILDecompositionStrategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSolution(Solution object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJustification(Justification object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssumption(Assumption object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ASIL</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ASIL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseASIL(ASIL object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impact Annotation</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impact Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImpactAnnotation(ImpactAnnotation object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supportable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supportable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportable(Supportable object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supporter</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supporter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupporter(Supporter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Support Connector</em>'.
   * <!-- begin-user-doc
   * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Support Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupportConnector(SupportConnector object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Supporter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Supporter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndSupporter(AndSupporter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Supporter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Supporter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrSupporter(OrSupporter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Xor Supporter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Xor Supporter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXorSupporter(XorSupporter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mof NSupporter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mof NSupporter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMofNSupporter(MofNSupporter object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition Strategy</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecompositionStrategy(DecompositionStrategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Domain</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntDomain(IntDomain object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealDomain(RealDomain object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDomain(EnumDomain object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueDomain(ValueDomain object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Decomposition Element</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Decomposition Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainDecompositionElement(DomainDecompositionElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Decomposition Strategy</em>'. <!--
   * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
   * end-user-doc -->
   *
   * @param object
   *          the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Decomposition Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainDecompositionStrategy(DomainDecompositionStrategy object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc --> This
   * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
   * anyway. <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} // GSNSwitch
