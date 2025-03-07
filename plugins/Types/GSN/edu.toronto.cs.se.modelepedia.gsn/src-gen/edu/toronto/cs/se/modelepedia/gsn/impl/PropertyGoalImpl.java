/*******************************************************************************
 * Copyright (c) 2020, 2022 Alessio Di Sandro.
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
package edu.toronto.cs.se.modelepedia.gsn.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.toronto.cs.se.modelepedia.gsn.GSNPackage;
import edu.toronto.cs.se.modelepedia.gsn.Property;
import edu.toronto.cs.se.modelepedia.gsn.PropertyDecompositionElement;
import edu.toronto.cs.se.modelepedia.gsn.PropertyGoal;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Property Goal</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.toronto.cs.se.modelepedia.gsn.impl.PropertyGoalImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.gsn.impl.PropertyGoalImpl#isValid <em>Valid</em>}</li>
 *   <li>{@link edu.toronto.cs.se.modelepedia.gsn.impl.PropertyGoalImpl#getHint <em>Hint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyGoalImpl extends GoalImpl implements PropertyGoal {
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Property property;

  /**
   * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValid()
   * @generated
   * @ordered
   */
  protected static final boolean VALID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isValid() <em>Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isValid()
   * @generated
   * @ordered
   */
  protected boolean valid = PropertyGoalImpl.VALID_EDEFAULT;

  /**
   * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected static final String HINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected String hint = PropertyGoalImpl.HINT_EDEFAULT;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected PropertyGoalImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return GSNPackage.Literals.PROPERTY_GOAL;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getProperty() {
    return this.property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(Property newProperty, NotificationChain msgs) {
    var oldProperty = this.property;
    this.property = newProperty;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GSNPackage.PROPERTY_GOAL__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(Property newProperty) {
    if (newProperty != this.property) {
      NotificationChain msgs = null;
      if (this.property != null)
        msgs = ((InternalEObject)this.property).eInverseRemove(this, InternalEObject.EOPPOSITE_FEATURE_BASE - GSNPackage.PROPERTY_GOAL__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, InternalEObject.EOPPOSITE_FEATURE_BASE - GSNPackage.PROPERTY_GOAL__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GSNPackage.PROPERTY_GOAL__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isValid() {
    return this.valid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValid(boolean newValid) {
    var oldValid = this.valid;
    this.valid = newValid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GSNPackage.PROPERTY_GOAL__VALID, oldValid, this.valid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHint() {
    return this.hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHint(String newHint) {
    var oldHint = this.hint;
    this.hint = newHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GSNPackage.PROPERTY_GOAL__HINT, oldHint, this.hint));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case GSNPackage.PROPERTY_GOAL__PROPERTY:
        return basicSetProperty(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case GSNPackage.PROPERTY_GOAL__PROPERTY:
        return getProperty();
      case GSNPackage.PROPERTY_GOAL__VALID:
        return isValid();
      case GSNPackage.PROPERTY_GOAL__HINT:
        return getHint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case GSNPackage.PROPERTY_GOAL__PROPERTY:
        setProperty((Property)newValue);
        return;
      case GSNPackage.PROPERTY_GOAL__VALID:
        setValid((Boolean)newValue);
        return;
      case GSNPackage.PROPERTY_GOAL__HINT:
        setHint((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case GSNPackage.PROPERTY_GOAL__PROPERTY:
        setProperty((Property)null);
        return;
      case GSNPackage.PROPERTY_GOAL__VALID:
        setValid(PropertyGoalImpl.VALID_EDEFAULT);
        return;
      case GSNPackage.PROPERTY_GOAL__HINT:
        setHint(PropertyGoalImpl.HINT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case GSNPackage.PROPERTY_GOAL__PROPERTY:
        return this.property != null;
      case GSNPackage.PROPERTY_GOAL__VALID:
        return this.valid != PropertyGoalImpl.VALID_EDEFAULT;
      case GSNPackage.PROPERTY_GOAL__HINT:
        return PropertyGoalImpl.HINT_EDEFAULT == null ? this.hint != null : !PropertyGoalImpl.HINT_EDEFAULT.equals(this.hint);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
    if (baseClass == PropertyDecompositionElement.class) {
      switch (derivedFeatureID) {
        case GSNPackage.PROPERTY_GOAL__PROPERTY: return GSNPackage.PROPERTY_DECOMPOSITION_ELEMENT__PROPERTY;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
    if (baseClass == PropertyDecompositionElement.class) {
      switch (baseFeatureID) {
        case GSNPackage.PROPERTY_DECOMPOSITION_ELEMENT__PROPERTY: return GSNPackage.PROPERTY_GOAL__PROPERTY;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (valid: ");
    result.append(this.valid);
    result.append(", hint: ");
    result.append(this.hint);
    result.append(')');
    return result.toString();
  }

} // PropertyGoalImpl
