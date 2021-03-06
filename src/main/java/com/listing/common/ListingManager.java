package com.listing.common;

import com.listing.dao.EbayListingDAO;
import com.listing.dao.EbaySkuItemDAO;
import com.listing.dao.VendorSkuItemDAO;
import com.listing.dto.VendorSkuItemDTO;
import ebay.apis.eblbasecomponents.AddItemRequestType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;


public class ListingManager {

    private static VendorSkuItemDAO vendorSkuItemDAO = VendorSkuItemDAO.getInstance();

    private static EbayListingDAO ebayListingDAO = EbayListingDAO.getInstance();

    private static EbaySkuItemDAO ebaySkuItemDAO = EbaySkuItemDAO.getInstance();


    public static void process(String vendorSalesPrice, String ebayListingPrice, String promoCode, int listingThreshold) throws Exception {

        List<String> skuCodeList = vendorSkuItemDAO.queryListOfSkuCodes(vendorSalesPrice, listingThreshold);

        for (String vendorSku : skuCodeList) {

            // Max sku length table definition is 25.
            if (vendorSku.length() > 25) {
                continue;
            }

            // Does sku exists in ebay_sku_item table.
            int skuCount = EbaySkuItemDAO.getInstance().getSkuCount(vendorSku);

            if (skuCount > 0) {
                System.out.println("***** SKU ALREADY LISTED *****");
                continue;
            }

            VendorSkuItemDTO vendorSkuItemDTO =
                    vendorSkuItemDAO.queryVendorSkuItem(vendorSku);

            String listingCode = ebayListingDAO.generateListingCode(promoCode);
            if (listingCode.equalsIgnoreCase("PROMO_LISTING_EXPIRED")) {
                System.out.println("The current promo_code has expired. Create new promo code listing.");
                break;
            }

            AddItemRequestType obj = RequestItemGenerator.createAddItem(vendorSkuItemDTO, ebayListingPrice, listingCode);
            String xmlRequest = jaxbObjectToXML(obj);

            EbayRequest ebayRequest = new EbayRequest();
            ebayRequest.setXmlRequest(xmlRequest);
            ebayRequest.setSkuCode(vendorSku);

            if (listOnEbay(ebayRequest)) {
                /* Insert into sku item table. */
                ebaySkuItemDAO.insertSkuItem(vendorSku, ebayListingPrice, listingCode, ebayRequest.getItemID());

                /* Insert into ebay listing table. */
                ebayListingDAO.insertListing(listingCode, promoCode, vendorSku);
            }
        } // end for.
    }


    private static boolean listOnEbay(EbayRequest ebayRequest) {
        boolean isSuccess = true;
        try {
            /* Make call to ebay API */
            HttpClient.sendRequest(ebayRequest);
        } catch (Exception ex) {
            isSuccess = false;
        }

        return isSuccess;
    }


    private static String jaxbObjectToXML(Object obj) {
        String xmlContent = null;
        JAXBContext jaxbContext = null;

        try {
            //Create JAXB Context
            jaxbContext = JAXBContext.newInstance(AddItemRequestType.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(obj, sw);

            //Verify XML Content
            xmlContent = sw.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return xmlContent;
    }
}
