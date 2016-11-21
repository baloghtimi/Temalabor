/**
 */
package FreshmanCamp.freshmanCamp.tests;

import FreshmanCamp.freshmanCamp.FreshmanCampFactory;
import FreshmanCamp.freshmanCamp.Senior;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Senior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeniorTest extends ParticipantTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SeniorTest.class);
	}

	/**
	 * Constructs a new Senior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeniorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Senior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Senior getFixture() {
		return (Senior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FreshmanCampFactory.eINSTANCE.createSenior());
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

} //SeniorTest
