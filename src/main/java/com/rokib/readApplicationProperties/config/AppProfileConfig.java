package com.rokib.readApplicationProperties.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppProfileConfig {

    @Profile("local")
    @Bean
    public String localBean() {
        return "local";
    }
}
