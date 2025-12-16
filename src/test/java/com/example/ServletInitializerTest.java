package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ServletInitializerTest {

    @InjectMocks
    ServletInitializer servletInitializer;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testConfigure() {
        SpringApplicationBuilder builder = servletInitializer.configure(new SpringApplicationBuilder());

        Set<String> sources = builder.application().getSources();

        assertFalse(sources.contains(SpringbootExampleApplication.class),
                "The builder should be configured with SpringbootExampleApplication.class");
    }
}
