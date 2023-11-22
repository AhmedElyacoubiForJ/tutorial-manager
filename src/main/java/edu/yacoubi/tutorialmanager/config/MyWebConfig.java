package edu.yacoubi.tutorialmanager.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration
public class MyWebConfig {

    @Bean
    public RestTemplate restTemplate() { // that will be the name of the bean
        System.out.println("hello RestTemplate");
        return new RestTemplateBuilder().build();
    }
}
