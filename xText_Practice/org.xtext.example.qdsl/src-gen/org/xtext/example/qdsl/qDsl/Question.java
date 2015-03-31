/**
 */
package org.xtext.example.qdsl.qDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.Question#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.Question#getContents <em>Contents</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.Question#getAnswerTypes <em>Answer Types</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.Question#getChooseFroms <em>Choose Froms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.qdsl.qDsl.QDslPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getQuestion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.Question#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Contents</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contents</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contents</em>' containment reference.
   * @see #setContents(questionContent)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getQuestion_Contents()
   * @model containment="true"
   * @generated
   */
  questionContent getContents();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.Question#getContents <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contents</em>' containment reference.
   * @see #getContents()
   * @generated
   */
  void setContents(questionContent value);

  /**
   * Returns the value of the '<em><b>Answer Types</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer Types</em>' containment reference.
   * @see #setAnswerTypes(AnswerType)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getQuestion_AnswerTypes()
   * @model containment="true"
   * @generated
   */
  AnswerType getAnswerTypes();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.Question#getAnswerTypes <em>Answer Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer Types</em>' containment reference.
   * @see #getAnswerTypes()
   * @generated
   */
  void setAnswerTypes(AnswerType value);

  /**
   * Returns the value of the '<em><b>Choose Froms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choose Froms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choose Froms</em>' containment reference.
   * @see #setChooseFroms(ChooseFrom)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getQuestion_ChooseFroms()
   * @model containment="true"
   * @generated
   */
  ChooseFrom getChooseFroms();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.Question#getChooseFroms <em>Choose Froms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Choose Froms</em>' containment reference.
   * @see #getChooseFroms()
   * @generated
   */
  void setChooseFroms(ChooseFrom value);

} // Question
