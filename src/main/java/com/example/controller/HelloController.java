package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable("name") String name) {
        return name+", Welcome to Ashok IT Family..!!";
    }
}
