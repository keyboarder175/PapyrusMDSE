/**
 */
package MDSEPraes2.impl;

import MDSEPraes2.MDSEPraes2Package;
import MDSEPraes2.SecurityArtikel;
import MDSEPraes2.SecurityLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Artikel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDSEPraes2.impl.SecurityArtikelImpl#getNeededSecurityLevel <em>Needed Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityArtikelImpl extends ArtikelImpl implements SecurityArtikel {
	/**
	 * The default value of the '{@link #getNeededSecurityLevel() <em>Needed Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityLevel NEEDED_SECURITY_LEVEL_EDEFAULT = SecurityLevel.LOW_SECUTIRY;

	/**
	 * The cached value of the '{@link #getNeededSecurityLevel() <em>Needed Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeededSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel neededSecurityLevel = NEEDED_SECURITY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityArtikelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDSEPraes2Package.Literals.SECURITY_ARTIKEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel getNeededSecurityLevel() {
		return neededSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeededSecurityLevel(SecurityLevel newNeededSecurityLevel) {
		SecurityLevel oldNeededSecurityLevel = neededSecurityLevel;
		neededSecurityLevel = newNeededSecurityLevel == null ? NEEDED_SECURITY_LEVEL_EDEFAULT : newNeededSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDSEPraes2Package.SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL, oldNeededSecurityLevel, neededSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MDSEPraes2Package.SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL:
				return getNeededSecurityLevel();
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
			case MDSEPraes2Package.SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL:
				setNeededSecurityLevel((SecurityLevel)newValue);
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
			case MDSEPraes2Package.SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL:
				setNeededSecurityLevel(NEEDED_SECURITY_LEVEL_EDEFAULT);
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
			case MDSEPraes2Package.SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL:
				return neededSecurityLevel != NEEDED_SECURITY_LEVEL_EDEFAULT;
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
		result.append(" (neededSecurityLevel: ");
		result.append(neededSecurityLevel);
		result.append(')');
		return result.toString();
	}

} //SecurityArtikelImpl
