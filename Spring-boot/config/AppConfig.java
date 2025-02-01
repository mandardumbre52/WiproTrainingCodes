package com.wipro.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    private String name;
    private String version;

    public void setName(String name) { this.name = name; }
    public void setVersion(String version) { this.version = version; }

    public void displayInfo() {
        System.out.println("App Name: " + name);
        System.out.println("Version: " + version);
    }
}
