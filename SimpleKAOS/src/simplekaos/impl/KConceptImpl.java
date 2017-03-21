/**
 */
package simplekaos.impl;

import java.util.Collection;
import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import simplekaos.KConcept;
import simplekaos.KPackage;
import simplekaos.KReference;
import simplekaos.SimplekaosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KConcept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link simplekaos.impl.KConceptImpl#getReferences <em>References</em>}</li>
 *   <li>{@link simplekaos.impl.KConceptImpl#getPackageOf <em>Package Of</em>}</li>
 *   <li>{@link simplekaos.impl.KConceptImpl#getName <em>Name</em>}</li>
 *   <li>{@link simplekaos.impl.KConceptImpl#getDef <em>Def</em>}</li>
 *   <li>{@link simplekaos.impl.KConceptImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link simplekaos.impl.KConceptImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KConceptImpl extends MinimalEObjectImpl.Container implements KConcept {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<KReference> references;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDef() <em>Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected static final String DEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected String def = DEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected String issue = ISSUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KConceptImpl() {
		super();
		setId(UUID.randomUUID().toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplekaosPackage.Literals.KCONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KReference> getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList<KReference>(KReference.class, this, SimplekaosPackage.KCONCEPT__REFERENCES, SimplekaosPackage.KREFERENCE__CONCEPT_OF);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPackage getPackageOf() {
		if (eContainerFeatureID() != SimplekaosPackage.KCONCEPT__PACKAGE_OF) return null;
		return (KPackage)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageOf(KPackage newPackageOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPackageOf, SimplekaosPackage.KCONCEPT__PACKAGE_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageOf(KPackage newPackageOf) {
		if (newPackageOf != eInternalContainer() || (eContainerFeatureID() != SimplekaosPackage.KCONCEPT__PACKAGE_OF && newPackageOf != null)) {
			if (EcoreUtil.isAncestor(this, newPackageOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPackageOf != null)
				msgs = ((InternalEObject)newPackageOf).eInverseAdd(this, SimplekaosPackage.KPACKAGE__CONTAINING, KPackage.class, msgs);
			msgs = basicSetPackageOf(newPackageOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KCONCEPT__PACKAGE_OF, newPackageOf, newPackageOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KCONCEPT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(String newDef) {
		String oldDef = def;
		def = newDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KCONCEPT__DEF, oldDef, def));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(String newIssue) {
		String oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KCONCEPT__ISSUE, oldIssue, issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplekaosPackage.KCONCEPT__ID, oldId, id));
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferences()).basicAdd(otherEnd, msgs);
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPackageOf((KPackage)otherEnd, msgs);
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				return basicSetPackageOf(null, msgs);
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
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				return eInternalContainer().eInverseRemove(this, SimplekaosPackage.KPACKAGE__CONTAINING, KPackage.class, msgs);
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				return getReferences();
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				return getPackageOf();
			case SimplekaosPackage.KCONCEPT__NAME:
				return getName();
			case SimplekaosPackage.KCONCEPT__DEF:
				return getDef();
			case SimplekaosPackage.KCONCEPT__ISSUE:
				return getIssue();
			case SimplekaosPackage.KCONCEPT__ID:
				return getId();
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends KReference>)newValue);
				return;
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				setPackageOf((KPackage)newValue);
				return;
			case SimplekaosPackage.KCONCEPT__NAME:
				setName((String)newValue);
				return;
			case SimplekaosPackage.KCONCEPT__DEF:
				setDef((String)newValue);
				return;
			case SimplekaosPackage.KCONCEPT__ISSUE:
				setIssue((String)newValue);
				return;
			case SimplekaosPackage.KCONCEPT__ID:
				setId((String)newValue);
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				getReferences().clear();
				return;
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				setPackageOf((KPackage)null);
				return;
			case SimplekaosPackage.KCONCEPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimplekaosPackage.KCONCEPT__DEF:
				setDef(DEF_EDEFAULT);
				return;
			case SimplekaosPackage.KCONCEPT__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case SimplekaosPackage.KCONCEPT__ID:
				setId(ID_EDEFAULT);
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
			case SimplekaosPackage.KCONCEPT__REFERENCES:
				return references != null && !references.isEmpty();
			case SimplekaosPackage.KCONCEPT__PACKAGE_OF:
				return getPackageOf() != null;
			case SimplekaosPackage.KCONCEPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimplekaosPackage.KCONCEPT__DEF:
				return DEF_EDEFAULT == null ? def != null : !DEF_EDEFAULT.equals(def);
			case SimplekaosPackage.KCONCEPT__ISSUE:
				return ISSUE_EDEFAULT == null ? issue != null : !ISSUE_EDEFAULT.equals(issue);
			case SimplekaosPackage.KCONCEPT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Def: ");
		result.append(def);
		result.append(", Issue: ");
		result.append(issue);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //KConceptImpl
