package com.listing.common;

import com.listing.dao.EbaySkuItemDAO;
import com.listing.dao.VendorSkuItemDAO;
import com.listing.dto.VendorSkuItemDTO;
import ebay.apis.eblbasecomponents.AddItemRequestType;
import ebay.apis.eblbasecomponents.VerifyAddItemRequestType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;


public class ListingManager {

    private static VendorSkuItemDAO vendorSkuItemDAO = VendorSkuItemDAO.getInstance();


    public static void process(String skuCode, String listingPrice, String promoCode) throws Exception {
        String apiName;

        List<String> skuCodeList = vendorSkuItemDAO.queryListOfSkuCodes("24.99");

        for (String vendorSku : skuCodeList) {
            skuCode = vendorSku;

            // Does sku exists in ebay_sku_item table.
            int skuCount = EbaySkuItemDAO.getInstance().getSkuCount(skuCode);

            if (skuCount > 0) {
                System.out.println("***** SKU ALREADY EXISTS *****");
                continue;
            }

            Thread.sleep(3000);

            VendorSkuItemDTO vendorSkuItemDTO =
                    vendorSkuItemDAO.queryVendorSkuItem(skuCode);

            AddItemRequestType obj = RequestItemGenerator.createAddItem(vendorSkuItemDTO, listingPrice, promoCode);

            String xmlRequest = jaxbObjectToXML(obj);
            if (obj instanceof AddItemRequestType) {
                apiName = "AddItem";
            } else {
                apiName = "VerifyAddItem";
            }

            // Refactor later.

            try {
                /* Make call to ebay API */
                HttpClient.sendRequest(xmlRequest, apiName);
            } catch (Exception e) {
                continue;
            }

            /* Insert into sku item table. */
            EbaySkuItemDAO.getInstance().insertSkuItem(skuCode, listingPrice, promoCode);
        }
    }








    private static String jaxbObjectToXML(Object obj) {
        String xmlContent = null;
        JAXBContext jaxbContext = null;

        try {
            //Create JAXB Context
            if (obj instanceof  AddItemRequestType) {
                jaxbContext = JAXBContext.newInstance(AddItemRequestType.class);
            } else {
                jaxbContext = JAXBContext.newInstance(VerifyAddItemRequestType.class);
            }

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
            System.out.println(xmlContent);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return xmlContent;
    }
}
