/**
 */
package org.xtext.example.qdsl.qDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.qdsl.qDsl.AnswerType;
import org.xtext.example.qdsl.qDsl.QDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.AnswerTypeImpl#getAtype <em>Atype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerTypeImpl extends MinimalEObjectImpl.Container implements AnswerType
{
  /**
   * The default value of the '{@link #getAtype() <em>Atype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtype()
   * @generated
   * @ordered
   */
  protected static final String ATYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtype() <em>Atype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtype()
   * @generated
   * @ordered
   */
  protected String atype = ATYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnswerTypeImpl()
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
    return QDslPackage.Literals.ANSWER_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtype()
  {
    return atype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtype(String newAtype)
  {
    String oldAtype = atype;
    atype = newAtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.ANSWER_TYPE__ATYPE, oldAtype, atype));
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
      case QDslPackage.ANSWER_TYPE__ATYPE:
        return getAtype();
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
      case QDslPackage.ANSWER_TYPE__ATYPE:
        setAtype((String)newValue);
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
      case QDslPackage.ANSWER_TYPE__ATYPE:
        setAtype(ATYPE_EDEFAULT);
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
      case QDslPackage.ANSWER_TYPE__ATYPE:
        return ATYPE_EDEFAULT == null ? atype != null : !ATYPE_EDEFAULT.equals(atype);
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
    result.append(" (atype: ");
    result.append(atype);
    result.append(')');
    return result.toString();
  }

} //AnswerTypeImpl
