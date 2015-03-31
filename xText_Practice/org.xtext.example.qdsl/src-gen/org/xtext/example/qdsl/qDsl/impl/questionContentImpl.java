/**
 */
package org.xtext.example.qdsl.qDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.qdsl.qDsl.QDslPackage;
import org.xtext.example.qdsl.qDsl.questionContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>question Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.questionContentImpl#getQcontent <em>Qcontent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class questionContentImpl extends MinimalEObjectImpl.Container implements questionContent
{
  /**
   * The default value of the '{@link #getQcontent() <em>Qcontent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQcontent()
   * @generated
   * @ordered
   */
  protected static final String QCONTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQcontent() <em>Qcontent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQcontent()
   * @generated
   * @ordered
   */
  protected String qcontent = QCONTENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected questionContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QDslPackage.Literals.QUESTION_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQcontent()
  {
    return qcontent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQcontent(String newQcontent)
  {
    String oldQcontent = qcontent;
    qcontent = newQcontent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION_CONTENT__QCONTENT, oldQcontent, qcontent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QDslPackage.QUESTION_CONTENT__QCONTENT:
        return getQcontent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QDslPackage.QUESTION_CONTENT__QCONTENT:
        setQcontent((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QDslPackage.QUESTION_CONTENT__QCONTENT:
        setQcontent(QCONTENT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QDslPackage.QUESTION_CONTENT__QCONTENT:
        return QCONTENT_EDEFAULT == null ? qcontent != null : !QCONTENT_EDEFAULT.equals(qcontent);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (qcontent: ");
    result.append(qcontent);
    result.append(')');
    return result.toString();
  }

} //questionContentImpl
