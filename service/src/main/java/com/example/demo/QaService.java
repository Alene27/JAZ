package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class QaService implements HandlerServiceInterface {
    @Override
    public String execute() {
        return "Hello from QA";
    }
}