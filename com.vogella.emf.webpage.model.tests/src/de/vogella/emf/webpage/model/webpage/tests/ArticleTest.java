/**
 */
package de.vogella.emf.webpage.model.webpage.tests;

import de.vogella.emf.webpage.model.webpage.Article;
import de.vogella.emf.webpage.model.webpage.WebpageFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArticleTest extends TestCase {

	/**
	 * The fixture for this Article test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Article fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArticleTest.class);
	}

	/**
	 * Constructs a new Article test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArticleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Article test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Article fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Article test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Article getFixture() {
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
		setFixture(WebpageFactory.eINSTANCE.createArticle());
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

} //ArticleTest
