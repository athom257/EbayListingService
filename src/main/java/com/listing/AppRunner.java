package com.listing;

import com.listing.common.ListingManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppRunner {

    public static void main(String []args) throws Exception {
//        if (args.length != 2) {
//            System.out.println("Must pass sku_code and listingPrice !");
//            System.exit(0);
//        }


        ListingManager.process("60-0642", "55.69", "");



    }
}
