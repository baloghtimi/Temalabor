/**
 */
package FreshmanCamp.freshmanCamp.tests;

import FreshmanCamp.freshmanCamp.FreshmanCampFactory;
import FreshmanCamp.freshmanCamp.OperativeOrganizer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operative Organizer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperativeOrganizerTest extends SeniorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperativeOrganizerTest.class);
	}

	/**
	 * Constructs a new Operative Organizer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeOrganizerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operative Organizer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperativeOrganizer getFixture() {
		return (OperativeOrganizer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FreshmanCampFactory.eINSTANCE.createOperativeOrganizer());
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

} //OperativeOrganizerTest
