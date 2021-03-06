/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Card#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Card#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Card#getCardsenior <em>Cardsenior</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Card#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends EObject
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCard_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Card#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.CardType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.CardType
   * @see #setType(CardType)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCard_Type()
   * @model
   * @generated
   */
  CardType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Card#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.CardType
   * @see #getType()
   * @generated
   */
  void setType(CardType value);

  /**
   * Returns the value of the '<em><b>Cardsenior</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.CardSenior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardsenior</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardsenior</em>' reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCard_Cardsenior()
   * @model
   * @generated
   */
  EList<CardSenior> getCardsenior();

  /**
   * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Room}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rooms</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getCard_Rooms()
   * @model containment="true"
   * @generated
   */
  EList<Room> getRooms();

} // Card
