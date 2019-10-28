package com.example.wyh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "app")
@Data
public class SystemConfig {
    private String info;

    private String author;

    private String email;

    private String swaggerTitle;

    private String swaggerContactName;

    private String swaggerContactWebUrl;

    private String swaggerContactEmail;
    private String swaggerVersion;

    private String swaggerDescription;
    private String swaggerTermsOfServiceUrl;
}
