package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DevService implements HandlerServiceInterface {
    @Override
    public String execute() {
        return "Hello from Dev";
    }
}