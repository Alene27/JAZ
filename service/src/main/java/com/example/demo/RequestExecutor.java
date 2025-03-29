package com.example.demo;

import com.example.demo.FacadeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RequestExecutor implements CommandLineRunner {
    private final FacadeService facadeService;
    private String result;

    public RequestExecutor(FacadeService facadeService) {
        this.facadeService = facadeService;
    }

    @Override
    public void run(String... args) {
        facadeService.execute(this);
        System.out.println("Wynik: " + result);
    }

    public void setResult(String result) {
        this.result = result;
    }
}