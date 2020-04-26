package com.listing.common;

public class EbayRequest {

    private String skuCode;

    private String xmlRequest;

    private String itemID;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getXmlRequest() {
        return xmlRequest;
    }

    public void setXmlRequest(String xmlRequest) {
        this.xmlRequest = xmlRequest;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    @Override
    public String toString() {
        return "EbayRequest{" +
                "skuCode='" + skuCode + '\'' +
                ", xmlRequest='" + xmlRequest + '\'' +
                ", itemID='" + itemID + '\'' +
                '}';
    }
}
