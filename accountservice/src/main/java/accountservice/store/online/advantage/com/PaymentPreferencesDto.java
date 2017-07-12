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
 *         &lt;element name="paymentMethod" type="{http://www.w3.org/2001/XMLSchema}int" form="qualified"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="cvvNumber" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="safePayUsername" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="safePayPassword" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="preferenceId" type="{http://www.w3.org/2001/XMLSchema}long" form="qualified"/>
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
    "paymentMethod",
    "cardNumber",
    "expirationDate",
    "cvvNumber",
    "safePayUsername",
    "safePayPassword",
    "customerName",
    "preferenceId"
})
@XmlRootElement(name = "PaymentPreferencesDto")
public class PaymentPreferencesDto {

    protected int paymentMethod;
    @XmlElement(required = true)
    protected String cardNumber;
    @XmlElement(required = true)
    protected String expirationDate;
    @XmlElement(required = true)
    protected String cvvNumber;
    @XmlElement(required = true)
    protected String safePayUsername;
    @XmlElement(required = true)
    protected String safePayPassword;
    @XmlElement(required = true)
    protected String customerName;
    protected long preferenceId;

    /**
     * Gets the value of the paymentMethod property.
     * 
     */
    public int getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     */
    public void setPaymentMethod(int value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the cvvNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvvNumber() {
        return cvvNumber;
    }

    /**
     * Sets the value of the cvvNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvvNumber(String value) {
        this.cvvNumber = value;
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
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the preferenceId property.
     * 
     */
    public long getPreferenceId() {
        return preferenceId;
    }

    /**
     * Sets the value of the preferenceId property.
     * 
     */
    public void setPreferenceId(long value) {
        this.preferenceId = value;
    }

}
