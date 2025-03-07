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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Decomposable Core Element</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.gsn.DecomposableCoreElement#getInContextOf <em>In Context Of</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getDecomposableCoreElement()
 * @model abstract="true"
 * @generated
 */
public interface DecomposableCoreElement extends Supportable, CoreElement {
  /**
   * Returns the value of the '<em><b>In Context Of</b></em>' containment reference list.
   * The list contents are of type {@link edu.toronto.cs.se.modelepedia.gsn.InContextOf}.
   * It is bidirectional and its opposite is '{@link edu.toronto.cs.se.modelepedia.gsn.InContextOf#getContextOf <em>Context Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Context Of</em>' containment reference list.
   * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getDecomposableCoreElement_InContextOf()
   * @see edu.toronto.cs.se.modelepedia.gsn.InContextOf#getContextOf
   * @model opposite="contextOf" containment="true"
   * @generated
   */
  EList<InContextOf> getInContextOf();

} // DecomposableCoreElement
