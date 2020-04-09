package com.listing;

import com.listing.common.ListingManager;

public class AppRunner {

    public static void main(String []args) throws Exception {

        /*
        if (args.length != 2) {
            System.out.println("Must pass sku_code and listingPrice !");
            System.exit(0);
        }
        */

        // ListingManager.process(args[0], args[1], "P4");

        ListingManager.process(null, "32.60", "P4");
    }
}
