/**
 */
package MDSEPraes2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MDSEPraes2.MDSEPraes2Package
 * @generated
 */
public interface MDSEPraes2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MDSEPraes2Factory eINSTANCE = MDSEPraes2.impl.MDSEPraes2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lager</em>'.
	 * @generated
	 */
	Lager createLager();

	/**
	 * Returns a new object of class '<em>Artikel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Artikel</em>'.
	 * @generated
	 */
	Artikel createArtikel();

	/**
	 * Returns a new object of class '<em>Security Lager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Lager</em>'.
	 * @generated
	 */
	SecurityLager createSecurityLager();

	/**
	 * Returns a new object of class '<em>Security Artikel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Artikel</em>'.
	 * @generated
	 */
	SecurityArtikel createSecurityArtikel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MDSEPraes2Package getMDSEPraes2Package();

} //MDSEPraes2Factory
