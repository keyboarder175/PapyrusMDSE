/**
 */
package MDSEPraes2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Lager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MDSEPraes2.SecurityLager#getSecutiryLevel <em>Secutiry Level</em>}</li>
 * </ul>
 *
 * @see MDSEPraes2.MDSEPraes2Package#getSecurityLager()
 * @model
 * @generated
 */
public interface SecurityLager extends Lager {
	/**
	 * Returns the value of the '<em><b>Secutiry Level</b></em>' attribute.
	 * The literals are from the enumeration {@link MDSEPraes2.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secutiry Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secutiry Level</em>' attribute.
	 * @see MDSEPraes2.SecurityLevel
	 * @see #setSecutiryLevel(SecurityLevel)
	 * @see MDSEPraes2.MDSEPraes2Package#getSecurityLager_SecutiryLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SecurityLevel getSecutiryLevel();

	/**
	 * Sets the value of the '{@link MDSEPraes2.SecurityLager#getSecutiryLevel <em>Secutiry Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secutiry Level</em>' attribute.
	 * @see MDSEPraes2.SecurityLevel
	 * @see #getSecutiryLevel()
	 * @generated
	 */
	void setSecutiryLevel(SecurityLevel value);

} // SecurityLager
