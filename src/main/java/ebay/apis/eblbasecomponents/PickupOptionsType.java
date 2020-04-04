//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.27 at 02:03:14 PM EDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Type defining the <strong>PickupOptions</strong> container, which consists of a pickup method and the priority of the pickup method.
 * 				<br/><br/>
 * 				<span class="tablenote">
 * 				<strong>Note:</strong> At this time, the In-Store Pickup and Click and Collect features are generally only available to large retail merchants in US, and can only be applied to multi-quantity, fixed-price listings.
 * 				</span>
 * 			
 * 
 * <p>Java class for PickupOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PickupOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PickupMethod" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="PickupPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PickupOptionsType", propOrder = {
    "pickupMethod",
    "pickupPriority"
})
public class PickupOptionsType {

    @XmlElement(name = "PickupMethod")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pickupMethod;
    @XmlElement(name = "PickupPriority")
    protected Integer pickupPriority;

    /**
     * Gets the value of the pickupMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPickupMethod() {
        return pickupMethod;
    }

    /**
     * Sets the value of the pickupMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPickupMethod(String value) {
        this.pickupMethod = value;
    }

    /**
     * Gets the value of the pickupPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPickupPriority() {
        return pickupPriority;
    }

    /**
     * Sets the value of the pickupPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPickupPriority(Integer value) {
        this.pickupPriority = value;
    }

}
