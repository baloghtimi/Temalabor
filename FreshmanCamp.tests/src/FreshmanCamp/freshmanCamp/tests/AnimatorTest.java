/**
 */
package FreshmanCamp.freshmanCamp.tests;

import FreshmanCamp.freshmanCamp.Animator;
import FreshmanCamp.freshmanCamp.FreshmanCampFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Animator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnimatorTest extends SeniorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnimatorTest.class);
	}

	/**
	 * Constructs a new Animator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnimatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Animator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Animator getFixture() {
		return (Animator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FreshmanCampFactory.eINSTANCE.createAnimator());
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

} //AnimatorTest
