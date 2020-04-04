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
 * 					Removes selected messages for a given user.
 * 				
 * 
 * <p>Java class for DeleteMyMessagesRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteMyMessagesRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="AlertIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesAlertIDArrayType" minOccurs="0"/>
 *         &lt;element name="MessageIDs" type="{urn:ebay:apis:eBLBaseComponents}MyMessagesMessageIDArrayType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteMyMessagesRequestType", propOrder = {
    "alertIDs",
    "messageIDs"
})
public class DeleteMyMessagesRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "AlertIDs")
    protected MyMessagesAlertIDArrayType alertIDs;
    @XmlElement(name = "MessageIDs")
    protected MyMessagesMessageIDArrayType messageIDs;

    /**
     * Gets the value of the alertIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesAlertIDArrayType }
     *     
     */
    public MyMessagesAlertIDArrayType getAlertIDs() {
        return alertIDs;
    }

    /**
     * Sets the value of the alertIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesAlertIDArrayType }
     *     
     */
    public void setAlertIDs(MyMessagesAlertIDArrayType value) {
        this.alertIDs = value;
    }

    /**
     * Gets the value of the messageIDs property.
     * 
     * @return
     *     possible object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public MyMessagesMessageIDArrayType getMessageIDs() {
        return messageIDs;
    }

    /**
     * Sets the value of the messageIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyMessagesMessageIDArrayType }
     *     
     */
    public void setMessageIDs(MyMessagesMessageIDArrayType value) {
        this.messageIDs = value;
    }

}
