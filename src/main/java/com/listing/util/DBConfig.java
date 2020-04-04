package com.listing.util;


import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;
import static com.listing.util.Constants.*;

public class DBConfig {

    public static DataSource getDataSource() {
        String username = PropertiesConfig.getInstance().getCredentials().getProperty("db.user");
        String password = PropertiesConfig.getInstance().getCredentials().getProperty("db.password");

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER_CLASS_NAME);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
