/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RoomSenior#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RoomSenior#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RoomSenior#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RoomSenior#getCard <em>Card</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.RoomSenior#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior()
 * @model
 * @generated
 */
public interface RoomSenior extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RoomSenior#getName <em>Name</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior_Year()
   * @model
   * @generated
   */
  int getYear();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RoomSenior#getYear <em>Year</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior_Color()
   * @model
   * @generated
   */
  ColorType getColor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RoomSenior#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.ColorType
   * @see #getColor()
   * @generated
   */
  void setColor(ColorType value);

  /**
   * Returns the value of the '<em><b>Card</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.CardType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Card</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Card</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.CardType
   * @see #setCard(CardType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior_Card()
   * @model
   * @generated
   */
  CardType getCard();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.RoomSenior#getCard <em>Card</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Card</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.CardType
   * @see #getCard()
   * @generated
   */
  void setCard(CardType value);

  /**
   * Returns the value of the '<em><b>Superior</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.CardSenior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superior</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superior</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getRoomSenior_Superior()
   * @model
   * @generated
   */
  EList<CardSenior> getSuperior();

} // RoomSenior
