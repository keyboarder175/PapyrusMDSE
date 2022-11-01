/**
 */
package MDSEPraes2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Artikel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSEPraes2.SecurityArtikel#getNeededSecurityLevel <em>Needed Security Level</em>}</li>
 * </ul>
 *
 * @see MDSEPraes2.MDSEPraes2Package#getSecurityArtikel()
 * @model
 * @generated
 */
public interface SecurityArtikel extends Artikel {
	/**
	 * Returns the value of the '<em><b>Needed Security Level</b></em>' attribute.
	 * The literals are from the enumeration {@link MDSEPraes2.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needed Security Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Security Level</em>' attribute.
	 * @see MDSEPraes2.SecurityLevel
	 * @see #setNeededSecurityLevel(SecurityLevel)
	 * @see MDSEPraes2.MDSEPraes2Package#getSecurityArtikel_NeededSecurityLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SecurityLevel getNeededSecurityLevel();

	/**
	 * Sets the value of the '{@link MDSEPraes2.SecurityArtikel#getNeededSecurityLevel <em>Needed Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Security Level</em>' attribute.
	 * @see MDSEPraes2.SecurityLevel
	 * @see #getNeededSecurityLevel()
	 * @generated
	 */
	void setNeededSecurityLevel(SecurityLevel value);

} // SecurityArtikel
