/**
 */
package simplekaos.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import simplekaos.KConcept;
import simplekaos.KDocument;
import simplekaos.KReference;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KReference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.KReferenceImpl#getConceptOf <em>Concept Of</em>}</li>
 *   <li>{@link simplekaos.impl.KReferenceImpl#getDocumentOf <em>Document Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KReferenceImpl extends MinimalEObjectImpl.Container implements KReference {
	/**
	 * The cached value of the '{@link #getConceptOf() <em>Concept Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptOf()
	 * @generated
	 * @ordered
	 */
	protected KConcept conceptOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.KREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KConcept getConceptOf() {
		if (conceptOf != null && conceptOf.eIsProxy()) {
			InternalEObject oldConceptOf = (InternalEObject)conceptOf;
			conceptOf = (KConcept)eResolveProxy(oldConceptOf);
			if (conceptOf != oldConceptOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplekaosPackage.KREFERENCE__CONCEPT_OF, oldConceptOf, conceptOf));
			}
		}
		return conceptOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KConcept basicGetConceptOf() {
		return conceptOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptOf(KConcept newConceptOf, NotificationChain msgs) {
		KConcept oldConceptOf = conceptOf;
		conceptOf = newConceptOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KREFERENCE__CONCEPT_OF, oldConceptOf, newConceptOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptOf(KConcept newConceptOf) {
		if (newConceptOf != conceptOf) {
			NotificationChain msgs = null;
			if (conceptOf != null)
				msgs = ((InternalEObject)conceptOf).eInverseRemove(this, SimplekaosPackage.KCONCEPT__REFERENCES, KConcept.class, msgs);
			if (newConceptOf != null)
				msgs = ((InternalEObject)newConceptOf).eInverseAdd(this, SimplekaosPackage.KCONCEPT__REFERENCES, KConcept.class, msgs);
			msgs = basicSetConceptOf(newConceptOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KREFERENCE__CONCEPT_OF, newConceptOf, newConceptOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDocument getDocumentOf() {
		if (eContainerFeatureID() != SimplekaosPackage.KREFERENCE__DOCUMENT_OF) return null;
		return (KDocument)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentOf(KDocument newDocumentOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentOf, SimplekaosPackage.KREFERENCE__DOCUMENT_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentOf(KDocument newDocumentOf) {
		if (newDocumentOf != eInternalContainer() || (eContainerFeatureID() != SimplekaosPackage.KREFERENCE__DOCUMENT_OF && newDocumentOf != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentOf != null)
				msgs = ((InternalEObject)newDocumentOf).eInverseAdd(this, SimplekaosPackage.KDOCUMENT__CONTAINING, KDocument.class, msgs);
			msgs = basicSetDocumentOf(newDocumentOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KREFERENCE__DOCUMENT_OF, newDocumentOf, newDocumentOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				if (conceptOf != null)
					msgs = ((InternalEObject)conceptOf).eInverseRemove(this, SimplekaosPackage.KCONCEPT__REFERENCES, KConcept.class, msgs);
				return basicSetConceptOf((KConcept)otherEnd, msgs);
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentOf((KDocument)otherEnd, msgs);
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
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				return basicSetConceptOf(null, msgs);
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				return basicSetDocumentOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				return eInternalContainer().eInverseRemove(this, SimplekaosPackage.KDOCUMENT__CONTAINING, KDocument.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				if (resolve) return getConceptOf();
				return basicGetConceptOf();
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				return getDocumentOf();
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
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				setConceptOf((KConcept)newValue);
				return;
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				setDocumentOf((KDocument)newValue);
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
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				setConceptOf((KConcept)null);
				return;
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				setDocumentOf((KDocument)null);
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
			case SimplekaosPackage.KREFERENCE__CONCEPT_OF:
				return conceptOf != null;
			case SimplekaosPackage.KREFERENCE__DOCUMENT_OF:
				return getDocumentOf() != null;
		}
		return super.eIsSet(featureID);
	}

} //KReferenceImpl
