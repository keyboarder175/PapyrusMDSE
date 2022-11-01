/**
 */
package MDSEPraes2.impl;

import MDSEPraes2.MDSEPraes2Package;
import MDSEPraes2.SecurityLager;
import MDSEPraes2.SecurityLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Lager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSEPraes2.impl.SecurityLagerImpl#getSecutiryLevel <em>Secutiry Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLagerImpl extends LagerImpl implements SecurityLager {
	/**
	 * The default value of the '{@link #getSecutiryLevel() <em>Secutiry Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecutiryLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel SECUTIRY_LEVEL_EDEFAULT = SecurityLevel.LOW_SECUTIRY;

	/**
	 * The cached value of the '{@link #getSecutiryLevel() <em>Secutiry Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecutiryLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel secutiryLevel = SECUTIRY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSEPraes2Package.Literals.SECURITY_LAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel getSecutiryLevel() {
		return secutiryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecutiryLevel(SecurityLevel newSecutiryLevel) {
		SecurityLevel oldSecutiryLevel = secutiryLevel;
		secutiryLevel = newSecutiryLevel == null ? SECUTIRY_LEVEL_EDEFAULT : newSecutiryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSEPraes2Package.SECURITY_LAGER__SECUTIRY_LEVEL, oldSecutiryLevel, secutiryLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDSEPraes2Package.SECURITY_LAGER__SECUTIRY_LEVEL:
				return getSecutiryLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MDSEPraes2Package.SECURITY_LAGER__SECUTIRY_LEVEL:
				setSecutiryLevel((SecurityLevel)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MDSEPraes2Package.SECURITY_LAGER__SECUTIRY_LEVEL:
				setSecutiryLevel(SECUTIRY_LEVEL_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MDSEPraes2Package.SECURITY_LAGER__SECUTIRY_LEVEL:
				return secutiryLevel != SECUTIRY_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (secutiryLevel: ");
		result.append(secutiryLevel);
		result.append(')');
		return result.toString();
	}

} //SecurityLagerImpl
