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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				This type is deprecated.
 * 			
 * 
 * <p>Java class for SiteWideCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteWideCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CharacteristicsSet" type="{urn:ebay:apis:eBLBaseComponents}CharacteristicsSetType" minOccurs="0"/>
 *         &lt;element name="ExcludeCategoryID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteWideCharacteristicsType", propOrder = {
    "characteristicsSet",
    "excludeCategoryID"
})
public class SiteWideCharacteristicsType {

    @XmlElement(name = "CharacteristicsSet")
    protected CharacteristicsSetType characteristicsSet;
    @XmlElement(name = "ExcludeCategoryID")
    protected List<String> excludeCategoryID;

    /**
     * Gets the value of the characteristicsSet property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public CharacteristicsSetType getCharacteristicsSet() {
        return characteristicsSet;
    }

    /**
     * Sets the value of the characteristicsSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsSetType }
     *     
     */
    public void setCharacteristicsSet(CharacteristicsSetType value) {
        this.characteristicsSet = value;
    }

    /**
     * Gets the value of the excludeCategoryID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeCategoryID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeCategoryID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeCategoryID() {
        if (excludeCategoryID == null) {
            excludeCategoryID = new ArrayList<String>();
        }
        return this.excludeCategoryID;
    }

}
