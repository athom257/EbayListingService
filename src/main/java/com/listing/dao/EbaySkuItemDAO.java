package com.listing.dao;

import com.listing.dto.VendorSkuItemDTO;
import com.listing.util.DBConfig;
import org.springframework.jdbc.core.JdbcTemplate;

public class EbaySkuItemDAO {

    private static JdbcTemplate jdbcTemplate;

    private static final String SQL_QUERY_COUNT = "SELECT COUNT(*) " +
            " FROM ebay_sku_item" +
            " WHERE sku_code = ? ";

    private static EbaySkuItemDAO ebaySkuItemDAO = new EbaySkuItemDAO();

    private EbaySkuItemDAO() {
        // Data source setup.
        jdbcTemplate = new JdbcTemplate(DBConfig.getDataSource());
    }

    public static EbaySkuItemDAO getInstance() {
        return ebaySkuItemDAO;
    }

    public int getSkuCount(String skuCode) {
        int recordCnt = 0;
        Object[] params = new Object[]{ skuCode };
        recordCnt = ((Integer) jdbcTemplate.queryForObject(SQL_QUERY_COUNT, params, Integer.class)).intValue();
        return recordCnt;
    }


}
