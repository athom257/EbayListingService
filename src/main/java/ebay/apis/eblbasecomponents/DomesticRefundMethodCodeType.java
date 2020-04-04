//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.27 at 02:03:14 PM EDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type defines the available options the seller has for handling domestic returns.
 * 			
 * 
 * <p>Java class for DomesticRefundMethodCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomesticRefundMethodCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomesticRefundMethod" type="{urn:ebay:apis:eBLBaseComponents}ReturnsRefundMethodCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomesticRefundMethodCodeType", propOrder = {
    "domesticRefundMethod"
})
public class DomesticRefundMethodCodeType {

    @XmlElement(name = "DomesticRefundMethod")
    @XmlSchemaType(name = "token")
    protected List<ReturnsRefundMethodCodeType> domesticRefundMethod;

    /**
     * Gets the value of the domesticRefundMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domesticRefundMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomesticRefundMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnsRefundMethodCodeType }
     * 
     * 
     */
    public List<ReturnsRefundMethodCodeType> getDomesticRefundMethod() {
        if (domesticRefundMethod == null) {
            domesticRefundMethod = new ArrayList<ReturnsRefundMethodCodeType>();
        }
        return this.domesticRefundMethod;
    }

}
