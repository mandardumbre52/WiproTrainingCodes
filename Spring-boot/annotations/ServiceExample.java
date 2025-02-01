package com.wipro.boot.annotations;

import org.springframework.stereotype.Service;

@Service
public class ServiceExample {
    public String getServiceMessage() {
        return "Hello from Service Layer!";
    }
}
