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
 * <p>Java class for MerchandizingPrefCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MerchandizingPrefCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="OptIn"/>
 *     &lt;enumeration value="OptOut"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MerchandizingPrefCodeType")
@XmlEnum
public enum MerchandizingPrefCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("OptIn")
    OPT_IN("OptIn"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("OptOut")
    OPT_OUT("OptOut"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    MerchandizingPrefCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchandizingPrefCodeType fromValue(String v) {
        for (MerchandizingPrefCodeType c: MerchandizingPrefCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
