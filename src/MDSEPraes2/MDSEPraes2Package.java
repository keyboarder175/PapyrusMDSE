/**
 */
package MDSEPraes2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MDSEPraes2.MDSEPraes2Factory
 * @model kind="package"
 * @generated
 */
public interface MDSEPraes2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MDSEPraes2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///MDSEPraes2.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MDSEPraes2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSEPraes2Package eINSTANCE = MDSEPraes2.impl.MDSEPraes2PackageImpl.init();

	/**
	 * The meta object id for the '{@link MDSEPraes2.impl.LagerImpl <em>Lager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSEPraes2.impl.LagerImpl
	 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getLager()
	 * @generated
	 */
	int LAGER = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Artikel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER__ARTIKEL = 1;

	/**
	 * The number of structural features of the '<em>Lager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Artikel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER___ADD_ARTIKEL__ARTIKEL = 0;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER___PRINT = 1;

	/**
	 * The number of operations of the '<em>Lager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAGER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link MDSEPraes2.impl.ArtikelImpl <em>Artikel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSEPraes2.impl.ArtikelImpl
	 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getArtikel()
	 * @generated
	 */
	int ARTIKEL = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIKEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIKEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Artikel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIKEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Artikel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIKEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MDSEPraes2.impl.SecurityLagerImpl <em>Security Lager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSEPraes2.impl.SecurityLagerImpl
	 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityLager()
	 * @generated
	 */
	int SECURITY_LAGER = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER__ID = LAGER__ID;

	/**
	 * The feature id for the '<em><b>Artikel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER__ARTIKEL = LAGER__ARTIKEL;

	/**
	 * The feature id for the '<em><b>Secutiry Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER__SECUTIRY_LEVEL = LAGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Lager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER_FEATURE_COUNT = LAGER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Artikel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER___ADD_ARTIKEL__ARTIKEL = LAGER___ADD_ARTIKEL__ARTIKEL;

	/**
	 * The operation id for the '<em>Print</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER___PRINT = LAGER___PRINT;

	/**
	 * The number of operations of the '<em>Security Lager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LAGER_OPERATION_COUNT = LAGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSEPraes2.impl.SecurityArtikelImpl <em>Security Artikel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSEPraes2.impl.SecurityArtikelImpl
	 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityArtikel()
	 * @generated
	 */
	int SECURITY_ARTIKEL = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ARTIKEL__ID = ARTIKEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ARTIKEL__NAME = ARTIKEL__NAME;

	/**
	 * The feature id for the '<em><b>Needed Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL = ARTIKEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Artikel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ARTIKEL_FEATURE_COUNT = ARTIKEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Artikel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ARTIKEL_OPERATION_COUNT = ARTIKEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MDSEPraes2.SecurityLevel <em>Security Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MDSEPraes2.SecurityLevel
	 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 4;


	/**
	 * Returns the meta object for class '{@link MDSEPraes2.Lager <em>Lager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lager</em>'.
	 * @see MDSEPraes2.Lager
	 * @generated
	 */
	EClass getLager();

	/**
	 * Returns the meta object for the attribute '{@link MDSEPraes2.Lager#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see MDSEPraes2.Lager#getID()
	 * @see #getLager()
	 * @generated
	 */
	EAttribute getLager_ID();

	/**
	 * Returns the meta object for the reference list '{@link MDSEPraes2.Lager#getArtikel <em>Artikel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artikel</em>'.
	 * @see MDSEPraes2.Lager#getArtikel()
	 * @see #getLager()
	 * @generated
	 */
	EReference getLager_Artikel();

	/**
	 * Returns the meta object for the '{@link MDSEPraes2.Lager#addArtikel(MDSEPraes2.Artikel) <em>Add Artikel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Artikel</em>' operation.
	 * @see MDSEPraes2.Lager#addArtikel(MDSEPraes2.Artikel)
	 * @generated
	 */
	EOperation getLager__AddArtikel__Artikel();

	/**
	 * Returns the meta object for the '{@link MDSEPraes2.Lager#print() <em>Print</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print</em>' operation.
	 * @see MDSEPraes2.Lager#print()
	 * @generated
	 */
	EOperation getLager__Print();

	/**
	 * Returns the meta object for class '{@link MDSEPraes2.Artikel <em>Artikel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artikel</em>'.
	 * @see MDSEPraes2.Artikel
	 * @generated
	 */
	EClass getArtikel();

	/**
	 * Returns the meta object for the attribute '{@link MDSEPraes2.Artikel#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see MDSEPraes2.Artikel#getID()
	 * @see #getArtikel()
	 * @generated
	 */
	EAttribute getArtikel_ID();

	/**
	 * Returns the meta object for the attribute '{@link MDSEPraes2.Artikel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see MDSEPraes2.Artikel#getName()
	 * @see #getArtikel()
	 * @generated
	 */
	EAttribute getArtikel_Name();

	/**
	 * Returns the meta object for class '{@link MDSEPraes2.SecurityLager <em>Security Lager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Lager</em>'.
	 * @see MDSEPraes2.SecurityLager
	 * @generated
	 */
	EClass getSecurityLager();

	/**
	 * Returns the meta object for the attribute '{@link MDSEPraes2.SecurityLager#getSecutiryLevel <em>Secutiry Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Secutiry Level</em>'.
	 * @see MDSEPraes2.SecurityLager#getSecutiryLevel()
	 * @see #getSecurityLager()
	 * @generated
	 */
	EAttribute getSecurityLager_SecutiryLevel();

	/**
	 * Returns the meta object for class '{@link MDSEPraes2.SecurityArtikel <em>Security Artikel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Artikel</em>'.
	 * @see MDSEPraes2.SecurityArtikel
	 * @generated
	 */
	EClass getSecurityArtikel();

	/**
	 * Returns the meta object for the attribute '{@link MDSEPraes2.SecurityArtikel#getNeededSecurityLevel <em>Needed Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needed Security Level</em>'.
	 * @see MDSEPraes2.SecurityArtikel#getNeededSecurityLevel()
	 * @see #getSecurityArtikel()
	 * @generated
	 */
	EAttribute getSecurityArtikel_NeededSecurityLevel();

	/**
	 * Returns the meta object for enum '{@link MDSEPraes2.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Level</em>'.
	 * @see MDSEPraes2.SecurityLevel
	 * @generated
	 */
	EEnum getSecurityLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MDSEPraes2Factory getMDSEPraes2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MDSEPraes2.impl.LagerImpl <em>Lager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSEPraes2.impl.LagerImpl
		 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getLager()
		 * @generated
		 */
		EClass LAGER = eINSTANCE.getLager();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAGER__ID = eINSTANCE.getLager_ID();

		/**
		 * The meta object literal for the '<em><b>Artikel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAGER__ARTIKEL = eINSTANCE.getLager_Artikel();

		/**
		 * The meta object literal for the '<em><b>Add Artikel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAGER___ADD_ARTIKEL__ARTIKEL = eINSTANCE.getLager__AddArtikel__Artikel();

		/**
		 * The meta object literal for the '<em><b>Print</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LAGER___PRINT = eINSTANCE.getLager__Print();

		/**
		 * The meta object literal for the '{@link MDSEPraes2.impl.ArtikelImpl <em>Artikel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSEPraes2.impl.ArtikelImpl
		 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getArtikel()
		 * @generated
		 */
		EClass ARTIKEL = eINSTANCE.getArtikel();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIKEL__ID = eINSTANCE.getArtikel_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIKEL__NAME = eINSTANCE.getArtikel_Name();

		/**
		 * The meta object literal for the '{@link MDSEPraes2.impl.SecurityLagerImpl <em>Security Lager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSEPraes2.impl.SecurityLagerImpl
		 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityLager()
		 * @generated
		 */
		EClass SECURITY_LAGER = eINSTANCE.getSecurityLager();

		/**
		 * The meta object literal for the '<em><b>Secutiry Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_LAGER__SECUTIRY_LEVEL = eINSTANCE.getSecurityLager_SecutiryLevel();

		/**
		 * The meta object literal for the '{@link MDSEPraes2.impl.SecurityArtikelImpl <em>Security Artikel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSEPraes2.impl.SecurityArtikelImpl
		 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityArtikel()
		 * @generated
		 */
		EClass SECURITY_ARTIKEL = eINSTANCE.getSecurityArtikel();

		/**
		 * The meta object literal for the '<em><b>Needed Security Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL = eINSTANCE.getSecurityArtikel_NeededSecurityLevel();

		/**
		 * The meta object literal for the '{@link MDSEPraes2.SecurityLevel <em>Security Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MDSEPraes2.SecurityLevel
		 * @see MDSEPraes2.impl.MDSEPraes2PackageImpl#getSecurityLevel()
		 * @generated
		 */
		EEnum SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

	}

} //MDSEPraes2Package
