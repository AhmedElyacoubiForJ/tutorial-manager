package edu.yacoubi.tutorialmanager.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "ct")
public record ContentTutorialProperties(
        String welcome,
        String about) {
}

