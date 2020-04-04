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
 * <p>Java class for ReturnsAcceptedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReturnsAcceptedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ReturnsAccepted"/>
 *     &lt;enumeration value="ReturnsNotAccepted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReturnsAcceptedCodeType")
@XmlEnum
public enum ReturnsAcceptedCodeType {


    /**
     * 
     * 						<code>ReturnsAccepted</code> indicates the seller does accept returns.
     * 					
     * 
     */
    @XmlEnumValue("ReturnsAccepted")
    RETURNS_ACCEPTED("ReturnsAccepted"),

    /**
     * 
     * 						<code>ReturnsNotAccepted</code> indicates the seller does <i>not</i> accept returns.
     * 					
     * 
     */
    @XmlEnumValue("ReturnsNotAccepted")
    RETURNS_NOT_ACCEPTED("ReturnsNotAccepted");
    private final String value;

    ReturnsAcceptedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsAcceptedCodeType fromValue(String v) {
        for (ReturnsAcceptedCodeType c: ReturnsAcceptedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
