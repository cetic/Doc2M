/**
 */
package simplekaos.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simplekaos.KRationale;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KRationale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.KRationaleImpl#getGWT <em>GWT</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KRationaleImpl extends KConceptImpl implements KRationale {
	/**
	 * The default value of the '{@link #getGWT() <em>GWT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGWT()
	 * @generated
	 * @ordered
	 */
	protected static final String GWT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGWT() <em>GWT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGWT()
	 * @generated
	 * @ordered
	 */
	protected String gwt = GWT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KRationaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.KRATIONALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGWT() {
		return gwt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGWT(String newGWT) {
		String oldGWT = gwt;
		gwt = newGWT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KRATIONALE__GWT, oldGWT, gwt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplekaosPackage.KRATIONALE__GWT:
				return getGWT();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimplekaosPackage.KRATIONALE__GWT:
				setGWT((String)newValue);
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
			case SimplekaosPackage.KRATIONALE__GWT:
				setGWT(GWT_EDEFAULT);
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
			case SimplekaosPackage.KRATIONALE__GWT:
				return GWT_EDEFAULT == null ? gwt != null : !GWT_EDEFAULT.equals(gwt);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (GWT: ");
		result.append(gwt);
		result.append(')');
		return result.toString();
	}

} //KRationaleImpl
