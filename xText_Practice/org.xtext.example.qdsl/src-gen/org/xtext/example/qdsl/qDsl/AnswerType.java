/**
 */
package org.xtext.example.qdsl.qDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.AnswerType#getAtype <em>Atype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.qdsl.qDsl.QDslPackage#getAnswerType()
 * @model
 * @generated
 */
public interface AnswerType extends EObject
{
  /**
   * Returns the value of the '<em><b>Atype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atype</em>' attribute.
   * @see #setAtype(String)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getAnswerType_Atype()
   * @model
   * @generated
   */
  String getAtype();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.AnswerType#getAtype <em>Atype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atype</em>' attribute.
   * @see #getAtype()
   * @generated
   */
  void setAtype(String value);

} // AnswerType
