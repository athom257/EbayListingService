package com.listing.util;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import static com.listing.util.Constants.*;

public class DBConfig {

    public static DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER_CLASS_NAME);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_USER);
        dataSource.setPassword(DB_PASSWORD);
        return dataSource;
    }
}
