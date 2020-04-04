package com.listing.common;

import com.listing.dao.VendorSkuItemDAO;
import com.listing.dto.VendorSkuItemDTO;
import ebay.apis.eblbasecomponents.AddItemRequestType;
import ebay.apis.eblbasecomponents.VerifyAddItemRequestType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class ListingManager {

    private static VendorSkuItemDAO vendorSkuItemDAO = VendorSkuItemDAO.getInstance();

    public static void process(String skuCode, String listingPrice) throws Exception {
        VendorSkuItemDTO vendorSkuItemDTO =
                vendorSkuItemDAO.queryVendorSkuItem(skuCode);

        AddItemRequestType obj = RequestItemGenerator.createAddItem(vendorSkuItemDTO, listingPrice);
        String xmlRequest = jaxbObjectToXML(obj);
        //HttpClient.sendRequest(xmlRequest);
    }

    private static String jaxbObjectToXML(AddItemRequestType v) {
        String xmlContent = null;
        try {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(AddItemRequestType.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(v, sw);

            //Verify XML Content
            xmlContent = sw.toString();
            System.out.println(xmlContent);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return xmlContent;
    }
}
