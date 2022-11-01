/**
 */
package MDSEPraes2;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSEPraes2.Lager#getID <em>ID</em>}</li>
 *   <li>{@link MDSEPraes2.Lager#getArtikel <em>Artikel</em>}</li>
 * </ul>
 *
 * @see MDSEPraes2.MDSEPraes2Package#getLager()
 * @model
 * @generated
 */
public interface Lager extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(BigInteger)
	 * @see MDSEPraes2.MDSEPraes2Package#getLager_ID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getID();

	/**
	 * Sets the value of the '{@link MDSEPraes2.Lager#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Artikel</b></em>' reference list.
	 * The list contents are of type {@link MDSEPraes2.Artikel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artikel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artikel</em>' reference list.
	 * @see MDSEPraes2.MDSEPraes2Package#getLager_Artikel()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Artikel> getArtikel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model artikelToAddRequired="true" artikelToAddOrdered="false"
	 * @generated
	 */
	void addArtikel(Artikel artikelToAdd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void print();

} // Lager
