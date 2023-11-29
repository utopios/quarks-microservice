package com.example;

import io.opentelemetry.instrumentation.annotations.WithSpan;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomService {

    @WithSpan("service custom")
    public String getString() {
        return "Hello from service";
    }
}
