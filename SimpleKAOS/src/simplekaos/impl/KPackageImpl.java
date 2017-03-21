/**
 */
package simplekaos.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import simplekaos.KConcept;
import simplekaos.KPackage;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.KPackageImpl#getContaining <em>Containing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KPackageImpl extends KConceptImpl implements KPackage {
	/**
	 * The cached value of the '{@link #getContaining() <em>Containing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaining()
	 * @generated
	 * @ordered
	 */
	protected EList<KConcept> containing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.KPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KConcept> getContaining() {
		if (containing == null) {
			containing = new EObjectContainmentWithInverseEList<KConcept>(KConcept.class, this, SimplekaosPackage.KPACKAGE__CONTAINING, SimplekaosPackage.KCONCEPT__PACKAGE_OF);
		}
		return containing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContaining()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				return ((InternalEList<?>)getContaining()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				return getContaining();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				getContaining().clear();
				getContaining().addAll((Collection<? extends KConcept>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				getContaining().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimplekaosPackage.KPACKAGE__CONTAINING:
				return containing != null && !containing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KPackageImpl
