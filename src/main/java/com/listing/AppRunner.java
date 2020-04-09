package com.listing;

import com.listing.common.ListingManager;

public class AppRunner {

    public static void main(String []args) throws Exception {


        if (args.length != 4) {
            System.out.println("Must pass ['ebayListingPrice' 'vendorPrice' 'promoCode' 'listingThreshold'] .");
            System.exit(0);
        }

        ListingManager.process(args[0], args[1], args[2], Integer.parseInt(args[3]));
    }
}
