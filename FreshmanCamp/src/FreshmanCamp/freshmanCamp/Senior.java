/**
 */
package FreshmanCamp.freshmanCamp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Senior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getSchool <em>School</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.Senior#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior()
 * @model
 * @generated
 */
public interface Senior extends Participant {
	/**
	 * Returns the value of the '<em><b>School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' attribute.
	 * @see #setSchool(String)
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_School()
	 * @model
	 * @generated
	 */
	String getSchool();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getSchool <em>School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' attribute.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(String value);

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
	 * @see FreshmanCamp.freshmanCamp.FreshmanCampPackage#getSenior_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link FreshmanCamp.freshmanCamp.Senior#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // Senior
