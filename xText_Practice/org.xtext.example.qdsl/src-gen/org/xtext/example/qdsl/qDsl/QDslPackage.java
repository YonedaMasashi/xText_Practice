/**
 */
package org.xtext.example.qdsl.qDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.qdsl.qDsl.QDslFactory
 * @model kind="package"
 * @generated
 */
public interface QDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "qDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/qdsl/QDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "qDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QDslPackage eINSTANCE = org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.qdsl.qDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.qdsl.qDsl.impl.ModelImpl
   * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.qdsl.qDsl.impl.QuestionImpl
   * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__CONTENTS = 1;

  /**
   * The feature id for the '<em><b>Answer Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ANSWER_TYPES = 2;

  /**
   * The feature id for the '<em><b>Choose Froms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__CHOOSE_FROMS = 3;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.qdsl.qDsl.impl.questionContentImpl <em>question Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.qdsl.qDsl.impl.questionContentImpl
   * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getquestionContent()
   * @generated
   */
  int QUESTION_CONTENT = 2;

  /**
   * The feature id for the '<em><b>Qcontent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_CONTENT__QCONTENT = 0;

  /**
   * The number of structural features of the '<em>question Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_CONTENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.qdsl.qDsl.impl.AnswerTypeImpl <em>Answer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.qdsl.qDsl.impl.AnswerTypeImpl
   * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getAnswerType()
   * @generated
   */
  int ANSWER_TYPE = 3;

  /**
   * The feature id for the '<em><b>Atype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_TYPE__ATYPE = 0;

  /**
   * The number of structural features of the '<em>Answer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.qdsl.qDsl.impl.ChooseFromImpl <em>Choose From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.qdsl.qDsl.impl.ChooseFromImpl
   * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getChooseFrom()
   * @generated
   */
  int CHOOSE_FROM = 4;

  /**
   * The feature id for the '<em><b>Choices</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSE_FROM__CHOICES = 0;

  /**
   * The number of structural features of the '<em>Choose From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOOSE_FROM_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.qdsl.qDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.qdsl.qDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.qdsl.qDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.qdsl.qDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.qdsl.qDsl.Model#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.xtext.example.qdsl.qDsl.Model#getQuestions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Questions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.qdsl.qDsl.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.xtext.example.qdsl.qDsl.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.qdsl.qDsl.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.qdsl.qDsl.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.qdsl.qDsl.Question#getContents <em>Contents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contents</em>'.
   * @see org.xtext.example.qdsl.qDsl.Question#getContents()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Contents();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.qdsl.qDsl.Question#getAnswerTypes <em>Answer Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Answer Types</em>'.
   * @see org.xtext.example.qdsl.qDsl.Question#getAnswerTypes()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_AnswerTypes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.qdsl.qDsl.Question#getChooseFroms <em>Choose Froms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Choose Froms</em>'.
   * @see org.xtext.example.qdsl.qDsl.Question#getChooseFroms()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_ChooseFroms();

  /**
   * Returns the meta object for class '{@link org.xtext.example.qdsl.qDsl.questionContent <em>question Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>question Content</em>'.
   * @see org.xtext.example.qdsl.qDsl.questionContent
   * @generated
   */
  EClass getquestionContent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.qdsl.qDsl.questionContent#getQcontent <em>Qcontent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qcontent</em>'.
   * @see org.xtext.example.qdsl.qDsl.questionContent#getQcontent()
   * @see #getquestionContent()
   * @generated
   */
  EAttribute getquestionContent_Qcontent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.qdsl.qDsl.AnswerType <em>Answer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answer Type</em>'.
   * @see org.xtext.example.qdsl.qDsl.AnswerType
   * @generated
   */
  EClass getAnswerType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.qdsl.qDsl.AnswerType#getAtype <em>Atype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atype</em>'.
   * @see org.xtext.example.qdsl.qDsl.AnswerType#getAtype()
   * @see #getAnswerType()
   * @generated
   */
  EAttribute getAnswerType_Atype();

  /**
   * Returns the meta object for class '{@link org.xtext.example.qdsl.qDsl.ChooseFrom <em>Choose From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choose From</em>'.
   * @see org.xtext.example.qdsl.qDsl.ChooseFrom
   * @generated
   */
  EClass getChooseFrom();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.qdsl.qDsl.ChooseFrom#getChoices <em>Choices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Choices</em>'.
   * @see org.xtext.example.qdsl.qDsl.ChooseFrom#getChoices()
   * @see #getChooseFrom()
   * @generated
   */
  EAttribute getChooseFrom_Choices();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QDslFactory getQDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.qdsl.qDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.qdsl.qDsl.impl.ModelImpl
     * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__QUESTIONS = eINSTANCE.getModel_Questions();

    /**
     * The meta object literal for the '{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.qdsl.qDsl.impl.QuestionImpl
     * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__CONTENTS = eINSTANCE.getQuestion_Contents();

    /**
     * The meta object literal for the '<em><b>Answer Types</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__ANSWER_TYPES = eINSTANCE.getQuestion_AnswerTypes();

    /**
     * The meta object literal for the '<em><b>Choose Froms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__CHOOSE_FROMS = eINSTANCE.getQuestion_ChooseFroms();

    /**
     * The meta object literal for the '{@link org.xtext.example.qdsl.qDsl.impl.questionContentImpl <em>question Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.qdsl.qDsl.impl.questionContentImpl
     * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getquestionContent()
     * @generated
     */
    EClass QUESTION_CONTENT = eINSTANCE.getquestionContent();

    /**
     * The meta object literal for the '<em><b>Qcontent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_CONTENT__QCONTENT = eINSTANCE.getquestionContent_Qcontent();

    /**
     * The meta object literal for the '{@link org.xtext.example.qdsl.qDsl.impl.AnswerTypeImpl <em>Answer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.qdsl.qDsl.impl.AnswerTypeImpl
     * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getAnswerType()
     * @generated
     */
    EClass ANSWER_TYPE = eINSTANCE.getAnswerType();

    /**
     * The meta object literal for the '<em><b>Atype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER_TYPE__ATYPE = eINSTANCE.getAnswerType_Atype();

    /**
     * The meta object literal for the '{@link org.xtext.example.qdsl.qDsl.impl.ChooseFromImpl <em>Choose From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.qdsl.qDsl.impl.ChooseFromImpl
     * @see org.xtext.example.qdsl.qDsl.impl.QDslPackageImpl#getChooseFrom()
     * @generated
     */
    EClass CHOOSE_FROM = eINSTANCE.getChooseFrom();

    /**
     * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOOSE_FROM__CHOICES = eINSTANCE.getChooseFrom_Choices();

  }

} //QDslPackage
