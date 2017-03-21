/**
 */
package simplekaos.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simplekaos.Agent;
import simplekaos.AgentCategory;
import simplekaos.Assignment;
import simplekaos.Conflict;
import simplekaos.GRefinement;
import simplekaos.Goal;
import simplekaos.GoalType;
import simplekaos.KAndOrRel;
import simplekaos.KConcept;
import simplekaos.KDiagram;
import simplekaos.KDocument;
import simplekaos.KGReference;
import simplekaos.KObject;
import simplekaos.KPackage;
import simplekaos.KRationale;
import simplekaos.KReference;
import simplekaos.KRelationship;
import simplekaos.KReport;
import simplekaos.ORefinement;
import simplekaos.Obstacle;
import simplekaos.Obstruction;
import simplekaos.PriorityType;
import simplekaos.Resolution;
import simplekaos.Responsibility;
import simplekaos.SimplekaosFactory;
import simplekaos.SimplekaosPackage;
import simplekaos.TextDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplekaosPackageImpl extends EPackageImpl implements SimplekaosPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kAndOrRelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kgReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsibilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agentCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see simplekaos.SimplekaosPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplekaosPackageImpl() {
		super(eNS_URI, SimplekaosFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimplekaosPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplekaosPackage init() {
		if (isInited) return (SimplekaosPackage)EPackage.Registry.INSTANCE.getEPackage(SimplekaosPackage.eNS_URI);

		// Obtain or create and register package
		SimplekaosPackageImpl theSimplekaosPackage = (SimplekaosPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplekaosPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplekaosPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSimplekaosPackage.createPackageContents();

		// Initialize created meta-data
		theSimplekaosPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplekaosPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplekaosPackage.eNS_URI, theSimplekaosPackage);
		return theSimplekaosPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKConcept() {
		return kConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKConcept_References() {
		return (EReference)kConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKConcept_PackageOf() {
		return (EReference)kConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKConcept_Name() {
		return (EAttribute)kConceptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKConcept_Def() {
		return (EAttribute)kConceptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKConcept_Issue() {
		return (EAttribute)kConceptEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKConcept_Id() {
		return (EAttribute)kConceptEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKObject() {
		return kObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKDocument() {
		return kDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKDocument_Containing() {
		return (EReference)kDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKDiagram() {
		return kDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_SonRef() {
		return (EReference)obstacleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_ParentRef() {
		return (EReference)obstacleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_Obstruction() {
		return (EReference)obstacleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_Resolution() {
		return (EReference)obstacleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKAndOrRel() {
		return kAndOrRelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKAndOrRel_SysRef() {
		return (EAttribute)kAndOrRelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_SonRef() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_ParentRef() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Assignment() {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Priority() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Conflict() {
		return (EReference)goalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Obstruction() {
		return (EReference)goalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Resolution() {
		return (EReference)goalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Category() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Responsibility() {
		return (EReference)goalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_Type() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRefinement() {
		return gRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRefinement_Parent() {
		return (EReference)gRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGRefinement_Sons() {
		return (EReference)gRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORefinement() {
		return oRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORefinement_Parent() {
		return (EReference)oRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORefinement_Sons() {
		return (EReference)oRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Goal() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Assignee() {
		return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKReference() {
		return kReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKReference_ConceptOf() {
		return (EReference)kReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKReference_DocumentOf() {
		return (EReference)kReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKPackage() {
		return kPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKPackage_Containing() {
		return (EReference)kPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKGReference() {
		return kgReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGReference_X() {
		return (EAttribute)kgReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGReference_Y() {
		return (EAttribute)kgReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGReference_Width() {
		return (EAttribute)kgReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGReference_Height() {
		return (EAttribute)kgReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKGReference_Label() {
		return (EAttribute)kgReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKRationale() {
		return kRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKRationale_GWT() {
		return (EAttribute)kRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKRelationship() {
		return kRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflict_BoundaryCondition() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_Goal() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsibility() {
		return responsibilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_LeafGoal() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsibility_Responsible() {
		return (EReference)responsibilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstruction() {
		return obstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstruction_Goal() {
		return (EReference)obstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstruction_Obstacle() {
		return (EReference)obstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolution() {
		return resolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolution_Goal() {
		return (EReference)resolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolution_Obstacle() {
		return (EReference)resolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Responsibility() {
		return (EReference)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Assignment() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Category() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextDocument() {
		return textDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextDocument_Content() {
		return (EAttribute)textDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKReport() {
		return kReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKReport_Contained() {
		return (EReference)kReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgentCategory() {
		return agentCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityType() {
		return priorityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalType() {
		return goalTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplekaosFactory getSimplekaosFactory() {
		return (SimplekaosFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kConceptEClass = createEClass(KCONCEPT);
		createEReference(kConceptEClass, KCONCEPT__REFERENCES);
		createEReference(kConceptEClass, KCONCEPT__PACKAGE_OF);
		createEAttribute(kConceptEClass, KCONCEPT__NAME);
		createEAttribute(kConceptEClass, KCONCEPT__DEF);
		createEAttribute(kConceptEClass, KCONCEPT__ISSUE);
		createEAttribute(kConceptEClass, KCONCEPT__ID);

		kObjectEClass = createEClass(KOBJECT);

		kDocumentEClass = createEClass(KDOCUMENT);
		createEReference(kDocumentEClass, KDOCUMENT__CONTAINING);

		kDiagramEClass = createEClass(KDIAGRAM);

		obstacleEClass = createEClass(OBSTACLE);
		createEReference(obstacleEClass, OBSTACLE__SON_REF);
		createEReference(obstacleEClass, OBSTACLE__PARENT_REF);
		createEReference(obstacleEClass, OBSTACLE__OBSTRUCTION);
		createEReference(obstacleEClass, OBSTACLE__RESOLUTION);

		kAndOrRelEClass = createEClass(KAND_OR_REL);
		createEAttribute(kAndOrRelEClass, KAND_OR_REL__SYS_REF);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__SON_REF);
		createEReference(goalEClass, GOAL__PARENT_REF);
		createEReference(goalEClass, GOAL__ASSIGNMENT);
		createEAttribute(goalEClass, GOAL__PRIORITY);
		createEReference(goalEClass, GOAL__CONFLICT);
		createEReference(goalEClass, GOAL__OBSTRUCTION);
		createEReference(goalEClass, GOAL__RESOLUTION);
		createEAttribute(goalEClass, GOAL__CATEGORY);
		createEReference(goalEClass, GOAL__RESPONSIBILITY);
		createEAttribute(goalEClass, GOAL__TYPE);

		gRefinementEClass = createEClass(GREFINEMENT);
		createEReference(gRefinementEClass, GREFINEMENT__PARENT);
		createEReference(gRefinementEClass, GREFINEMENT__SONS);

		oRefinementEClass = createEClass(OREFINEMENT);
		createEReference(oRefinementEClass, OREFINEMENT__PARENT);
		createEReference(oRefinementEClass, OREFINEMENT__SONS);

		assignmentEClass = createEClass(ASSIGNMENT);
		createEReference(assignmentEClass, ASSIGNMENT__GOAL);
		createEReference(assignmentEClass, ASSIGNMENT__ASSIGNEE);

		kReferenceEClass = createEClass(KREFERENCE);
		createEReference(kReferenceEClass, KREFERENCE__CONCEPT_OF);
		createEReference(kReferenceEClass, KREFERENCE__DOCUMENT_OF);

		kPackageEClass = createEClass(KPACKAGE);
		createEReference(kPackageEClass, KPACKAGE__CONTAINING);

		kgReferenceEClass = createEClass(KG_REFERENCE);
		createEAttribute(kgReferenceEClass, KG_REFERENCE__X);
		createEAttribute(kgReferenceEClass, KG_REFERENCE__Y);
		createEAttribute(kgReferenceEClass, KG_REFERENCE__WIDTH);
		createEAttribute(kgReferenceEClass, KG_REFERENCE__HEIGHT);
		createEAttribute(kgReferenceEClass, KG_REFERENCE__LABEL);

		kRationaleEClass = createEClass(KRATIONALE);
		createEAttribute(kRationaleEClass, KRATIONALE__GWT);

		kRelationshipEClass = createEClass(KRELATIONSHIP);

		conflictEClass = createEClass(CONFLICT);
		createEAttribute(conflictEClass, CONFLICT__BOUNDARY_CONDITION);
		createEReference(conflictEClass, CONFLICT__GOAL);

		responsibilityEClass = createEClass(RESPONSIBILITY);
		createEReference(responsibilityEClass, RESPONSIBILITY__LEAF_GOAL);
		createEReference(responsibilityEClass, RESPONSIBILITY__RESPONSIBLE);

		obstructionEClass = createEClass(OBSTRUCTION);
		createEReference(obstructionEClass, OBSTRUCTION__GOAL);
		createEReference(obstructionEClass, OBSTRUCTION__OBSTACLE);

		resolutionEClass = createEClass(RESOLUTION);
		createEReference(resolutionEClass, RESOLUTION__GOAL);
		createEReference(resolutionEClass, RESOLUTION__OBSTACLE);

		agentEClass = createEClass(AGENT);
		createEReference(agentEClass, AGENT__RESPONSIBILITY);
		createEReference(agentEClass, AGENT__ASSIGNMENT);
		createEAttribute(agentEClass, AGENT__CATEGORY);

		textDocumentEClass = createEClass(TEXT_DOCUMENT);
		createEAttribute(textDocumentEClass, TEXT_DOCUMENT__CONTENT);

		kReportEClass = createEClass(KREPORT);
		createEReference(kReportEClass, KREPORT__CONTAINED);

		// Create enums
		agentCategoryEEnum = createEEnum(AGENT_CATEGORY);
		priorityTypeEEnum = createEEnum(PRIORITY_TYPE);
		goalTypeEEnum = createEEnum(GOAL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kObjectEClass.getESuperTypes().add(this.getKConcept());
		kDocumentEClass.getESuperTypes().add(this.getKConcept());
		kDiagramEClass.getESuperTypes().add(this.getKDocument());
		obstacleEClass.getESuperTypes().add(this.getKRationale());
		kAndOrRelEClass.getESuperTypes().add(this.getKConcept());
		goalEClass.getESuperTypes().add(this.getKRationale());
		gRefinementEClass.getESuperTypes().add(this.getKAndOrRel());
		oRefinementEClass.getESuperTypes().add(this.getKAndOrRel());
		assignmentEClass.getESuperTypes().add(this.getKAndOrRel());
		kPackageEClass.getESuperTypes().add(this.getKConcept());
		kgReferenceEClass.getESuperTypes().add(this.getKReference());
		kRationaleEClass.getESuperTypes().add(this.getKConcept());
		kRelationshipEClass.getESuperTypes().add(this.getKConcept());
		conflictEClass.getESuperTypes().add(this.getKRelationship());
		responsibilityEClass.getESuperTypes().add(this.getKAndOrRel());
		obstructionEClass.getESuperTypes().add(this.getKRelationship());
		resolutionEClass.getESuperTypes().add(this.getKRelationship());
		agentEClass.getESuperTypes().add(this.getKObject());
		textDocumentEClass.getESuperTypes().add(this.getKDocument());
		kReportEClass.getESuperTypes().add(this.getKDocument());

		// Initialize classes, features, and operations; add parameters
		initEClass(kConceptEClass, KConcept.class, "KConcept", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKConcept_References(), this.getKReference(), this.getKReference_ConceptOf(), "references", null, 0, -1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKConcept_PackageOf(), this.getKPackage(), this.getKPackage_Containing(), "packageOf", null, 0, 1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKConcept_Name(), ecorePackage.getEString(), "Name", null, 0, 1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKConcept_Def(), ecorePackage.getEString(), "Def", null, 0, 1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKConcept_Issue(), ecorePackage.getEString(), "Issue", null, 0, 1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKConcept_Id(), ecorePackage.getEString(), "id", null, 0, 1, KConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kObjectEClass, KObject.class, "KObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kDocumentEClass, KDocument.class, "KDocument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKDocument_Containing(), this.getKReference(), this.getKReference_DocumentOf(), "containing", null, 0, -1, KDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kDiagramEClass, KDiagram.class, "KDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstacle_SonRef(), this.getORefinement(), this.getORefinement_Parent(), "sonRef", null, 0, -1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObstacle_ParentRef(), this.getORefinement(), this.getORefinement_Sons(), "parentRef", null, 0, -1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObstacle_Obstruction(), this.getObstruction(), this.getObstruction_Obstacle(), "obstruction", null, 0, -1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObstacle_Resolution(), this.getResolution(), this.getResolution_Obstacle(), "resolution", null, 0, -1, Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kAndOrRelEClass, KAndOrRel.class, "KAndOrRel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKAndOrRel_SysRef(), ecorePackage.getEString(), "SysRef", null, 0, 1, KAndOrRel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_SonRef(), this.getGRefinement(), this.getGRefinement_Parent(), "sonRef", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_ParentRef(), this.getGRefinement(), this.getGRefinement_Sons(), "parentRef", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Assignment(), this.getAssignment(), this.getAssignment_Goal(), "assignment", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Priority(), ecorePackage.getEString(), "Priority", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Conflict(), this.getConflict(), this.getConflict_Goal(), "conflict", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Obstruction(), this.getObstruction(), this.getObstruction_Goal(), "obstruction", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Resolution(), this.getResolution(), this.getResolution_Goal(), "resolution", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Category(), ecorePackage.getEString(), "Category", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_Responsibility(), this.getResponsibility(), this.getResponsibility_LeafGoal(), "responsibility", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_Type(), this.getGoalType(), "Type", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gRefinementEClass, GRefinement.class, "GRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGRefinement_Parent(), this.getGoal(), this.getGoal_SonRef(), "parent", null, 0, 1, GRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRefinement_Sons(), this.getGoal(), this.getGoal_ParentRef(), "sons", null, 0, -1, GRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oRefinementEClass, ORefinement.class, "ORefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getORefinement_Parent(), this.getObstacle(), this.getObstacle_SonRef(), "parent", null, 0, 1, ORefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getORefinement_Sons(), this.getObstacle(), this.getObstacle_ParentRef(), "sons", null, 0, -1, ORefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignment_Goal(), this.getGoal(), this.getGoal_Assignment(), "goal", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignment_Assignee(), this.getAgent(), this.getAgent_Assignment(), "assignee", null, 0, -1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kReferenceEClass, KReference.class, "KReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKReference_ConceptOf(), this.getKConcept(), this.getKConcept_References(), "conceptOf", null, 0, 1, KReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKReference_DocumentOf(), this.getKDocument(), this.getKDocument_Containing(), "documentOf", null, 0, 1, KReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kPackageEClass, KPackage.class, "KPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKPackage_Containing(), this.getKConcept(), this.getKConcept_PackageOf(), "containing", null, 0, -1, KPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kgReferenceEClass, KGReference.class, "KGReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKGReference_X(), ecorePackage.getEInt(), "x", null, 0, 1, KGReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKGReference_Y(), ecorePackage.getEInt(), "y", null, 0, 1, KGReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKGReference_Width(), ecorePackage.getEInt(), "width", null, 0, 1, KGReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKGReference_Height(), ecorePackage.getEInt(), "height", null, 0, 1, KGReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKGReference_Label(), ecorePackage.getEString(), "label", null, 0, 1, KGReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kRationaleEClass, KRationale.class, "KRationale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKRationale_GWT(), ecorePackage.getEString(), "GWT", null, 0, 1, KRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kRelationshipEClass, KRelationship.class, "KRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConflict_BoundaryCondition(), ecorePackage.getEString(), "BoundaryCondition", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflict_Goal(), this.getGoal(), this.getGoal_Conflict(), "goal", null, 2, -1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responsibilityEClass, Responsibility.class, "Responsibility", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponsibility_LeafGoal(), this.getGoal(), this.getGoal_Responsibility(), "leafGoal", null, 0, 1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponsibility_Responsible(), this.getAgent(), this.getAgent_Responsibility(), "responsible", null, 0, -1, Responsibility.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstructionEClass, Obstruction.class, "Obstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstruction_Goal(), this.getGoal(), this.getGoal_Obstruction(), "goal", null, 1, 1, Obstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObstruction_Obstacle(), this.getObstacle(), this.getObstacle_Obstruction(), "obstacle", null, 1, 1, Obstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionEClass, Resolution.class, "Resolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolution_Goal(), this.getGoal(), this.getGoal_Resolution(), "goal", null, 0, 1, Resolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResolution_Obstacle(), this.getObstacle(), this.getObstacle_Resolution(), "obstacle", null, 0, 1, Resolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgent_Responsibility(), this.getResponsibility(), this.getResponsibility_Responsible(), "responsibility", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Assignment(), this.getAssignment(), this.getAssignment_Assignee(), "assignment", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgent_Category(), this.getAgentCategory(), "Category", "Undefined", 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textDocumentEClass, TextDocument.class, "TextDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextDocument_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, TextDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kReportEClass, KReport.class, "KReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKReport_Contained(), this.getKDocument(), null, "contained", null, 0, -1, KReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(agentCategoryEEnum, AgentCategory.class, "AgentCategory");
		addEEnumLiteral(agentCategoryEEnum, AgentCategory.UNDEFINED);
		addEEnumLiteral(agentCategoryEEnum, AgentCategory.SOFTWARE);
		addEEnumLiteral(agentCategoryEEnum, AgentCategory.ENVIRONMENT);

		initEEnum(priorityTypeEEnum, PriorityType.class, "PriorityType");
		addEEnumLiteral(priorityTypeEEnum, PriorityType.LOW);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.MEDIUM);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.HIGH);

		initEEnum(goalTypeEEnum, GoalType.class, "GoalType");
		addEEnumLiteral(goalTypeEEnum, GoalType.GOAL);
		addEEnumLiteral(goalTypeEEnum, GoalType.SOFT_GOAL);
		addEEnumLiteral(goalTypeEEnum, GoalType.REQUIREMENT);
		addEEnumLiteral(goalTypeEEnum, GoalType.EXPECTATION);
		addEEnumLiteral(goalTypeEEnum, GoalType.DOM_PROP);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplekaosPackageImpl
