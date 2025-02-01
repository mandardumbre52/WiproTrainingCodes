package com.wipro.boot.di;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String getType() {
        return "Petrol Engine";
    }
}
