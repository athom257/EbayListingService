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
 * 				This type is deprecated, as sellers are no longer allowed to set a restocking fee through a listings's return policy.
 * 
 * 				
 * 			
 * 
 * <p>Java class for RestockingFeeValueDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestockingFeeValueDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestockingFeeValueOption" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestockingFeeValueDetailsType", propOrder = {
    "restockingFeeValueOption",
    "description"
})
public class RestockingFeeValueDetailsType {

    @XmlElement(name = "RestockingFeeValueOption")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String restockingFeeValueOption;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the restockingFeeValueOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestockingFeeValueOption() {
        return restockingFeeValueOption;
    }

    /**
     * Sets the value of the restockingFeeValueOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestockingFeeValueOption(String value) {
        this.restockingFeeValueOption = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
