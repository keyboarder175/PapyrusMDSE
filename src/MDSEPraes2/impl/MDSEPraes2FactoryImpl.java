/**
 */
package MDSEPraes2.impl;

import MDSEPraes2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDSEPraes2FactoryImpl extends EFactoryImpl implements MDSEPraes2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MDSEPraes2Factory init() {
		try {
			MDSEPraes2Factory theMDSEPraes2Factory = (MDSEPraes2Factory)EPackage.Registry.INSTANCE.getEFactory(MDSEPraes2Package.eNS_URI);
			if (theMDSEPraes2Factory != null) {
				return theMDSEPraes2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MDSEPraes2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSEPraes2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MDSEPraes2Package.LAGER: return createLager();
			case MDSEPraes2Package.ARTIKEL: return createArtikel();
			case MDSEPraes2Package.SECURITY_LAGER: return createSecurityLager();
			case MDSEPraes2Package.SECURITY_ARTIKEL: return createSecurityArtikel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MDSEPraes2Package.SECURITY_LEVEL:
				return createSecurityLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MDSEPraes2Package.SECURITY_LEVEL:
				return convertSecurityLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lager createLager() {
		LagerImpl lager = new LagerImpl();
		return lager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artikel createArtikel() {
		ArtikelImpl artikel = new ArtikelImpl();
		return artikel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLager createSecurityLager() {
		SecurityLagerImpl securityLager = new SecurityLagerImpl();
		return securityLager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityArtikel createSecurityArtikel() {
		SecurityArtikelImpl securityArtikel = new SecurityArtikelImpl();
		return securityArtikel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityLevel createSecurityLevelFromString(EDataType eDataType, String initialValue) {
		SecurityLevel result = SecurityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSEPraes2Package getMDSEPraes2Package() {
		return (MDSEPraes2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MDSEPraes2Package getPackage() {
		return MDSEPraes2Package.eINSTANCE;
	}

} //MDSEPraes2FactoryImpl
