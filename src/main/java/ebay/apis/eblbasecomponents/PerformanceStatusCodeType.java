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
 * <p>Java class for PerformanceStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="TopRated"/>
 *     &lt;enumeration value="AboveStandard"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="BelowStandard"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceStatusCodeType")
@XmlEnum
public enum PerformanceStatusCodeType {


    /**
     * 
     * 						This enumeration value indicates that the user's Seller Level is Top-Rated.
     * 					
     * 
     */
    @XmlEnumValue("TopRated")
    TOP_RATED("TopRated"),

    /**
     * 
     * 						This enumeration value indicates that the user's Seller Level is Above Standard.
     * 					
     * 
     */
    @XmlEnumValue("AboveStandard")
    ABOVE_STANDARD("AboveStandard"),

    /**
     * 
     * 						This enumeration value indicates that the user's Seller Level is Standard.
     * 					
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * 
     * 						This enumeration value indicates that the user's Seller Level is Below Standard.
     * 					
     * 
     */
    @XmlEnumValue("BelowStandard")
    BELOW_STANDARD("BelowStandard"),

    /**
     * 
     * 						Reserved for internal use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    PerformanceStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceStatusCodeType fromValue(String v) {
        for (PerformanceStatusCodeType c: PerformanceStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
