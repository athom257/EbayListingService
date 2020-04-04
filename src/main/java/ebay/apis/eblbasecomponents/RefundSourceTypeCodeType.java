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
 * <p>Java class for RefundSourceTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundSourceTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="StoreCredit"/>
 *     &lt;enumeration value="PaymentRefund"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundSourceTypeCodeType")
@XmlEnum
public enum RefundSourceTypeCodeType {


    /**
     * 
     * 						This value indicates that the merchant issued a store credit to the buyer for the amount of the returned item(s).
     * 					
     * 
     */
    @XmlEnumValue("StoreCredit")
    STORE_CREDIT("StoreCredit"),

    /**
     * 
     * 						This value indicates that the merchant issued a cash refund (or debit card/credit card reversal) to the buyer for the amount of the returned item(s).
     * 					
     * 
     */
    @XmlEnumValue("PaymentRefund")
    PAYMENT_REFUND("PaymentRefund"),

    /**
     * 
     * 						This value is reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    RefundSourceTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundSourceTypeCodeType fromValue(String v) {
        for (RefundSourceTypeCodeType c: RefundSourceTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
