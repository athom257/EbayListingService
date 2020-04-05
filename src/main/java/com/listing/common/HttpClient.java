package com.listing.common;

import com.listing.util.Constants;
import com.listing.util.PropertiesConfig;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.InputStream;
import java.nio.charset.Charset;

public class HttpClient {

    public static void sendRequest(String xmlRequest, String apiCallName) throws Exception {
        DefaultHttpClient httpClient = new DefaultHttpClient();

        try {
            //Define a postRequest request
            HttpPost postRequest = new HttpPost(Constants.URL);

            //Set the API media type in http content-type header
            postRequest.addHeader(Constants.CONTENT_TYPE, "application/xml");
            postRequest.addHeader(Constants.X_EBAY_API_COMPATIBILITY_LEVEL, "1081");
            postRequest.addHeader(Constants.X_EBAY_API_CALL_NAME, apiCallName);
            postRequest.addHeader(Constants.X_EBAY_API_SITEID, "0");
            postRequest.addHeader(Constants.X_EBAY_API_DEV_NAME, PropertiesConfig.getInstance().getCredentials().getProperty("api.credentials.x_ebay_api_dev_name"));
            postRequest.addHeader(Constants.X_EBAY_API_APP_NAME, PropertiesConfig.getInstance().getCredentials().getProperty("api.credentials.x_ebay_api_app_name"));
            postRequest.addHeader(Constants.X_EBAY_API_CERT_NAME, PropertiesConfig.getInstance().getCredentials().getProperty("api.credentials.x_ebay_api_cert_name"));
            postRequest.addHeader(Constants.X_EBAY_API_DETAIL_LEVEL, "0");

            //Set the request post body
            StringEntity userEntity = new StringEntity(xmlRequest);
            postRequest.setEntity(userEntity);

            // Send the request; It will immediately return the response in HttpResponse object if any
            System.out.println("Sending request to " + Constants.URL);
            HttpResponse response = httpClient.execute(postRequest);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println("Http Status Response: " + statusCode);

            //verify the valid error code first
            if (statusCode != 200)
            {
                throw new RuntimeException("Failed with HTTP error code : " + statusCode);
            }

            String responseXML = EntityUtils.toString(response.getEntity(), Charset.forName("UTF-8").toString());
            System.out.println(responseXML);

            if (!responseXML.contains("<Ack>Success</Ack>")) {
                throw new Exception("<Ack>Failure from Ebay API Call</Ack>");
            }

        }
        finally {
            //Important: Close the connect
            httpClient.getConnectionManager().shutdown();
        }
    }


}
