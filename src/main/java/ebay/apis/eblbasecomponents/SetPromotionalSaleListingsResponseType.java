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


/**
 * 
 *          The base response of the <b>SetPromotionalSaleListings</b> call. Contains the status of a promotional sale.
 * 			
 * 
 * <p>Java class for SetPromotionalSaleListingsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetPromotionalSaleListingsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{urn:ebay:apis:eBLBaseComponents}PromotionalSaleStatusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetPromotionalSaleListingsResponseType", propOrder = {
    "status"
})
public class SetPromotionalSaleListingsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "Status")
    @XmlSchemaType(name = "token")
    protected PromotionalSaleStatusCodeType status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public PromotionalSaleStatusCodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionalSaleStatusCodeType }
     *     
     */
    public void setStatus(PromotionalSaleStatusCodeType value) {
        this.status = value;
    }

}
