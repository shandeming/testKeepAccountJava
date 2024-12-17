package com.shine.keepAccount.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    private final String url = "jdbc:mysql://localhost:3306/keep_account?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private final String username = "root";
    private final String password = "2917548a";

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(url, username, password);
        return dataSource;
    }
}
