/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.myDsl.CardSenior;
import org.xtext.example.mydsl.myDsl.ColorSenior;
import org.xtext.example.mydsl.myDsl.ColorType;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Senior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorSeniorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorSeniorImpl#getYear <em>Year</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorSeniorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ColorSeniorImpl#getInferiors <em>Inferiors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorSeniorImpl extends MinimalEObjectImpl.Container implements ColorSenior
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected static final int YEAR_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected int year = YEAR_EDEFAULT;

  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final ColorType COLOR_EDEFAULT = ColorType.BLACK_COLOR;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected ColorType color = COLOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getInferiors() <em>Inferiors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInferiors()
   * @generated
   * @ordered
   */
  protected EList<CardSenior> inferiors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColorSeniorImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COLOR_SENIOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR_SENIOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(int newYear)
  {
    int oldYear = year;
    year = newYear;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR_SENIOR__YEAR, oldYear, year));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorType getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(ColorType newColor)
  {
    ColorType oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.COLOR_SENIOR__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CardSenior> getInferiors()
  {
    if (inferiors == null)
    {
      inferiors = new EObjectResolvingEList<CardSenior>(CardSenior.class, this, MyDslPackage.COLOR_SENIOR__INFERIORS);
    }
    return inferiors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COLOR_SENIOR__NAME:
        return getName();
      case MyDslPackage.COLOR_SENIOR__YEAR:
        return getYear();
      case MyDslPackage.COLOR_SENIOR__COLOR:
        return getColor();
      case MyDslPackage.COLOR_SENIOR__INFERIORS:
        return getInferiors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COLOR_SENIOR__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.COLOR_SENIOR__YEAR:
        setYear((Integer)newValue);
        return;
      case MyDslPackage.COLOR_SENIOR__COLOR:
        setColor((ColorType)newValue);
        return;
      case MyDslPackage.COLOR_SENIOR__INFERIORS:
        getInferiors().clear();
        getInferiors().addAll((Collection<? extends CardSenior>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COLOR_SENIOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.COLOR_SENIOR__YEAR:
        setYear(YEAR_EDEFAULT);
        return;
      case MyDslPackage.COLOR_SENIOR__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case MyDslPackage.COLOR_SENIOR__INFERIORS:
        getInferiors().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COLOR_SENIOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.COLOR_SENIOR__YEAR:
        return year != YEAR_EDEFAULT;
      case MyDslPackage.COLOR_SENIOR__COLOR:
        return color != COLOR_EDEFAULT;
      case MyDslPackage.COLOR_SENIOR__INFERIORS:
        return inferiors != null && !inferiors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", year: ");
    result.append(year);
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //ColorSeniorImpl
