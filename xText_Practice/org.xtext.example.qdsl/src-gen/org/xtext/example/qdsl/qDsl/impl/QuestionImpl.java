/**
 */
package org.xtext.example.qdsl.qDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.qdsl.qDsl.AnswerType;
import org.xtext.example.qdsl.qDsl.ChooseFrom;
import org.xtext.example.qdsl.qDsl.QDslPackage;
import org.xtext.example.qdsl.qDsl.Question;
import org.xtext.example.qdsl.qDsl.questionContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl#getAnswerTypes <em>Answer Types</em>}</li>
 *   <li>{@link org.xtext.example.qdsl.qDsl.impl.QuestionImpl#getChooseFroms <em>Choose Froms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContents()
   * @generated
   * @ordered
   */
  protected questionContent contents;

  /**
   * The cached value of the '{@link #getAnswerTypes() <em>Answer Types</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswerTypes()
   * @generated
   * @ordered
   */
  protected AnswerType answerTypes;

  /**
   * The cached value of the '{@link #getChooseFroms() <em>Choose Froms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChooseFroms()
   * @generated
   * @ordered
   */
  protected ChooseFrom chooseFroms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionImpl()
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
    return QDslPackage.Literals.QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public questionContent getContents()
  {
    return contents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContents(questionContent newContents, NotificationChain msgs)
  {
    questionContent oldContents = contents;
    contents = newContents;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__CONTENTS, oldContents, newContents);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContents(questionContent newContents)
  {
    if (newContents != contents)
    {
      NotificationChain msgs = null;
      if (contents != null)
        msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__CONTENTS, null, msgs);
      if (newContents != null)
        msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__CONTENTS, null, msgs);
      msgs = basicSetContents(newContents, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__CONTENTS, newContents, newContents));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnswerType getAnswerTypes()
  {
    return answerTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnswerTypes(AnswerType newAnswerTypes, NotificationChain msgs)
  {
    AnswerType oldAnswerTypes = answerTypes;
    answerTypes = newAnswerTypes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__ANSWER_TYPES, oldAnswerTypes, newAnswerTypes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswerTypes(AnswerType newAnswerTypes)
  {
    if (newAnswerTypes != answerTypes)
    {
      NotificationChain msgs = null;
      if (answerTypes != null)
        msgs = ((InternalEObject)answerTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__ANSWER_TYPES, null, msgs);
      if (newAnswerTypes != null)
        msgs = ((InternalEObject)newAnswerTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__ANSWER_TYPES, null, msgs);
      msgs = basicSetAnswerTypes(newAnswerTypes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__ANSWER_TYPES, newAnswerTypes, newAnswerTypes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChooseFrom getChooseFroms()
  {
    return chooseFroms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChooseFroms(ChooseFrom newChooseFroms, NotificationChain msgs)
  {
    ChooseFrom oldChooseFroms = chooseFroms;
    chooseFroms = newChooseFroms;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__CHOOSE_FROMS, oldChooseFroms, newChooseFroms);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChooseFroms(ChooseFrom newChooseFroms)
  {
    if (newChooseFroms != chooseFroms)
    {
      NotificationChain msgs = null;
      if (chooseFroms != null)
        msgs = ((InternalEObject)chooseFroms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__CHOOSE_FROMS, null, msgs);
      if (newChooseFroms != null)
        msgs = ((InternalEObject)newChooseFroms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QDslPackage.QUESTION__CHOOSE_FROMS, null, msgs);
      msgs = basicSetChooseFroms(newChooseFroms, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QDslPackage.QUESTION__CHOOSE_FROMS, newChooseFroms, newChooseFroms));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QDslPackage.QUESTION__CONTENTS:
        return basicSetContents(null, msgs);
      case QDslPackage.QUESTION__ANSWER_TYPES:
        return basicSetAnswerTypes(null, msgs);
      case QDslPackage.QUESTION__CHOOSE_FROMS:
        return basicSetChooseFroms(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QDslPackage.QUESTION__NAME:
        return getName();
      case QDslPackage.QUESTION__CONTENTS:
        return getContents();
      case QDslPackage.QUESTION__ANSWER_TYPES:
        return getAnswerTypes();
      case QDslPackage.QUESTION__CHOOSE_FROMS:
        return getChooseFroms();
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
      case QDslPackage.QUESTION__NAME:
        setName((String)newValue);
        return;
      case QDslPackage.QUESTION__CONTENTS:
        setContents((questionContent)newValue);
        return;
      case QDslPackage.QUESTION__ANSWER_TYPES:
        setAnswerTypes((AnswerType)newValue);
        return;
      case QDslPackage.QUESTION__CHOOSE_FROMS:
        setChooseFroms((ChooseFrom)newValue);
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
      case QDslPackage.QUESTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QDslPackage.QUESTION__CONTENTS:
        setContents((questionContent)null);
        return;
      case QDslPackage.QUESTION__ANSWER_TYPES:
        setAnswerTypes((AnswerType)null);
        return;
      case QDslPackage.QUESTION__CHOOSE_FROMS:
        setChooseFroms((ChooseFrom)null);
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
      case QDslPackage.QUESTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QDslPackage.QUESTION__CONTENTS:
        return contents != null;
      case QDslPackage.QUESTION__ANSWER_TYPES:
        return answerTypes != null;
      case QDslPackage.QUESTION__CHOOSE_FROMS:
        return chooseFroms != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //QuestionImpl
