package com.listing.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesConfig {

    private static PropertiesConfig propertiesConfig = new PropertiesConfig();

    private Properties properties = null;

    private PropertiesConfig() {
        /* Load config.properties file. */
        try (InputStream input = new FileInputStream("config.properties")) {
            properties = new Properties();

            // load a properties file
            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static PropertiesConfig getInstance() {
        return propertiesConfig;
    }

    public Properties getCredentials() {
        return properties;
    }
}
