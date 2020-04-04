package com.listing.dao;

import com.listing.dto.VendorSkuItemDTO;
import com.listing.util.DBConfig;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EbaySkuItemDAO {

    private static JdbcTemplate jdbcTemplate;

    private static final String SQL_QUERY_COUNT = "SELECT COUNT(*) " +
            " FROM ebay_sku_item" +
            " WHERE sku_code = ? ";

    public static final String SQL_INSERT = "INSERT INTO ebay_sku_item (sku_code, ebay_list_price, active, created_on, sku_name,promo_code ) VALUES (?, ?, ?, CURRENT_TIMESTAMP, ?, ?)";

    private final String VENDOR_SELECT_SQL = "SELECT item_name FROM vendor_sku_item WHERE sku_code = ? ";

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


    public void insertSkuItem(String skuCode, String price, String promoCode) throws Exception {
        // define insert parameters.
        Object[] params = new Object[]{skuCode, new BigDecimal(price.trim()), true, queryVendorName(skuCode), promoCode };
        jdbcTemplate.update(SQL_INSERT, params);
    }


    public String queryVendorName(String sku) throws Exception {
        String itemName = null;
        Object[] params = new Object[] { sku.trim() };
        List<String> nameList = jdbcTemplate.query(VENDOR_SELECT_SQL, params, new RowMapper() {
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                String itemName = rs.getString("item_name");
                return itemName;
            }
        });
        if (nameList.size() > 0) {
            itemName = nameList.get(0);
        }
        return itemName;
    }


}
