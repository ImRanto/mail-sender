package com.example.test.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
    @GetMapping("/add")
    public Long add(@RequestParam long a, @RequestParam long b) {
        return a + b;
    }
}
