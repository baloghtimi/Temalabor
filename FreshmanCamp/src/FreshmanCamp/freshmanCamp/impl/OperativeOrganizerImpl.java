/**
 */
package FreshmanCamp.freshmanCamp.impl;

import FreshmanCamp.freshmanCamp.FreshmanCampPackage;
import FreshmanCamp.freshmanCamp.OperativeOrganizer;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Organizer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.OperativeOrganizerImpl#getInferiors <em>Inferiors</em>}</li>
 *   <li>{@link FreshmanCamp.freshmanCamp.impl.OperativeOrganizerImpl#getSuperior <em>Superior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperativeOrganizerImpl extends SeniorImpl implements OperativeOrganizer {
	/**
	 * The cached value of the '{@link #getInferiors() <em>Inferiors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInferiors()
	 * @generated
	 * @ordered
	 */
	protected EList inferiors;

	/**
	 * The cached value of the '{@link #getSuperior() <em>Superior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperior()
	 * @generated
	 * @ordered
	 */
	protected OperativeOrganizer superior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FreshmanCampPackage.Literals.OPERATIVE_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInferiors() {
		if (inferiors == null) {
			inferiors = new EObjectWithInverseResolvingEList(OperativeOrganizer.class, this, FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS, FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR);
		}
		return inferiors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeOrganizer getSuperior() {
		if (superior != null && superior.eIsProxy()) {
			InternalEObject oldSuperior = (InternalEObject)superior;
			superior = (OperativeOrganizer)eResolveProxy(oldSuperior);
			if (superior != oldSuperior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR, oldSuperior, superior));
			}
		}
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeOrganizer basicGetSuperior() {
		return superior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperior(OperativeOrganizer newSuperior, NotificationChain msgs) {
		OperativeOrganizer oldSuperior = superior;
		superior = newSuperior;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR, oldSuperior, newSuperior);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperior(OperativeOrganizer newSuperior) {
		if (newSuperior != superior) {
			NotificationChain msgs = null;
			if (superior != null)
				msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS, OperativeOrganizer.class, msgs);
			if (newSuperior != null)
				msgs = ((InternalEObject)newSuperior).eInverseAdd(this, FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS, OperativeOrganizer.class, msgs);
			msgs = basicSetSuperior(newSuperior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR, newSuperior, newSuperior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				return ((InternalEList)getInferiors()).basicAdd(otherEnd, msgs);
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				if (superior != null)
					msgs = ((InternalEObject)superior).eInverseRemove(this, FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS, OperativeOrganizer.class, msgs);
				return basicSetSuperior((OperativeOrganizer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				return ((InternalEList)getInferiors()).basicRemove(otherEnd, msgs);
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				return basicSetSuperior(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				return getInferiors();
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				if (resolve) return getSuperior();
				return basicGetSuperior();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				getInferiors().clear();
				getInferiors().addAll((Collection)newValue);
				return;
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				setSuperior((OperativeOrganizer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				getInferiors().clear();
				return;
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				setSuperior((OperativeOrganizer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__INFERIORS:
				return inferiors != null && !inferiors.isEmpty();
			case FreshmanCampPackage.OPERATIVE_ORGANIZER__SUPERIOR:
				return superior != null;
		}
		return super.eIsSet(featureID);
	}

} //OperativeOrganizerImpl
