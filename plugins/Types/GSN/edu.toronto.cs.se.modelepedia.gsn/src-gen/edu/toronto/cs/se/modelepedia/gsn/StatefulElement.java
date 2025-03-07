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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Stateful Element</b></em>'. <!-- end-user-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edu.toronto.cs.se.modelepedia.gsn.StatefulElement#getStateValidity <em>State Validity</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getStatefulElement()
 * @model abstract="true"
 * @generated
 */
public interface StatefulElement extends EObject {
  /**
   * Returns the value of the '<em><b>State Validity</b></em>' attribute.
   * The literals are from the enumeration {@link edu.toronto.cs.se.modelepedia.gsn.ValidityValue}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of the '<em>State Validity</em>' attribute.
   * @see edu.toronto.cs.se.modelepedia.gsn.ValidityValue
   * @see #setStateValidity(ValidityValue)
   * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getStatefulElement_StateValidity()
   * @model
   * @generated
   */
  ValidityValue getStateValidity();

  /**
   * Sets the value of the '{@link edu.toronto.cs.se.modelepedia.gsn.StatefulElement#getStateValidity <em>State Validity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>State Validity</em>' attribute.
   * @see edu.toronto.cs.se.modelepedia.gsn.ValidityValue
   * @see #getStateValidity()
   * @generated
   */
  void setStateValidity(ValidityValue value);

} // StatefulElement
