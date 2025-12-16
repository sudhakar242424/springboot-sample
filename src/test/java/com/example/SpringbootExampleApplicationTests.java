package com.example;

import com.example.controller.HelloController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootExampleApplicationTests {

    @InjectMocks
    private HelloController helloController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    public void testHelloEndpoint() throws Exception {
        String message = "sudha";
        String response = helloController.welcome(message);

        // Assert
        assertEquals("sudha, Welcome to SudhaTech..!!", response);
    }

}
