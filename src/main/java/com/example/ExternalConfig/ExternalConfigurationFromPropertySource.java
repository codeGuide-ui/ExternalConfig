package com.example.ExternalConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:C:\\properties\\application.properties")
public class ExternalConfigurationFromPropertySource {
    @Value("${server.port}")
    public void getPortNum(int port){
        System.out.println("load  server.port from external configuration using propertySource = "+port);
    }
}
