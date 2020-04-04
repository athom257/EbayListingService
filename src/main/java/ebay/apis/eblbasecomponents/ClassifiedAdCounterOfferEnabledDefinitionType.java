//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.27 at 02:03:14 PM EDT 
//


package ebay.apis.eblbasecomponents;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Type defining the <b>ClassifiedAdCounterOfferEnabled</b> field that is
 * 				returned under the <b>FeatureDefinitions</b> container of the
 * 				<b>GetCategoryFeatures</b> response (as long as
 * 				'ClassifiedAdCounterOfferEnabled' is included as a <b>FeatureID</b> value in
 * 				the call request or no <b>FeatureID</b> values are passed into the call
 * 				request). This field is returned as an
 * 				empty element (a boolean value is not returned) if one or more eBay API-enabled sites
 * 				support the Classified Ad Best Offer Counter Offer feature.
 * 				<br/><br/>
 * 				To verify if a specific eBay site supports the Classified Ad Best Offer Counter Offer feature (for most
 * 				categories), look for a 'true' value in the
 * 				<b>SiteDefaults.ClassifiedAdCounterOfferEnabled</b> field.
 * 				<br/><br/>
 * 				To verify if a specific category on a specific eBay site supports the Classified Ad Best Offer Counter Offer feature, pass in a <b>CategoryID</b> value in the request, and then
 * 				look for a 'true' value in the <b>ClassifiedAdCounterOfferEnabled</b> field
 * 				of the corresponding Category node (match up the <b>CategoryID</b> values
 * 				if more than one Category IDs were passed in the request).
 * 			
 * 
 * <p>Java class for ClassifiedAdCounterOfferEnabledDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassifiedAdCounterOfferEnabledDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassifiedAdCounterOfferEnabledDefinitionType")
public class ClassifiedAdCounterOfferEnabledDefinitionType {


}
