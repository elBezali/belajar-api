package com.example.belajar_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class test {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public Map<String, Object> users() {
        Map<String, Object> response = new HashMap<>();
        response.put("data", Arrays.asList("user1", "user2", "user3"));
        return response;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> save(@RequestBody Map<String, Object> body) {
        Map<String, Object> response = new HashMap<>();
        response.put("data", body);
        return response;
    }
}