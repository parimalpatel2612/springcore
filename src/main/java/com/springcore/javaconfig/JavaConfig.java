package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	
//	@Bean//when use been at that time not require component scan
//	public Somosa getSampsa() {
//		return new Somosa();
//	}
	@Bean//when use been at that time not require component scan
	public Student getStudent() {
		return new Student();
	}
}
