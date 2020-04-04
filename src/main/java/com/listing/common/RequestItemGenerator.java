package com.listing.common;

import com.listing.dto.VendorSkuItemDTO;
import com.listing.util.Constants;
import ebay.apis.eblbasecomponents.*;
import java.util.ArrayList;
import java.util.List;

public class RequestItemGenerator {

    public static VerifyAddItemRequestType verifyAddItem(VendorSkuItemDTO vendorSkuItemDTO, String listingPrice) {

        VerifyAddItemRequestType verifyAddItemRequestType = new VerifyAddItemRequestType();
        verifyAddItemRequestType.setRequesterCredentials(getRequesterCredentials());
        verifyAddItemRequestType.setVersion("1081");
        verifyAddItemRequestType.setWarningLevel(WarningLevelCodeType.LOW);

        // ItemType
        ItemType itemType = new ItemType();
        itemType.setAutoPay(true);
        itemType.setBuyerResponsibleForShipping(false);

        if (vendorSkuItemDTO.getItem_name().length() > 75) {
            itemType.setTitle(vendorSkuItemDTO.getItem_name().substring(0, 74));
        } else {
            itemType.setTitle(vendorSkuItemDTO.getItem_name());
        }
        itemType.setPrimaryCategory(getCategoryType());

        AmountType amountType = new AmountType();
        amountType.setValue(Double.valueOf(listingPrice));
        amountType.setCurrencyID(CurrencyCodeType.USD);
        itemType.setStartPrice(amountType);
        itemType.setConditionID(Integer.valueOf("1000"));
        itemType.setCurrency(CurrencyCodeType.USD);
        itemType.setCountry(CountryCodeType.US);
        itemType.setDispatchTimeMax(Integer.valueOf("3"));
        itemType.setListingDuration("GTC");
        itemType.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
        itemType.setPaymentMethods(BuyerPaymentMethodCodeType.PAY_PAL);
        itemType.setPayPalEmailAddress("antone_thomas2000@yahoo.com");
        itemType.setPictureDetails(getPictureDetailsType(vendorSkuItemDTO.getImg_url()));
        itemType.setPostalCode("90640");
        itemType.setQuantity(Integer.valueOf("1"));

        List<NameValueListType> nameValueList = new ArrayList<>();
        NameValueListType nameValueListType = new NameValueListType();
        nameValueListType.setName("Brand");
        nameValueListType.setValue(vendorSkuItemDTO.getBrand().trim());
        nameValueList.add(nameValueListType);

        NameValueListArrayType itemSpecifics = new NameValueListArrayType();
        itemSpecifics.setNameValueList(nameValueList);
        itemType.setItemSpecifics(itemSpecifics);
        itemType.setReturnPolicy(getReturnPolicy());
        itemType.setShippingDetails(getShippingDetails());
        itemType.setSite(SiteCodeType.US);
        itemType.setDescription("<![CDATA[" +
                Constants.HTML_DATA_PRODUCT_DESCRIPTION.toString() +
                vendorSkuItemDTO.getItem_description() +
                Constants.HTML_DIV_ELEMENT_END +
                vendorSkuItemDTO.getSku_code().trim() +
                Constants.HTML_DATA_RETURN_POLICY.toString() +
                Constants.HTML_DIV_ELEMENT_END +
                "]]>");

        verifyAddItemRequestType.setItem(itemType);
        return verifyAddItemRequestType;
    }



    public static AddItemRequestType createAddItem(VendorSkuItemDTO vendorSkuItemDTO, String listingPrice) {

        AddItemRequestType addItemRequestType = new AddItemRequestType();
        addItemRequestType.setRequesterCredentials(getRequesterCredentials());
        addItemRequestType.setVersion("1081");
        addItemRequestType.setWarningLevel(WarningLevelCodeType.LOW);

        // ItemType
        ItemType itemType = new ItemType();
        itemType.setAutoPay(true);
        itemType.setBuyerResponsibleForShipping(false);

        if (vendorSkuItemDTO.getItem_name().length() > 75) {
            itemType.setTitle(vendorSkuItemDTO.getItem_name().substring(0, 74));
        } else {
            itemType.setTitle(vendorSkuItemDTO.getItem_name());
        }
        itemType.setPrimaryCategory(getCategoryType());

        AmountType amountType = new AmountType();
        amountType.setValue(Double.valueOf(listingPrice));
        amountType.setCurrencyID(CurrencyCodeType.USD);
        itemType.setStartPrice(amountType);
        itemType.setConditionID(Integer.valueOf("1000"));
        itemType.setCurrency(CurrencyCodeType.USD);
        itemType.setCountry(CountryCodeType.US);
        itemType.setDispatchTimeMax(Integer.valueOf("3"));
        itemType.setListingDuration("GTC");
        itemType.setListingType(ListingTypeCodeType.FIXED_PRICE_ITEM);
        itemType.setPaymentMethods(BuyerPaymentMethodCodeType.PAY_PAL);
        itemType.setPayPalEmailAddress("antone_thomas2000@yahoo.com");
        itemType.setPictureDetails(getPictureDetailsType(vendorSkuItemDTO.getImg_url()));
        itemType.setPostalCode("90640");
        itemType.setQuantity(Integer.valueOf("1"));

        List<NameValueListType> nameValueList = new ArrayList<>();
        NameValueListType nameValueListType = new NameValueListType();
        nameValueListType.setName("Brand");
        nameValueListType.setValue(vendorSkuItemDTO.getBrand().trim());
        nameValueList.add(nameValueListType);

        NameValueListArrayType itemSpecifics = new NameValueListArrayType();
        itemSpecifics.setNameValueList(nameValueList);
        itemType.setItemSpecifics(itemSpecifics);
        itemType.setReturnPolicy(getReturnPolicy());
        itemType.setShippingDetails(getShippingDetails());
        itemType.setSite(SiteCodeType.US);
        itemType.setDescription("<![CDATA[" +
                Constants.HTML_DATA_PRODUCT_DESCRIPTION.toString() +
                vendorSkuItemDTO.getItem_description() +
                Constants.HTML_DIV_ELEMENT_END +
                vendorSkuItemDTO.getSku_code().trim() +
                Constants.HTML_DATA_RETURN_POLICY.toString() +
                Constants.HTML_DIV_ELEMENT_END +
                "]]>");

        addItemRequestType.setItem(itemType);
        return addItemRequestType;
    }


    private static ReturnPolicyType getReturnPolicy() {
        ReturnPolicyType returnPolicy = new ReturnPolicyType();
        returnPolicy.setReturnsAcceptedOption("ReturnsAccepted");
        returnPolicy.setRefundOption("MoneyBack");
        returnPolicy.setReturnsWithinOption("Days_30");
        returnPolicy.setShippingCostPaidByOption("Seller");
        return returnPolicy;
    }


    private static PictureDetailsType getPictureDetailsType(String imgUrl) {
        PictureDetailsType pictureDetailsType = new PictureDetailsType();
        pictureDetailsType.setExternalPictureURL(imgUrl);
        return pictureDetailsType;
    }


    private static ShippingDetailsType getShippingDetails() {
        ShippingDetailsType shippingDetailsType = new ShippingDetailsType();
        shippingDetailsType.setShippingType(ShippingTypeCodeType.FLAT);
        shippingDetailsType.setExcludeShipToLocation();

        ShippingServiceOptionsType shippingServiceOptionsType = new ShippingServiceOptionsType();
        shippingServiceOptionsType.setFreeShipping(true);
        shippingServiceOptionsType.setShippingServicePriority(Integer.valueOf("1"));
        shippingServiceOptionsType.setShippingService("USPSStandardPost");

        AmountType amountType = new AmountType();
        amountType.setValue(0.00);
        shippingServiceOptionsType.setShippingServiceCost(amountType);

        shippingDetailsType.setShippingServiceOptions(shippingServiceOptionsType);
        return shippingDetailsType;
    }


    private static XMLRequesterCredentialsType getRequesterCredentials() {
        XMLRequesterCredentialsType xmlRequesterCredentialsType = new XMLRequesterCredentialsType();
        xmlRequesterCredentialsType.setEBayAuthToken(Constants.TOKEN);
        return xmlRequesterCredentialsType;
    }

    private static CategoryType getCategoryType() {
        CategoryType categoryType = new CategoryType();
        categoryType.setCategoryID("180506");
        return categoryType;
    }

}
