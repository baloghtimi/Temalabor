/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operative Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getSuperior <em>Superior</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getInferiors <em>Inferiors</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer()
 * @model
 * @generated
 */
public interface OperativeOrganizer extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' attribute.
   * @see #setYear(int)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getYear <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' attribute.
   * @see #getYear()
   * @generated
   */
  void setYear(int value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.ColorType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.ColorType
   * @see #setColor(ColorType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer_Color()
   * @model
   * @generated
   */
  ColorType getColor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.OperativeOrganizer#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.ColorType
   * @see #getColor()
   * @generated
   */
  void setColor(ColorType value);

  /**
   * Returns the value of the '<em><b>Superior</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.OperativeOrganizer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superior</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superior</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer_Superior()
   * @model
   * @generated
   */
  EList<OperativeOrganizer> getSuperior();

  /**
   * Returns the value of the '<em><b>Inferiors</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.OperativeOrganizer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inferiors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inferiors</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getOperativeOrganizer_Inferiors()
   * @model
   * @generated
   */
  EList<OperativeOrganizer> getInferiors();

} // OperativeOrganizer
