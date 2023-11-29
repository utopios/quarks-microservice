package com.example.custom.extension.runtime;

import jakarta.enterprise.inject.Produces;

public class ConverterProducer {

    @Produces
    public CustomConverter customConverter() {
        return new CustomConverter();
    }
}
