package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.demo.RequestExecutor;
import java.util.Map;

@Service
public class FacadeService {
    private final Map<String, HandlerServiceInterface> services;

    @Value("${app.environment:dev}")
    private String environment;

    public FacadeService(Map<String, HandlerServiceInterface> services) {
        this.services = services;
    }

    public String execute(RequestExecutor requestExecutor) {
        HandlerServiceInterface selectedService = services.getOrDefault(
                environment + "Service",
                services.get("devService")
        );

        String result = selectedService.execute();
        requestExecutor.setResult(result);
        return result;
    }

    public String execute() {
        HandlerServiceInterface selectedService = services.getOrDefault(
                environment + "Service",
                services.get("devService")
        );

        return selectedService.execute();
    }
}