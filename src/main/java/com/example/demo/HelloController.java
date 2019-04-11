package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
    public String welcomeTo() {
        return "WELCOME to Spring!!!!!!!!!!!";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello from Spring!";
    }

}