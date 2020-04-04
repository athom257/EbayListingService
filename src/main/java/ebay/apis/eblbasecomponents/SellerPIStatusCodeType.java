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
 * <p>Java class for SellerPIStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerPIStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AcceptedUA"/>
 *     &lt;enumeration value="MustAcceptUA"/>
 *     &lt;enumeration value="PIEnabled"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerPIStatusCodeType")
@XmlEnum
public enum SellerPIStatusCodeType {


    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("AcceptedUA")
    ACCEPTED_UA("AcceptedUA"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("MustAcceptUA")
    MUST_ACCEPT_UA("MustAcceptUA"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("PIEnabled")
    PI_ENABLED("PIEnabled"),

    /**
     * 
     * 						This value is not used.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerPIStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerPIStatusCodeType fromValue(String v) {
        for (SellerPIStatusCodeType c: SellerPIStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
