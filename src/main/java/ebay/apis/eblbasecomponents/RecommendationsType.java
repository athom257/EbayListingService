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
 * 			This type is used to provide details about recommended Item Specifics and Product Identifier types.
 * 		
 * 
 * <p>Java class for RecommendationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CategoryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductIdentifiers" type="{urn:ebay:apis:eBLBaseComponents}ProductIdentifiersType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameRecommendation" type="{urn:ebay:apis:eBLBaseComponents}NameRecommendationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationsType", propOrder = {
    "categoryID",
    "productIdentifiers",
    "nameRecommendation",
    "updated"
})
public class RecommendationsType {

    @XmlElement(name = "CategoryID")
    protected String categoryID;
    @XmlElement(name = "ProductIdentifiers")
    protected List<ProductIdentifiersType> productIdentifiers;
    @XmlElement(name = "NameRecommendation")
    protected List<NameRecommendationType> nameRecommendation;
    @XmlElement(name = "Updated")
    protected Boolean updated;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    /**
     * Gets the value of the productIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifiersType }
     * 
     * 
     */
    public List<ProductIdentifiersType> getProductIdentifiers() {
        if (productIdentifiers == null) {
            productIdentifiers = new ArrayList<ProductIdentifiersType>();
        }
        return this.productIdentifiers;
    }

    /**
     * Gets the value of the nameRecommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameRecommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameRecommendationType }
     * 
     * 
     */
    public List<NameRecommendationType> getNameRecommendation() {
        if (nameRecommendation == null) {
            nameRecommendation = new ArrayList<NameRecommendationType>();
        }
        return this.nameRecommendation;
    }

    /**
     * Gets the value of the updated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdated() {
        return updated;
    }

    /**
     * Sets the value of the updated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdated(Boolean value) {
        this.updated = value;
    }

}
