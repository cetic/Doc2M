/**
 */
package simplekaos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see simplekaos.SimplekaosFactory
 * @model kind="package"
 * @generated
 */
public interface SimplekaosPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplekaos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.respect-it.be/simplekaos";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplekaos";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplekaosPackage eINSTANCE = simplekaos.impl.SimplekaosPackageImpl.init();

	/**
	 * The meta object id for the '{@link simplekaos.impl.KConceptImpl <em>KConcept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KConceptImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKConcept()
	 * @generated
	 */
	int KCONCEPT = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__PACKAGE_OF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__DEF = 3;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__ISSUE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT__ID = 5;

	/**
	 * The number of structural features of the '<em>KConcept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>KConcept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KCONCEPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KObjectImpl <em>KObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KObjectImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKObject()
	 * @generated
	 */
	int KOBJECT = 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT__ID = KCONCEPT__ID;

	/**
	 * The number of structural features of the '<em>KObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOBJECT_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KDocumentImpl <em>KDocument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KDocumentImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKDocument()
	 * @generated
	 */
	int KDOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__ID = KCONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT__CONTAINING = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KDocument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDOCUMENT_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KDiagramImpl <em>KDiagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KDiagramImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKDiagram()
	 * @generated
	 */
	int KDIAGRAM = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__REFERENCES = KDOCUMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__PACKAGE_OF = KDOCUMENT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__NAME = KDOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__DEF = KDOCUMENT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__ISSUE = KDOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__ID = KDOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM__CONTAINING = KDOCUMENT__CONTAINING;

	/**
	 * The number of structural features of the '<em>KDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM_FEATURE_COUNT = KDOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KDiagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KDIAGRAM_OPERATION_COUNT = KDOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KRationaleImpl <em>KRationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KRationaleImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKRationale()
	 * @generated
	 */
	int KRATIONALE = 13;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__ID = KCONCEPT__ID;

	/**
	 * The feature id for the '<em><b>GWT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE__GWT = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KRationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KRationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRATIONALE_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ObstacleImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__REFERENCES = KRATIONALE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__PACKAGE_OF = KRATIONALE__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__NAME = KRATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__DEF = KRATIONALE__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__ISSUE = KRATIONALE__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__ID = KRATIONALE__ID;

	/**
	 * The feature id for the '<em><b>GWT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__GWT = KRATIONALE__GWT;

	/**
	 * The feature id for the '<em><b>Son Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__SON_REF = KRATIONALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__PARENT_REF = KRATIONALE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Obstruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__OBSTRUCTION = KRATIONALE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__RESOLUTION = KRATIONALE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = KRATIONALE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = KRATIONALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KAndOrRelImpl <em>KAnd Or Rel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KAndOrRelImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKAndOrRel()
	 * @generated
	 */
	int KAND_OR_REL = 5;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__ID = KCONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL__SYS_REF = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KAnd Or Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KAnd Or Rel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KAND_OR_REL_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.GoalImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 6;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__REFERENCES = KRATIONALE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PACKAGE_OF = KRATIONALE__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = KRATIONALE__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DEF = KRATIONALE__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ISSUE = KRATIONALE__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ID = KRATIONALE__ID;

	/**
	 * The feature id for the '<em><b>GWT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GWT = KRATIONALE__GWT;

	/**
	 * The feature id for the '<em><b>Son Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SON_REF = KRATIONALE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT_REF = KRATIONALE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSIGNMENT = KRATIONALE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PRIORITY = KRATIONALE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conflict</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONFLICT = KRATIONALE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Obstruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__OBSTRUCTION = KRATIONALE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RESOLUTION = KRATIONALE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CATEGORY = KRATIONALE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__RESPONSIBILITY = KRATIONALE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TYPE = KRATIONALE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = KRATIONALE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = KRATIONALE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.GRefinementImpl <em>GRefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.GRefinementImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getGRefinement()
	 * @generated
	 */
	int GREFINEMENT = 7;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__REFERENCES = KAND_OR_REL__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__PACKAGE_OF = KAND_OR_REL__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__NAME = KAND_OR_REL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__DEF = KAND_OR_REL__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__ISSUE = KAND_OR_REL__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__ID = KAND_OR_REL__ID;

	/**
	 * The feature id for the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__SYS_REF = KAND_OR_REL__SYS_REF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__PARENT = KAND_OR_REL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT__SONS = KAND_OR_REL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GRefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT_FEATURE_COUNT = KAND_OR_REL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GRefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREFINEMENT_OPERATION_COUNT = KAND_OR_REL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ORefinementImpl <em>ORefinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ORefinementImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getORefinement()
	 * @generated
	 */
	int OREFINEMENT = 8;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__REFERENCES = KAND_OR_REL__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__PACKAGE_OF = KAND_OR_REL__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__NAME = KAND_OR_REL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__DEF = KAND_OR_REL__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__ISSUE = KAND_OR_REL__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__ID = KAND_OR_REL__ID;

	/**
	 * The feature id for the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__SYS_REF = KAND_OR_REL__SYS_REF;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__PARENT = KAND_OR_REL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT__SONS = KAND_OR_REL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ORefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT_FEATURE_COUNT = KAND_OR_REL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ORefinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OREFINEMENT_OPERATION_COUNT = KAND_OR_REL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.AssignmentImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 9;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__REFERENCES = KAND_OR_REL__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__PACKAGE_OF = KAND_OR_REL__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__NAME = KAND_OR_REL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__DEF = KAND_OR_REL__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ISSUE = KAND_OR_REL__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ID = KAND_OR_REL__ID;

	/**
	 * The feature id for the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__SYS_REF = KAND_OR_REL__SYS_REF;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__GOAL = KAND_OR_REL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNEE = KAND_OR_REL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = KAND_OR_REL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = KAND_OR_REL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KReferenceImpl <em>KReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KReferenceImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKReference()
	 * @generated
	 */
	int KREFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Concept Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__CONCEPT_OF = 0;

	/**
	 * The feature id for the '<em><b>Document Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE__DOCUMENT_OF = 1;

	/**
	 * The number of structural features of the '<em>KReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>KReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KPackageImpl <em>KPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KPackageImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKPackage()
	 * @generated
	 */
	int KPACKAGE = 11;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__ID = KCONCEPT__ID;

	/**
	 * The feature id for the '<em><b>Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE__CONTAINING = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPACKAGE_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KGReferenceImpl <em>KG Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KGReferenceImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKGReference()
	 * @generated
	 */
	int KG_REFERENCE = 12;

	/**
	 * The feature id for the '<em><b>Concept Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__CONCEPT_OF = KREFERENCE__CONCEPT_OF;

	/**
	 * The feature id for the '<em><b>Document Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__DOCUMENT_OF = KREFERENCE__DOCUMENT_OF;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__X = KREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__Y = KREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__WIDTH = KREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__HEIGHT = KREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE__LABEL = KREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>KG Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE_FEATURE_COUNT = KREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>KG Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KG_REFERENCE_OPERATION_COUNT = KREFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KRelationshipImpl <em>KRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KRelationshipImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKRelationship()
	 * @generated
	 */
	int KRELATIONSHIP = 14;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__REFERENCES = KCONCEPT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__PACKAGE_OF = KCONCEPT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__NAME = KCONCEPT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__DEF = KCONCEPT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__ISSUE = KCONCEPT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP__ID = KCONCEPT__ID;

	/**
	 * The number of structural features of the '<em>KRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP_FEATURE_COUNT = KCONCEPT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>KRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRELATIONSHIP_OPERATION_COUNT = KCONCEPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ConflictImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 15;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__REFERENCES = KRELATIONSHIP__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__PACKAGE_OF = KRELATIONSHIP__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__NAME = KRELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__DEF = KRELATIONSHIP__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__ISSUE = KRELATIONSHIP__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__ID = KRELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Boundary Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__BOUNDARY_CONDITION = KRELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__GOAL = KRELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = KRELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_OPERATION_COUNT = KRELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ResponsibilityImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getResponsibility()
	 * @generated
	 */
	int RESPONSIBILITY = 16;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__REFERENCES = KAND_OR_REL__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__PACKAGE_OF = KAND_OR_REL__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__NAME = KAND_OR_REL__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__DEF = KAND_OR_REL__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__ISSUE = KAND_OR_REL__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__ID = KAND_OR_REL__ID;

	/**
	 * The feature id for the '<em><b>Sys Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__SYS_REF = KAND_OR_REL__SYS_REF;

	/**
	 * The feature id for the '<em><b>Leaf Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__LEAF_GOAL = KAND_OR_REL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY__RESPONSIBLE = KAND_OR_REL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_FEATURE_COUNT = KAND_OR_REL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Responsibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIBILITY_OPERATION_COUNT = KAND_OR_REL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ObstructionImpl <em>Obstruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ObstructionImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getObstruction()
	 * @generated
	 */
	int OBSTRUCTION = 17;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__REFERENCES = KRELATIONSHIP__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__PACKAGE_OF = KRELATIONSHIP__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__NAME = KRELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__DEF = KRELATIONSHIP__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__ISSUE = KRELATIONSHIP__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__ID = KRELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__GOAL = KRELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obstacle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION__OBSTACLE = KRELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_FEATURE_COUNT = KRELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Obstruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTRUCTION_OPERATION_COUNT = KRELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.ResolutionImpl <em>Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.ResolutionImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 18;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__REFERENCES = KRELATIONSHIP__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__PACKAGE_OF = KRELATIONSHIP__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__NAME = KRELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__DEF = KRELATIONSHIP__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__ISSUE = KRELATIONSHIP__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__ID = KRELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__GOAL = KRELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obstacle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION__OBSTACLE = KRELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FEATURE_COUNT = KRELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_OPERATION_COUNT = KRELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.AgentImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 19;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__REFERENCES = KOBJECT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PACKAGE_OF = KOBJECT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = KOBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DEF = KOBJECT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ISSUE = KOBJECT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = KOBJECT__ID;

	/**
	 * The feature id for the '<em><b>Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__RESPONSIBILITY = KOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ASSIGNMENT = KOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CATEGORY = KOBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = KOBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = KOBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.TextDocumentImpl <em>Text Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.TextDocumentImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getTextDocument()
	 * @generated
	 */
	int TEXT_DOCUMENT = 20;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__REFERENCES = KDOCUMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__PACKAGE_OF = KDOCUMENT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__NAME = KDOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__DEF = KDOCUMENT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__ISSUE = KDOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__ID = KDOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__CONTAINING = KDOCUMENT__CONTAINING;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT__CONTENT = KDOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_FEATURE_COUNT = KDOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_DOCUMENT_OPERATION_COUNT = KDOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.impl.KReportImpl <em>KReport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.impl.KReportImpl
	 * @see simplekaos.impl.SimplekaosPackageImpl#getKReport()
	 * @generated
	 */
	int KREPORT = 21;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__REFERENCES = KDOCUMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Package Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__PACKAGE_OF = KDOCUMENT__PACKAGE_OF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__NAME = KDOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Def</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__DEF = KDOCUMENT__DEF;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__ISSUE = KDOCUMENT__ISSUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__ID = KDOCUMENT__ID;

	/**
	 * The feature id for the '<em><b>Containing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__CONTAINING = KDOCUMENT__CONTAINING;

	/**
	 * The feature id for the '<em><b>Contained</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT__CONTAINED = KDOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>KReport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT_FEATURE_COUNT = KDOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>KReport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KREPORT_OPERATION_COUNT = KDOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link simplekaos.AgentCategory <em>Agent Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.AgentCategory
	 * @see simplekaos.impl.SimplekaosPackageImpl#getAgentCategory()
	 * @generated
	 */
	int AGENT_CATEGORY = 22;

	/**
	 * The meta object id for the '{@link simplekaos.PriorityType <em>Priority Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.PriorityType
	 * @see simplekaos.impl.SimplekaosPackageImpl#getPriorityType()
	 * @generated
	 */
	int PRIORITY_TYPE = 23;

	/**
	 * The meta object id for the '{@link simplekaos.GoalType <em>Goal Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see simplekaos.GoalType
	 * @see simplekaos.impl.SimplekaosPackageImpl#getGoalType()
	 * @generated
	 */
	int GOAL_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link simplekaos.KConcept <em>KConcept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KConcept</em>'.
	 * @see simplekaos.KConcept
	 * @generated
	 */
	EClass getKConcept();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.KConcept#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see simplekaos.KConcept#getReferences()
	 * @see #getKConcept()
	 * @generated
	 */
	EReference getKConcept_References();

	/**
	 * Returns the meta object for the container reference '{@link simplekaos.KConcept#getPackageOf <em>Package Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package Of</em>'.
	 * @see simplekaos.KConcept#getPackageOf()
	 * @see #getKConcept()
	 * @generated
	 */
	EReference getKConcept_PackageOf();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KConcept#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see simplekaos.KConcept#getName()
	 * @see #getKConcept()
	 * @generated
	 */
	EAttribute getKConcept_Name();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KConcept#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Def</em>'.
	 * @see simplekaos.KConcept#getDef()
	 * @see #getKConcept()
	 * @generated
	 */
	EAttribute getKConcept_Def();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KConcept#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see simplekaos.KConcept#getIssue()
	 * @see #getKConcept()
	 * @generated
	 */
	EAttribute getKConcept_Issue();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KConcept#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see simplekaos.KConcept#getId()
	 * @see #getKConcept()
	 * @generated
	 */
	EAttribute getKConcept_Id();

	/**
	 * Returns the meta object for class '{@link simplekaos.KObject <em>KObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KObject</em>'.
	 * @see simplekaos.KObject
	 * @generated
	 */
	EClass getKObject();

	/**
	 * Returns the meta object for class '{@link simplekaos.KDocument <em>KDocument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDocument</em>'.
	 * @see simplekaos.KDocument
	 * @generated
	 */
	EClass getKDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link simplekaos.KDocument#getContaining <em>Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containing</em>'.
	 * @see simplekaos.KDocument#getContaining()
	 * @see #getKDocument()
	 * @generated
	 */
	EReference getKDocument_Containing();

	/**
	 * Returns the meta object for class '{@link simplekaos.KDiagram <em>KDiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KDiagram</em>'.
	 * @see simplekaos.KDiagram
	 * @generated
	 */
	EClass getKDiagram();

	/**
	 * Returns the meta object for class '{@link simplekaos.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see simplekaos.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Obstacle#getSonRef <em>Son Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Son Ref</em>'.
	 * @see simplekaos.Obstacle#getSonRef()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_SonRef();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Obstacle#getParentRef <em>Parent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Ref</em>'.
	 * @see simplekaos.Obstacle#getParentRef()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_ParentRef();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Obstacle#getObstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obstruction</em>'.
	 * @see simplekaos.Obstacle#getObstruction()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_Obstruction();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Obstacle#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolution</em>'.
	 * @see simplekaos.Obstacle#getResolution()
	 * @see #getObstacle()
	 * @generated
	 */
	EReference getObstacle_Resolution();

	/**
	 * Returns the meta object for class '{@link simplekaos.KAndOrRel <em>KAnd Or Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KAnd Or Rel</em>'.
	 * @see simplekaos.KAndOrRel
	 * @generated
	 */
	EClass getKAndOrRel();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KAndOrRel#getSysRef <em>Sys Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sys Ref</em>'.
	 * @see simplekaos.KAndOrRel#getSysRef()
	 * @see #getKAndOrRel()
	 * @generated
	 */
	EAttribute getKAndOrRel_SysRef();

	/**
	 * Returns the meta object for class '{@link simplekaos.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see simplekaos.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getSonRef <em>Son Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Son Ref</em>'.
	 * @see simplekaos.Goal#getSonRef()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_SonRef();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getParentRef <em>Parent Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Ref</em>'.
	 * @see simplekaos.Goal#getParentRef()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_ParentRef();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignment</em>'.
	 * @see simplekaos.Goal#getAssignment()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.Goal#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see simplekaos.Goal#getPriority()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Priority();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflict</em>'.
	 * @see simplekaos.Goal#getConflict()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Conflict();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getObstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Obstruction</em>'.
	 * @see simplekaos.Goal#getObstruction()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Obstruction();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resolution</em>'.
	 * @see simplekaos.Goal#getResolution()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.Goal#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see simplekaos.Goal#getCategory()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Category();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Goal#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsibility</em>'.
	 * @see simplekaos.Goal#getResponsibility()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Responsibility();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.Goal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see simplekaos.Goal#getType()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Type();

	/**
	 * Returns the meta object for class '{@link simplekaos.GRefinement <em>GRefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRefinement</em>'.
	 * @see simplekaos.GRefinement
	 * @generated
	 */
	EClass getGRefinement();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.GRefinement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see simplekaos.GRefinement#getParent()
	 * @see #getGRefinement()
	 * @generated
	 */
	EReference getGRefinement_Parent();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.GRefinement#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sons</em>'.
	 * @see simplekaos.GRefinement#getSons()
	 * @see #getGRefinement()
	 * @generated
	 */
	EReference getGRefinement_Sons();

	/**
	 * Returns the meta object for class '{@link simplekaos.ORefinement <em>ORefinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORefinement</em>'.
	 * @see simplekaos.ORefinement
	 * @generated
	 */
	EClass getORefinement();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.ORefinement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see simplekaos.ORefinement#getParent()
	 * @see #getORefinement()
	 * @generated
	 */
	EReference getORefinement_Parent();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.ORefinement#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sons</em>'.
	 * @see simplekaos.ORefinement#getSons()
	 * @see #getORefinement()
	 * @generated
	 */
	EReference getORefinement_Sons();

	/**
	 * Returns the meta object for class '{@link simplekaos.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see simplekaos.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Assignment#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see simplekaos.Assignment#getGoal()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Goal();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Assignment#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignee</em>'.
	 * @see simplekaos.Assignment#getAssignee()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Assignee();

	/**
	 * Returns the meta object for class '{@link simplekaos.KReference <em>KReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KReference</em>'.
	 * @see simplekaos.KReference
	 * @generated
	 */
	EClass getKReference();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.KReference#getConceptOf <em>Concept Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept Of</em>'.
	 * @see simplekaos.KReference#getConceptOf()
	 * @see #getKReference()
	 * @generated
	 */
	EReference getKReference_ConceptOf();

	/**
	 * Returns the meta object for the container reference '{@link simplekaos.KReference#getDocumentOf <em>Document Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document Of</em>'.
	 * @see simplekaos.KReference#getDocumentOf()
	 * @see #getKReference()
	 * @generated
	 */
	EReference getKReference_DocumentOf();

	/**
	 * Returns the meta object for class '{@link simplekaos.KPackage <em>KPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPackage</em>'.
	 * @see simplekaos.KPackage
	 * @generated
	 */
	EClass getKPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link simplekaos.KPackage#getContaining <em>Containing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containing</em>'.
	 * @see simplekaos.KPackage#getContaining()
	 * @see #getKPackage()
	 * @generated
	 */
	EReference getKPackage_Containing();

	/**
	 * Returns the meta object for class '{@link simplekaos.KGReference <em>KG Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KG Reference</em>'.
	 * @see simplekaos.KGReference
	 * @generated
	 */
	EClass getKGReference();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KGReference#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see simplekaos.KGReference#getX()
	 * @see #getKGReference()
	 * @generated
	 */
	EAttribute getKGReference_X();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KGReference#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see simplekaos.KGReference#getY()
	 * @see #getKGReference()
	 * @generated
	 */
	EAttribute getKGReference_Y();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KGReference#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see simplekaos.KGReference#getWidth()
	 * @see #getKGReference()
	 * @generated
	 */
	EAttribute getKGReference_Width();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KGReference#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see simplekaos.KGReference#getHeight()
	 * @see #getKGReference()
	 * @generated
	 */
	EAttribute getKGReference_Height();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KGReference#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see simplekaos.KGReference#getLabel()
	 * @see #getKGReference()
	 * @generated
	 */
	EAttribute getKGReference_Label();

	/**
	 * Returns the meta object for class '{@link simplekaos.KRationale <em>KRationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KRationale</em>'.
	 * @see simplekaos.KRationale
	 * @generated
	 */
	EClass getKRationale();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.KRationale#getGWT <em>GWT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GWT</em>'.
	 * @see simplekaos.KRationale#getGWT()
	 * @see #getKRationale()
	 * @generated
	 */
	EAttribute getKRationale_GWT();

	/**
	 * Returns the meta object for class '{@link simplekaos.KRelationship <em>KRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KRelationship</em>'.
	 * @see simplekaos.KRelationship
	 * @generated
	 */
	EClass getKRelationship();

	/**
	 * Returns the meta object for class '{@link simplekaos.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see simplekaos.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.Conflict#getBoundaryCondition <em>Boundary Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary Condition</em>'.
	 * @see simplekaos.Conflict#getBoundaryCondition()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_BoundaryCondition();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Conflict#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal</em>'.
	 * @see simplekaos.Conflict#getGoal()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_Goal();

	/**
	 * Returns the meta object for class '{@link simplekaos.Responsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsibility</em>'.
	 * @see simplekaos.Responsibility
	 * @generated
	 */
	EClass getResponsibility();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Responsibility#getLeafGoal <em>Leaf Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leaf Goal</em>'.
	 * @see simplekaos.Responsibility#getLeafGoal()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_LeafGoal();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Responsibility#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible</em>'.
	 * @see simplekaos.Responsibility#getResponsible()
	 * @see #getResponsibility()
	 * @generated
	 */
	EReference getResponsibility_Responsible();

	/**
	 * Returns the meta object for class '{@link simplekaos.Obstruction <em>Obstruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstruction</em>'.
	 * @see simplekaos.Obstruction
	 * @generated
	 */
	EClass getObstruction();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Obstruction#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see simplekaos.Obstruction#getGoal()
	 * @see #getObstruction()
	 * @generated
	 */
	EReference getObstruction_Goal();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Obstruction#getObstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obstacle</em>'.
	 * @see simplekaos.Obstruction#getObstacle()
	 * @see #getObstruction()
	 * @generated
	 */
	EReference getObstruction_Obstacle();

	/**
	 * Returns the meta object for class '{@link simplekaos.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see simplekaos.Resolution
	 * @generated
	 */
	EClass getResolution();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Resolution#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see simplekaos.Resolution#getGoal()
	 * @see #getResolution()
	 * @generated
	 */
	EReference getResolution_Goal();

	/**
	 * Returns the meta object for the reference '{@link simplekaos.Resolution#getObstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obstacle</em>'.
	 * @see simplekaos.Resolution#getObstacle()
	 * @see #getResolution()
	 * @generated
	 */
	EReference getResolution_Obstacle();

	/**
	 * Returns the meta object for class '{@link simplekaos.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see simplekaos.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Agent#getResponsibility <em>Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsibility</em>'.
	 * @see simplekaos.Agent#getResponsibility()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Responsibility();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.Agent#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignment</em>'.
	 * @see simplekaos.Agent#getAssignment()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Assignment();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.Agent#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see simplekaos.Agent#getCategory()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Category();

	/**
	 * Returns the meta object for class '{@link simplekaos.TextDocument <em>Text Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Document</em>'.
	 * @see simplekaos.TextDocument
	 * @generated
	 */
	EClass getTextDocument();

	/**
	 * Returns the meta object for the attribute '{@link simplekaos.TextDocument#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see simplekaos.TextDocument#getContent()
	 * @see #getTextDocument()
	 * @generated
	 */
	EAttribute getTextDocument_Content();

	/**
	 * Returns the meta object for class '{@link simplekaos.KReport <em>KReport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KReport</em>'.
	 * @see simplekaos.KReport
	 * @generated
	 */
	EClass getKReport();

	/**
	 * Returns the meta object for the reference list '{@link simplekaos.KReport#getContained <em>Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained</em>'.
	 * @see simplekaos.KReport#getContained()
	 * @see #getKReport()
	 * @generated
	 */
	EReference getKReport_Contained();

	/**
	 * Returns the meta object for enum '{@link simplekaos.AgentCategory <em>Agent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agent Category</em>'.
	 * @see simplekaos.AgentCategory
	 * @generated
	 */
	EEnum getAgentCategory();

	/**
	 * Returns the meta object for enum '{@link simplekaos.PriorityType <em>Priority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Type</em>'.
	 * @see simplekaos.PriorityType
	 * @generated
	 */
	EEnum getPriorityType();

	/**
	 * Returns the meta object for enum '{@link simplekaos.GoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Goal Type</em>'.
	 * @see simplekaos.GoalType
	 * @generated
	 */
	EEnum getGoalType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplekaosFactory getSimplekaosFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link simplekaos.impl.KConceptImpl <em>KConcept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KConceptImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKConcept()
		 * @generated
		 */
		EClass KCONCEPT = eINSTANCE.getKConcept();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KCONCEPT__REFERENCES = eINSTANCE.getKConcept_References();

		/**
		 * The meta object literal for the '<em><b>Package Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KCONCEPT__PACKAGE_OF = eINSTANCE.getKConcept_PackageOf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KCONCEPT__NAME = eINSTANCE.getKConcept_Name();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KCONCEPT__DEF = eINSTANCE.getKConcept_Def();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KCONCEPT__ISSUE = eINSTANCE.getKConcept_Issue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KCONCEPT__ID = eINSTANCE.getKConcept_Id();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KObjectImpl <em>KObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KObjectImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKObject()
		 * @generated
		 */
		EClass KOBJECT = eINSTANCE.getKObject();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KDocumentImpl <em>KDocument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KDocumentImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKDocument()
		 * @generated
		 */
		EClass KDOCUMENT = eINSTANCE.getKDocument();

		/**
		 * The meta object literal for the '<em><b>Containing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KDOCUMENT__CONTAINING = eINSTANCE.getKDocument_Containing();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KDiagramImpl <em>KDiagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KDiagramImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKDiagram()
		 * @generated
		 */
		EClass KDIAGRAM = eINSTANCE.getKDiagram();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ObstacleImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '<em><b>Son Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__SON_REF = eINSTANCE.getObstacle_SonRef();

		/**
		 * The meta object literal for the '<em><b>Parent Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__PARENT_REF = eINSTANCE.getObstacle_ParentRef();

		/**
		 * The meta object literal for the '<em><b>Obstruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__OBSTRUCTION = eINSTANCE.getObstacle_Obstruction();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTACLE__RESOLUTION = eINSTANCE.getObstacle_Resolution();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KAndOrRelImpl <em>KAnd Or Rel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KAndOrRelImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKAndOrRel()
		 * @generated
		 */
		EClass KAND_OR_REL = eINSTANCE.getKAndOrRel();

		/**
		 * The meta object literal for the '<em><b>Sys Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KAND_OR_REL__SYS_REF = eINSTANCE.getKAndOrRel_SysRef();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.GoalImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Son Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SON_REF = eINSTANCE.getGoal_SonRef();

		/**
		 * The meta object literal for the '<em><b>Parent Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__PARENT_REF = eINSTANCE.getGoal_ParentRef();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ASSIGNMENT = eINSTANCE.getGoal_Assignment();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__PRIORITY = eINSTANCE.getGoal_Priority();

		/**
		 * The meta object literal for the '<em><b>Conflict</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONFLICT = eINSTANCE.getGoal_Conflict();

		/**
		 * The meta object literal for the '<em><b>Obstruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__OBSTRUCTION = eINSTANCE.getGoal_Obstruction();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RESOLUTION = eINSTANCE.getGoal_Resolution();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__CATEGORY = eINSTANCE.getGoal_Category();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__RESPONSIBILITY = eINSTANCE.getGoal_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__TYPE = eINSTANCE.getGoal_Type();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.GRefinementImpl <em>GRefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.GRefinementImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getGRefinement()
		 * @generated
		 */
		EClass GREFINEMENT = eINSTANCE.getGRefinement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREFINEMENT__PARENT = eINSTANCE.getGRefinement_Parent();

		/**
		 * The meta object literal for the '<em><b>Sons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GREFINEMENT__SONS = eINSTANCE.getGRefinement_Sons();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ORefinementImpl <em>ORefinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ORefinementImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getORefinement()
		 * @generated
		 */
		EClass OREFINEMENT = eINSTANCE.getORefinement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OREFINEMENT__PARENT = eINSTANCE.getORefinement_Parent();

		/**
		 * The meta object literal for the '<em><b>Sons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OREFINEMENT__SONS = eINSTANCE.getORefinement_Sons();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.AssignmentImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__GOAL = eINSTANCE.getAssignment_Goal();

		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNEE = eINSTANCE.getAssignment_Assignee();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KReferenceImpl <em>KReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KReferenceImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKReference()
		 * @generated
		 */
		EClass KREFERENCE = eINSTANCE.getKReference();

		/**
		 * The meta object literal for the '<em><b>Concept Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREFERENCE__CONCEPT_OF = eINSTANCE.getKReference_ConceptOf();

		/**
		 * The meta object literal for the '<em><b>Document Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREFERENCE__DOCUMENT_OF = eINSTANCE.getKReference_DocumentOf();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KPackageImpl <em>KPackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KPackageImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKPackage()
		 * @generated
		 */
		EClass KPACKAGE = eINSTANCE.getKPackage();

		/**
		 * The meta object literal for the '<em><b>Containing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPACKAGE__CONTAINING = eINSTANCE.getKPackage_Containing();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KGReferenceImpl <em>KG Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KGReferenceImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKGReference()
		 * @generated
		 */
		EClass KG_REFERENCE = eINSTANCE.getKGReference();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KG_REFERENCE__X = eINSTANCE.getKGReference_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KG_REFERENCE__Y = eINSTANCE.getKGReference_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KG_REFERENCE__WIDTH = eINSTANCE.getKGReference_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KG_REFERENCE__HEIGHT = eINSTANCE.getKGReference_Height();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KG_REFERENCE__LABEL = eINSTANCE.getKGReference_Label();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KRationaleImpl <em>KRationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KRationaleImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKRationale()
		 * @generated
		 */
		EClass KRATIONALE = eINSTANCE.getKRationale();

		/**
		 * The meta object literal for the '<em><b>GWT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRATIONALE__GWT = eINSTANCE.getKRationale_GWT();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KRelationshipImpl <em>KRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KRelationshipImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKRelationship()
		 * @generated
		 */
		EClass KRELATIONSHIP = eINSTANCE.getKRelationship();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ConflictImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>Boundary Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__BOUNDARY_CONDITION = eINSTANCE.getConflict_BoundaryCondition();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__GOAL = eINSTANCE.getConflict_Goal();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ResponsibilityImpl <em>Responsibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ResponsibilityImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getResponsibility()
		 * @generated
		 */
		EClass RESPONSIBILITY = eINSTANCE.getResponsibility();

		/**
		 * The meta object literal for the '<em><b>Leaf Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__LEAF_GOAL = eINSTANCE.getResponsibility_LeafGoal();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSIBILITY__RESPONSIBLE = eINSTANCE.getResponsibility_Responsible();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ObstructionImpl <em>Obstruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ObstructionImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getObstruction()
		 * @generated
		 */
		EClass OBSTRUCTION = eINSTANCE.getObstruction();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTRUCTION__GOAL = eINSTANCE.getObstruction_Goal();

		/**
		 * The meta object literal for the '<em><b>Obstacle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSTRUCTION__OBSTACLE = eINSTANCE.getObstruction_Obstacle();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.ResolutionImpl <em>Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.ResolutionImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getResolution()
		 * @generated
		 */
		EClass RESOLUTION = eINSTANCE.getResolution();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION__GOAL = eINSTANCE.getResolution_Goal();

		/**
		 * The meta object literal for the '<em><b>Obstacle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLUTION__OBSTACLE = eINSTANCE.getResolution_Obstacle();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.AgentImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__RESPONSIBILITY = eINSTANCE.getAgent_Responsibility();

		/**
		 * The meta object literal for the '<em><b>Assignment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ASSIGNMENT = eINSTANCE.getAgent_Assignment();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__CATEGORY = eINSTANCE.getAgent_Category();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.TextDocumentImpl <em>Text Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.TextDocumentImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getTextDocument()
		 * @generated
		 */
		EClass TEXT_DOCUMENT = eINSTANCE.getTextDocument();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_DOCUMENT__CONTENT = eINSTANCE.getTextDocument_Content();

		/**
		 * The meta object literal for the '{@link simplekaos.impl.KReportImpl <em>KReport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.impl.KReportImpl
		 * @see simplekaos.impl.SimplekaosPackageImpl#getKReport()
		 * @generated
		 */
		EClass KREPORT = eINSTANCE.getKReport();

		/**
		 * The meta object literal for the '<em><b>Contained</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KREPORT__CONTAINED = eINSTANCE.getKReport_Contained();

		/**
		 * The meta object literal for the '{@link simplekaos.AgentCategory <em>Agent Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.AgentCategory
		 * @see simplekaos.impl.SimplekaosPackageImpl#getAgentCategory()
		 * @generated
		 */
		EEnum AGENT_CATEGORY = eINSTANCE.getAgentCategory();

		/**
		 * The meta object literal for the '{@link simplekaos.PriorityType <em>Priority Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.PriorityType
		 * @see simplekaos.impl.SimplekaosPackageImpl#getPriorityType()
		 * @generated
		 */
		EEnum PRIORITY_TYPE = eINSTANCE.getPriorityType();

		/**
		 * The meta object literal for the '{@link simplekaos.GoalType <em>Goal Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see simplekaos.GoalType
		 * @see simplekaos.impl.SimplekaosPackageImpl#getGoalType()
		 * @generated
		 */
		EEnum GOAL_TYPE = eINSTANCE.getGoalType();

	}

} //SimplekaosPackage
