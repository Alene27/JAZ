package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StagingService implements HandlerServiceInterface {
    @Override
    public String execute() {
        return "Hello from Staging";
    }
}