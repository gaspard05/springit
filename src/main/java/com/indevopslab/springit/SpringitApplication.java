package com.indevopslab.springit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


import com.indevopslab.springit.config.SpringitProperties;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}
}
