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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				The base response type for the <b>GetOrderTransactions</b> call. This call retrieves detailed information about one or more eBay.com orders. An <b>OrderArray.Order</b> container is returned for each order that matches the input criteria in the call request.
 * 			
 * 
 * <p>Java class for GetOrderTransactionsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOrderTransactionsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="OrderArray" type="{urn:ebay:apis:eBLBaseComponents}OrderArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOrderTransactionsResponseType", propOrder = {
    "orderArray"
})
public class GetOrderTransactionsResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "OrderArray")
    protected OrderArrayType orderArray;

    /**
     * Gets the value of the orderArray property.
     * 
     * @return
     *     possible object is
     *     {@link OrderArrayType }
     *     
     */
    public OrderArrayType getOrderArray() {
        return orderArray;
    }

    /**
     * Sets the value of the orderArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderArrayType }
     *     
     */
    public void setOrderArray(OrderArrayType value) {
        this.orderArray = value;
    }

}
