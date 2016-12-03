/**
 */
package de.vogella.emf.webpage.model.webpage.tests;

import de.vogella.emf.webpage.model.webpage.Web;
import de.vogella.emf.webpage.model.webpage.WebpageFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Web</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebTest extends TestCase {

	/**
	 * The fixture for this Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Web fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebTest.class);
	}

	/**
	 * Constructs a new Web test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Web fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Web test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Web getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WebpageFactory.eINSTANCE.createWeb());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WebTest
