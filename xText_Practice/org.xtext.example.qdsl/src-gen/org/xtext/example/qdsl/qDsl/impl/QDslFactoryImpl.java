/**
 */
package org.xtext.example.qdsl.qDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.qdsl.qDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QDslFactoryImpl extends EFactoryImpl implements QDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QDslFactory init()
  {
    try
    {
      QDslFactory theQDslFactory = (QDslFactory)EPackage.Registry.INSTANCE.getEFactory(QDslPackage.eNS_URI);
      if (theQDslFactory != null)
      {
        return theQDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QDslPackage.MODEL: return createModel();
      case QDslPackage.QUESTION: return createQuestion();
      case QDslPackage.QUESTION_CONTENT: return createquestionContent();
      case QDslPackage.ANSWER_TYPE: return createAnswerType();
      case QDslPackage.CHOOSE_FROM: return createChooseFrom();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public questionContent createquestionContent()
  {
    questionContentImpl questionContent = new questionContentImpl();
    return questionContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnswerType createAnswerType()
  {
    AnswerTypeImpl answerType = new AnswerTypeImpl();
    return answerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChooseFrom createChooseFrom()
  {
    ChooseFromImpl chooseFrom = new ChooseFromImpl();
    return chooseFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QDslPackage getQDslPackage()
  {
    return (QDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QDslPackage getPackage()
  {
    return QDslPackage.eINSTANCE;
  }

} //QDslFactoryImpl
