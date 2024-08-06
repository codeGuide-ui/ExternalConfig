package com.example.ExternalConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExternalConfigurationBean {
    @Value("${server.port}")
    public void getPort(int port){
        System.out.println("load  server.port from external configuration = "+port);
    }
}
