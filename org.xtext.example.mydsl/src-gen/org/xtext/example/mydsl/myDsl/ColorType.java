/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.myDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getColorType()
 * @model
 * @generated
 */
public enum ColorType implements Enumerator
{
  /**
   * The '<em><b>Black Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLACK_COLOR_VALUE
   * @generated
   * @ordered
   */
  BLACK_COLOR(0, "BlackColor", "BlackColor"),

  /**
   * The '<em><b>Blue Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLUE_COLOR_VALUE
   * @generated
   * @ordered
   */
  BLUE_COLOR(1, "BlueColor", "BlueColor"),

  /**
   * The '<em><b>Red Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RED_COLOR_VALUE
   * @generated
   * @ordered
   */
  RED_COLOR(2, "RedColor", "RedColor"),

  /**
   * The '<em><b>White Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHITE_COLOR_VALUE
   * @generated
   * @ordered
   */
  WHITE_COLOR(3, "WhiteColor", "WhiteColor"),

  /**
   * The '<em><b>Yellow Color</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #YELLOW_COLOR_VALUE
   * @generated
   * @ordered
   */
  YELLOW_COLOR(4, "YellowColor", "YellowColor");

  /**
   * The '<em><b>Black Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Black Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLACK_COLOR
   * @model name="BlackColor"
   * @generated
   * @ordered
   */
  public static final int BLACK_COLOR_VALUE = 0;

  /**
   * The '<em><b>Blue Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Blue Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLUE_COLOR
   * @model name="BlueColor"
   * @generated
   * @ordered
   */
  public static final int BLUE_COLOR_VALUE = 1;

  /**
   * The '<em><b>Red Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Red Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RED_COLOR
   * @model name="RedColor"
   * @generated
   * @ordered
   */
  public static final int RED_COLOR_VALUE = 2;

  /**
   * The '<em><b>White Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>White Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHITE_COLOR
   * @model name="WhiteColor"
   * @generated
   * @ordered
   */
  public static final int WHITE_COLOR_VALUE = 3;

  /**
   * The '<em><b>Yellow Color</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Yellow Color</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #YELLOW_COLOR
   * @model name="YellowColor"
   * @generated
   * @ordered
   */
  public static final int YELLOW_COLOR_VALUE = 4;

  /**
   * An array of all the '<em><b>Color Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ColorType[] VALUES_ARRAY =
    new ColorType[]
    {
      BLACK_COLOR,
      BLUE_COLOR,
      RED_COLOR,
      WHITE_COLOR,
      YELLOW_COLOR,
    };

  /**
   * A public read-only list of all the '<em><b>Color Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ColorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Color Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ColorType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ColorType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ColorType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ColorType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Color Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ColorType get(int value)
  {
    switch (value)
    {
      case BLACK_COLOR_VALUE: return BLACK_COLOR;
      case BLUE_COLOR_VALUE: return BLUE_COLOR;
      case RED_COLOR_VALUE: return RED_COLOR;
      case WHITE_COLOR_VALUE: return WHITE_COLOR;
      case YELLOW_COLOR_VALUE: return YELLOW_COLOR;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ColorType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ColorType
