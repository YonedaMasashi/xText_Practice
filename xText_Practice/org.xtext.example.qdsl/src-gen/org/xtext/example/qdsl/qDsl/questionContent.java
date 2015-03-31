/**
 */
package org.xtext.example.qdsl.qDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>question Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.questionContent#getQcontent <em>Qcontent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.qdsl.qDsl.QDslPackage#getquestionContent()
 * @model
 * @generated
 */
public interface questionContent extends EObject
{
  /**
   * Returns the value of the '<em><b>Qcontent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qcontent</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qcontent</em>' attribute.
   * @see #setQcontent(String)
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getquestionContent_Qcontent()
   * @model
   * @generated
   */
  String getQcontent();

  /**
   * Sets the value of the '{@link org.xtext.example.qdsl.qDsl.questionContent#getQcontent <em>Qcontent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qcontent</em>' attribute.
   * @see #getQcontent()
   * @generated
   */
  void setQcontent(String value);

} // questionContent
