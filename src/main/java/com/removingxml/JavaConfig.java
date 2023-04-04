package com.removingxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.removingxml")
public class JavaConfig {

	@Bean
	public Student getStudent() {
		return new Student(getAddress());
		
	}
	
	@Bean
	public Address getAddress() {
		Address ad = new Address();
		return ad;
	}
	
	
}
