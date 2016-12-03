/**
 */
package de.vogella.emf.webpage.model.webpage.tests;

import de.vogella.emf.webpage.model.webpage.Webpage;
import de.vogella.emf.webpage.model.webpage.WebpageFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Webpage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WebpageTest extends TestCase {

	/**
	 * The fixture for this Webpage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Webpage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WebpageTest.class);
	}

	/**
	 * Constructs a new Webpage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebpageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Webpage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Webpage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Webpage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Webpage getFixture() {
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
		setFixture(WebpageFactory.eINSTANCE.createWebpage());
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

} //WebpageTest
