package com.example;

import com.example.controller.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SpringbootExampleApplicationTests {

    @InjectMocks
    private HelloController helloController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void contextLoads() {
    }

    /*@Test
    void testMain() {
        SpringbootExampleApplication.main(new String[]{}); // Call main method
    }*/

    @Test
    void testMain() {
        // Call main and capture the ApplicationContext
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootExampleApplication.class);

        // Assert that context is not null
        assertNotNull(context, "Spring application context should have started successfully");

        // Close context to avoid resource leaks
        context.close();
    }

    @Test
     void testHelloEndpoint() {
        String message = "sudha";
        String response = helloController.welcome(message);

        // Assert
        assertEquals("sudha, Welcome to SudhaTech..!!", response);
    }

}
