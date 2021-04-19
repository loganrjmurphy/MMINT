/**
 */
package edu.toronto.cs.se.mmint.productline.util;

import edu.toronto.cs.se.mmint.productline.Attribute;
import edu.toronto.cs.se.mmint.productline.PLElement;
import edu.toronto.cs.se.mmint.productline.ProductLine;
import edu.toronto.cs.se.mmint.productline.ProductLinePackage;
import edu.toronto.cs.se.mmint.productline.Reference;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.se.mmint.productline.ProductLinePackage
 * @generated
 */
public class ProductLineSwitch<T> extends Switch<T> {
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProductLinePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductLineSwitch() {
    if (modelPackage == null) {
      modelPackage = ProductLinePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID) {
    case ProductLinePackage.PRODUCT_LINE: {
      ProductLine productLine = (ProductLine) theEObject;
      T result = caseProductLine(productLine);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case ProductLinePackage.PL_ELEMENT: {
      PLElement plElement = (PLElement) theEObject;
      T result = casePLElement(plElement);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case ProductLinePackage.CLASS: {
      edu.toronto.cs.se.mmint.productline.Class class_ = (edu.toronto.cs.se.mmint.productline.Class) theEObject;
      T result = caseClass(class_);
      if (result == null)
        result = casePLElement(class_);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case ProductLinePackage.REFERENCE: {
      Reference reference = (Reference) theEObject;
      T result = caseReference(reference);
      if (result == null)
        result = casePLElement(reference);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    case ProductLinePackage.ATTRIBUTE: {
      Attribute attribute = (Attribute) theEObject;
      T result = caseAttribute(attribute);
      if (result == null)
        result = casePLElement(attribute);
      if (result == null)
        result = defaultCase(theEObject);
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Line</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Line</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductLine(ProductLine object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PL Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PL Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePLElement(PLElement object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(edu.toronto.cs.se.mmint.productline.Class object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object) {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object) {
    return null;
  }

} //ProductLineSwitch
