//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.16 at 11:02:21 AM MDT 
//


package accountservice.store.online.advantage.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
 *         &lt;element name="safePayUsername" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="safePayPassword" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="base64Token" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "accountId",
    "safePayUsername",
    "safePayPassword",
    "base64Token"
})
@XmlRootElement(name = "AddSafePayMethodRequest")
public class AddSafePayMethodRequest {

    protected long accountId;
    @XmlElement(required = true)
    protected String safePayUsername;
    @XmlElement(required = true)
    protected String safePayPassword;
    @XmlElement(required = true)
    protected String base64Token;

    /**
     * Gets the value of the accountId property.
     * 
     */
    public long getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     */
    public void setAccountId(long value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the safePayUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafePayUsername() {
        return safePayUsername;
    }

    /**
     * Sets the value of the safePayUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafePayUsername(String value) {
        this.safePayUsername = value;
    }

    /**
     * Gets the value of the safePayPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafePayPassword() {
        return safePayPassword;
    }

    /**
     * Sets the value of the safePayPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafePayPassword(String value) {
        this.safePayPassword = value;
    }

    /**
     * Gets the value of the base64Token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase64Token() {
        return base64Token;
    }

    /**
     * Sets the value of the base64Token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase64Token(String value) {
        this.base64Token = value;
    }

}
