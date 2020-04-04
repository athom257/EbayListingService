//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.27 at 02:03:14 PM EDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionSchemeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionSchemeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ItemToItem"/>
 *     &lt;enumeration value="ItemToStoreCat"/>
 *     &lt;enumeration value="StoreToStoreCat"/>
 *     &lt;enumeration value="ItemToDefaultRule"/>
 *     &lt;enumeration value="DefaultRule"/>
 *     &lt;enumeration value="CategoryProximity"/>
 *     &lt;enumeration value="RelatedCategoryRule"/>
 *     &lt;enumeration value="DefaultUpSellLogic"/>
 *     &lt;enumeration value="DefaultCrossSellLogic"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionSchemeCodeType")
@XmlEnum
public enum PromotionSchemeCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemToItem")
    ITEM_TO_ITEM("ItemToItem"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemToStoreCat")
    ITEM_TO_STORE_CAT("ItemToStoreCat"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("StoreToStoreCat")
    STORE_TO_STORE_CAT("StoreToStoreCat"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("ItemToDefaultRule")
    ITEM_TO_DEFAULT_RULE("ItemToDefaultRule"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("DefaultRule")
    DEFAULT_RULE("DefaultRule"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CategoryProximity")
    CATEGORY_PROXIMITY("CategoryProximity"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("RelatedCategoryRule")
    RELATED_CATEGORY_RULE("RelatedCategoryRule"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("DefaultUpSellLogic")
    DEFAULT_UP_SELL_LOGIC("DefaultUpSellLogic"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("DefaultCrossSellLogic")
    DEFAULT_CROSS_SELL_LOGIC("DefaultCrossSellLogic"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PromotionSchemeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionSchemeCodeType fromValue(String v) {
        for (PromotionSchemeCodeType c: PromotionSchemeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
