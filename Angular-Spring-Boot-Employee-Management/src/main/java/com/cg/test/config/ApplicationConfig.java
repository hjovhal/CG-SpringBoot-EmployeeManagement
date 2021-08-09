package com.cg.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.test.repository.EmployeeDataSource;

@Configuration
public class ApplicationConfig {

	@Bean
	public EmployeeDataSource getDatasource() {
		EmployeeDataSource dataSource = new EmployeeDataSource();
		return dataSource;
	}
}