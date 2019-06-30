package com.rokib.readApplicationProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ReadApplicationProperties {

	public static void main(String[] args) {
		SpringApplication.run(ReadApplicationProperties.class, args);
	}

}
