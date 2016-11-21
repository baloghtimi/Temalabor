/**
 */
package FreshmanCamp.freshmanCamp.tests;

import FreshmanCamp.freshmanCamp.Freshman;
import FreshmanCamp.freshmanCamp.FreshmanCampFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Freshman</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FreshmanTest extends ParticipantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FreshmanTest.class);
	}

	/**
	 * Constructs a new Freshman test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreshmanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Freshman test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Freshman getFixture() {
		return (Freshman)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FreshmanCampFactory.eINSTANCE.createFreshman());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FreshmanTest
