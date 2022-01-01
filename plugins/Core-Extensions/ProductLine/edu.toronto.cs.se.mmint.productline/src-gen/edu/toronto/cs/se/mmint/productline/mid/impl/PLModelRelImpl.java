/*******************************************************************************
 * Copyright (c) 2021, 2022 Alessio Di Sandro.
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
package edu.toronto.cs.se.mmint.productline.mid.impl;

import org.eclipse.emf.ecore.EClass;

import edu.toronto.cs.se.mmint.mid.relationship.impl.ModelRelImpl;
import edu.toronto.cs.se.mmint.productline.mid.PLModelRel;
import edu.toronto.cs.se.mmint.productline.mid.ProductLineMIDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PL Model Rel</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PLModelRelImpl extends ModelRelImpl implements PLModelRel {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PLModelRelImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ProductLineMIDPackage.Literals.PL_MODEL_REL;
  }

} //PLModelRelImpl
