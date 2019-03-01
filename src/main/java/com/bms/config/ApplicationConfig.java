package com.bms.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationConfig {

	@Bean 
	static DataSource getDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
		dataSource.setUrl("jdbc:mysql://localhost:3306/bookmyshow");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
}
