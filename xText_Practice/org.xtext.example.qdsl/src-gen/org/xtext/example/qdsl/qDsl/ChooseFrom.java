/**
 */
package org.xtext.example.qdsl.qDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choose From</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.ChooseFrom#getChoices <em>Choices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.qdsl.qDsl.QDslPackage#getChooseFrom()
 * @model
 * @generated
 */
public interface ChooseFrom extends EObject
{
  /**
   * Returns the value of the '<em><b>Choices</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choices</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choices</em>' attribute list.
   * @see org.xtext.example.qdsl.qDsl.QDslPackage#getChooseFrom_Choices()
   * @model unique="false"
   * @generated
   */
  EList<String> getChoices();

} // ChooseFrom
