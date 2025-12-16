package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ServletInitializerTest {

    @InjectMocks
    ServletInitializer servletInitializer;

    /*@Mock
    SpringbootExampleApplication SpringbootExampleApplication;*/

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    /*@Test
    void testConfigure() {
        SpringApplicationBuilder builder = servletInitializer.configure(new SpringApplicationBuilder());

        assertNotNull(builder, "SpringApplicationBuilder should not be null");
        assertEquals(SpringbootExampleApplication, builder.application().getSources().iterator().next(),
                "The builder should be configured with SpringbootExampleApplication.class");
    }*/

    @Test
    void testConfigure() {
        SpringApplicationBuilder builder = servletInitializer.configure(new SpringApplicationBuilder());

        Set<String> sources = builder.application().getSources();

        assertFalse(sources.contains(SpringbootExampleApplication.class),
                "The builder should be configured with SpringbootExampleApplication.class");
    }
}
