package com.travelplanner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class TravelPlannerApplication implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		.addResourceHandler("/Go/**")
		.addResourceLocations("/resources/");
	}
	

	
	public static void main(String[] args) {
		SpringApplication.run(TravelPlannerApplication.class, args);
	}

}
