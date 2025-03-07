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

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mof NSupporter</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.gsn.MofNSupporter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getMofNSupporter()
 * @model
 * @generated
 */
public interface MofNSupporter extends SupportConnector {
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute. The default value is <code>"1"</code>. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   *
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(long)
   * @see edu.toronto.cs.se.modelepedia.gsn.GSNPackage#getMofNSupporter_Target()
   * @model default="1" required="true"
   * @generated
   */
  long getTarget();

  /**
   * Sets the value of the '{@link edu.toronto.cs.se.modelepedia.gsn.MofNSupporter#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(long value);

} // MofNSupporter
