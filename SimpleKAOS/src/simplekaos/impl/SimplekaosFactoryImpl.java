/**
 */
package simplekaos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import simplekaos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplekaosFactoryImpl extends EFactoryImpl implements SimplekaosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplekaosFactory init() {
		try {
			SimplekaosFactory theSimplekaosFactory = (SimplekaosFactory)EPackage.Registry.INSTANCE.getEFactory(SimplekaosPackage.eNS_URI);
			if (theSimplekaosFactory != null) {
				return theSimplekaosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplekaosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplekaosFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplekaosPackage.KDIAGRAM: return createKDiagram();
			case SimplekaosPackage.OBSTACLE: return createObstacle();
			case SimplekaosPackage.GOAL: return createGoal();
			case SimplekaosPackage.GREFINEMENT: return createGRefinement();
			case SimplekaosPackage.OREFINEMENT: return createORefinement();
			case SimplekaosPackage.ASSIGNMENT: return createAssignment();
			case SimplekaosPackage.KPACKAGE: return createKPackage();
			case SimplekaosPackage.KG_REFERENCE: return createKGReference();
			case SimplekaosPackage.CONFLICT: return createConflict();
			case SimplekaosPackage.RESPONSIBILITY: return createResponsibility();
			case SimplekaosPackage.OBSTRUCTION: return createObstruction();
			case SimplekaosPackage.RESOLUTION: return createResolution();
			case SimplekaosPackage.AGENT: return createAgent();
			case SimplekaosPackage.TEXT_DOCUMENT: return createTextDocument();
			case SimplekaosPackage.KREPORT: return createKReport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimplekaosPackage.AGENT_CATEGORY:
				return createAgentCategoryFromString(eDataType, initialValue);
			case SimplekaosPackage.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case SimplekaosPackage.GOAL_TYPE:
				return createGoalTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimplekaosPackage.AGENT_CATEGORY:
				return convertAgentCategoryToString(eDataType, instanceValue);
			case SimplekaosPackage.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case SimplekaosPackage.GOAL_TYPE:
				return convertGoalTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDiagram createKDiagram() {
		KDiagramImpl kDiagram = new KDiagramImpl();
		return kDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle createObstacle() {
		ObstacleImpl obstacle = new ObstacleImpl();
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRefinement createGRefinement() {
		GRefinementImpl gRefinement = new GRefinementImpl();
		return gRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORefinement createORefinement() {
		ORefinementImpl oRefinement = new ORefinementImpl();
		return oRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KPackage createKPackage() {
		KPackageImpl kPackage = new KPackageImpl();
		return kPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KGReference createKGReference() {
		KGReferenceImpl kgReference = new KGReferenceImpl();
		return kgReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflict createConflict() {
		ConflictImpl conflict = new ConflictImpl();
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsibility createResponsibility() {
		ResponsibilityImpl responsibility = new ResponsibilityImpl();
		return responsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstruction createObstruction() {
		ObstructionImpl obstruction = new ObstructionImpl();
		return obstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution createResolution() {
		ResolutionImpl resolution = new ResolutionImpl();
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDocument createTextDocument() {
		TextDocumentImpl textDocument = new TextDocumentImpl();
		return textDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KReport createKReport() {
		KReportImpl kReport = new KReportImpl();
		return kReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentCategory createAgentCategoryFromString(EDataType eDataType, String initialValue) {
		AgentCategory result = AgentCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgentCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType createPriorityTypeFromString(EDataType eDataType, String initialValue) {
		PriorityType result = PriorityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalType createGoalTypeFromString(EDataType eDataType, String initialValue) {
		GoalType result = GoalType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGoalTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplekaosPackage getSimplekaosPackage() {
		return (SimplekaosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplekaosPackage getPackage() {
		return SimplekaosPackage.eINSTANCE;
	}

} //SimplekaosFactoryImpl
