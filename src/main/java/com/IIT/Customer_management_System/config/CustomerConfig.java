package com.IIT.Customer_management_System.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }
}
