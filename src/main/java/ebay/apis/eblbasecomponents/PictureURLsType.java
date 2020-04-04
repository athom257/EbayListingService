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
 * 				This container returns the URLs of the seller's self-hosted (hosted outside of eBay) pictures and the URL for the corresponding eBay Picture Services (EPS), that was generated when the picture was uploaded.
 * 			
 * 
 * <p>Java class for PictureURLsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureURLsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eBayPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ExternalPictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureURLsType", propOrder = {
    "eBayPictureURL",
    "externalPictureURL"
})
public class PictureURLsType {

    @XmlSchemaType(name = "anyURI")
    protected String eBayPictureURL;
    @XmlElement(name = "ExternalPictureURL")
    @XmlSchemaType(name = "anyURI")
    protected String externalPictureURL;

    /**
     * Gets the value of the eBayPictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEBayPictureURL() {
        return eBayPictureURL;
    }

    /**
     * Sets the value of the eBayPictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEBayPictureURL(String value) {
        this.eBayPictureURL = value;
    }

    /**
     * Gets the value of the externalPictureURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPictureURL() {
        return externalPictureURL;
    }

    /**
     * Sets the value of the externalPictureURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPictureURL(String value) {
        this.externalPictureURL = value;
    }

}
