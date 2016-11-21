/**
 */
package FreshmanCamp.freshmanCamp.tests;

import FreshmanCamp.freshmanCamp.FreshmanCampFactory;
import FreshmanCamp.freshmanCamp.Participant;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParticipantTest extends TestCase {

	/**
	 * The fixture for this Participant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Participant fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParticipantTest.class);
	}

	/**
	 * Constructs a new Participant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Participant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Participant fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Participant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Participant getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FreshmanCampFactory.eINSTANCE.createParticipant());
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

} //ParticipantTest
