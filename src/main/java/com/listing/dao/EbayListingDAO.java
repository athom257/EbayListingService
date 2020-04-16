package com.listing.dao;

import com.listing.util.DBConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class EbayListingDAO {

    private static JdbcTemplate jdbcTemplate;

    public static final String SQL_INSERT = "INSERT INTO ebay_listing (listing_code, promo_code, sku_code ) VALUES (?, ?, ?)";

    private final String SQL_PROMO_COUNT = "SELECT COUNT(*) FROM ebay_listing WHERE promo_code = ? ";

    private static EbayListingDAO ebayListingDAO = new EbayListingDAO();

    private EbayListingDAO() {
        // Data source setup.
        jdbcTemplate = new JdbcTemplate(DBConfig.getDataSource());
    }

    public static EbayListingDAO getInstance() {
        return ebayListingDAO;
    }

    private int getPromoCount(String promoCode) {
        int cnt = 0;
        Object[] params = new Object[]{ promoCode };
        cnt = ((Integer) jdbcTemplate.queryForObject(SQL_PROMO_COUNT, params, Integer.class)).intValue();
        return cnt;
    }

    public String generateListingCode(String promoCode) {
        int cnt = getPromoCount(promoCode);
        if (cnt > 998) {
            return "PROMO_LISTING_EXPIRED";
        }
        return promoCode + "-" + StringUtils.leftPad(String.valueOf(cnt + 1), 3, "0");
    }

    public void insertListing(String listingCode, String promoCode,  String skuCode) {
        // define insert parameters.
        Object[] params = new Object[]{ listingCode, promoCode,  skuCode };
        jdbcTemplate.update(SQL_INSERT, params);
    }
}
