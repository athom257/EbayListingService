package com.listing.util;

public class Constants {

    /*
    X-EBAY-API-COMPATIBILITY-LEVEL         1081
    X-EBAY-API-CALL-NAME                   VerifyAddItem
    X-EBAY-API-SITEID                      0
    X-EBAY-API-DEV-NAME                    ***********
    X-EBAY-API-APP-NAME                    ***********
    X-EBAY-API-CERT-NAME                   ***********
    X-EBAY-API-DETAIL-LEVEL                0
    Content-Type                           application/xml
    */

    public static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";

    public static final String X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";
    public static final String X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    public static final String X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    public static final String X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    public static final String X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    public static final String X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    public static final String X_EBAY_API_DETAIL_LEVEL = "X-EBAY-API-DETAIL-LEVEL";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String API_NAME = "AddItem";

    public static final String URL = "https://api.ebay.com/ws/api.dll";

    public static final StringBuffer HTML_DATA_PRODUCT_DESCRIPTION = new StringBuffer()
            .append("<div style=\"color: rgb(127, 130, 129); font-family: Proxima Nova Light\">")
            .append("<h4 style=\"margin: 0px 0px 13px; padding: 0px\">PRODUCT DESCRIPTION</h4>")
            .append("<div style=\"padding-bottom: 5px; line-height: 25px; font-size: 16px\">");

    public static final String HTML_DIV_ELEMENT_END = "</div>";

    public static final StringBuffer HTML_DATA_RETURN_POLICY = new StringBuffer()
            .append("<h5 style=\"margin-top: 15px; margin-bottom: 10px\">RETURN POLICY</h5>")
            .append("Returns are accepted within 30 days of delivery date. Item must be returned unopened in the same new condition as it was shipped with packing slip.");


}
