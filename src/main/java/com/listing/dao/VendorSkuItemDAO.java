package com.listing.dao;

import com.listing.dto.VendorSkuItemDTO;
import com.listing.util.DBConfig;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendorSkuItemDAO {

    private static JdbcTemplate jdbcTemplate;

    private static final String SQL_QUERY = "SELECT sku_code, item_name, brand, img_url, item_description" +
                                            " FROM vendor_sku_item" +
                                            " WHERE sku_code = ? ";


    private static final String SQL_QUERY_SKU_LIST = "SELECT sku_code FROM vendor_sku_item" +
                                                     " WHERE price = ? " +
                                                     " AND sku_code NOT IN (SELECT sku_code FROM ebay_sku_item)";

    private static VendorSkuItemDAO vendorSkuItemDAO = new VendorSkuItemDAO();

    private VendorSkuItemDAO() {
        // Data source setup.
        jdbcTemplate = new JdbcTemplate(DBConfig.getDataSource());
    }

    public static VendorSkuItemDAO getInstance() {
        return vendorSkuItemDAO;
    }

    public VendorSkuItemDTO queryVendorSkuItem(String sku_code) {
        VendorSkuItemDTO vendorSkuItemDTO = null;
        Object[] params = new Object[]{ sku_code };
        List<VendorSkuItemDTO> list = jdbcTemplate.query(SQL_QUERY, params, (rs, rowNum) ->
                new VendorSkuItemDTO(
                        rs.getString("sku_code"),
                        rs.getString("item_name"),
                        rs.getString("brand"),
                        null,
                        rs.getString("img_url"),
                        rs.getString("item_description")));


        for (VendorSkuItemDTO resultDTO : list) {
            vendorSkuItemDTO = resultDTO;
            break;
        }
        return vendorSkuItemDTO;
    }


    public List<String> queryListOfSkuCodes(String vendorSalesPrice, int threshold) {
        List<String> skuList = new ArrayList<>();
        int counter = 0;
        Object [] parms = { new BigDecimal(vendorSalesPrice) };
        List<String> list = jdbcTemplate.query(SQL_QUERY_SKU_LIST, parms, (rs, rowNum) ->
                rs.getString("sku_code"));

        for (String sku : list) {
            ++counter;
            System.out.println("Count: " + counter +  "  Sku: " + sku);

            skuList.add(sku);
            // Threshold.
            if (counter == threshold) {
                break;
            }
        }

        return skuList;
    }
}
