/**
 */
package MDSEPraes2.impl;

import MDSEPraes2.Artikel;
import MDSEPraes2.Lager;
import MDSEPraes2.MDSEPraes2Factory;
import MDSEPraes2.MDSEPraes2Package;
import MDSEPraes2.SecurityArtikel;
import MDSEPraes2.SecurityLager;
import MDSEPraes2.SecurityLevel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MDSEPraes2PackageImpl extends EPackageImpl implements MDSEPraes2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artikelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityArtikelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MDSEPraes2.MDSEPraes2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MDSEPraes2PackageImpl() {
		super(eNS_URI, MDSEPraes2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MDSEPraes2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MDSEPraes2Package init() {
		if (isInited) return (MDSEPraes2Package)EPackage.Registry.INSTANCE.getEPackage(MDSEPraes2Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMDSEPraes2Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		MDSEPraes2PackageImpl theMDSEPraes2Package = registeredMDSEPraes2Package instanceof MDSEPraes2PackageImpl ? (MDSEPraes2PackageImpl)registeredMDSEPraes2Package : new MDSEPraes2PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMDSEPraes2Package.createPackageContents();

		// Initialize created meta-data
		theMDSEPraes2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMDSEPraes2Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MDSEPraes2Package.eNS_URI, theMDSEPraes2Package);
		return theMDSEPraes2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLager() {
		return lagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLager_ID() {
		return (EAttribute)lagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLager_Artikel() {
		return (EReference)lagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLager__AddArtikel__Artikel() {
		return lagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLager__Print() {
		return lagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtikel() {
		return artikelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtikel_ID() {
		return (EAttribute)artikelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtikel_Name() {
		return (EAttribute)artikelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityLager() {
		return securityLagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityLager_SecutiryLevel() {
		return (EAttribute)securityLagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityArtikel() {
		return securityArtikelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityArtikel_NeededSecurityLevel() {
		return (EAttribute)securityArtikelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityLevel() {
		return securityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDSEPraes2Factory getMDSEPraes2Factory() {
		return (MDSEPraes2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		lagerEClass = createEClass(LAGER);
		createEAttribute(lagerEClass, LAGER__ID);
		createEReference(lagerEClass, LAGER__ARTIKEL);
		createEOperation(lagerEClass, LAGER___ADD_ARTIKEL__ARTIKEL);
		createEOperation(lagerEClass, LAGER___PRINT);

		artikelEClass = createEClass(ARTIKEL);
		createEAttribute(artikelEClass, ARTIKEL__ID);
		createEAttribute(artikelEClass, ARTIKEL__NAME);

		securityLagerEClass = createEClass(SECURITY_LAGER);
		createEAttribute(securityLagerEClass, SECURITY_LAGER__SECUTIRY_LEVEL);

		securityArtikelEClass = createEClass(SECURITY_ARTIKEL);
		createEAttribute(securityArtikelEClass, SECURITY_ARTIKEL__NEEDED_SECURITY_LEVEL);

		// Create enums
		securityLevelEEnum = createEEnum(SECURITY_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		securityLagerEClass.getESuperTypes().add(this.getLager());
		securityArtikelEClass.getESuperTypes().add(this.getArtikel());

		// Initialize classes, features, and operations; add parameters
		initEClass(lagerEClass, Lager.class, "Lager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLager_ID(), ecorePackage.getEBigInteger(), "ID", null, 1, 1, Lager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLager_Artikel(), this.getArtikel(), null, "artikel", null, 0, -1, Lager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getLager__AddArtikel__Artikel(), null, "addArtikel", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getArtikel(), "artikelToAdd", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getLager__Print(), null, "print", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(artikelEClass, Artikel.class, "Artikel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtikel_ID(), ecorePackage.getEBigInteger(), "ID", null, 1, 1, Artikel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getArtikel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Artikel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityLagerEClass, SecurityLager.class, "SecurityLager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityLager_SecutiryLevel(), this.getSecurityLevel(), "secutiryLevel", null, 1, 1, SecurityLager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityArtikelEClass, SecurityArtikel.class, "SecurityArtikel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityArtikel_NeededSecurityLevel(), this.getSecurityLevel(), "neededSecurityLevel", null, 1, 1, SecurityArtikel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityLevelEEnum, SecurityLevel.class, "SecurityLevel");
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.LOW_SECUTIRY);
		addEEnumLiteral(securityLevelEEnum, SecurityLevel.HIGH_SECURITY);

		// Create resource
		createResource(eNS_URI);
	}

} //MDSEPraes2PackageImpl
