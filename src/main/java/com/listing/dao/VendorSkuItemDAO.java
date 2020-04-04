package com.listing.dao;

import com.listing.dto.VendorSkuItemDTO;
import com.listing.util.DBConfig;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class VendorSkuItemDAO {

    private static JdbcTemplate jdbcTemplate;

    private static final String SQL_QUERY = "SELECT sku_code, item_name, brand, img_url, item_description" +
                                            " FROM vendor_sku_item" +
                                            " WHERE sku_code = ? ";

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
}
