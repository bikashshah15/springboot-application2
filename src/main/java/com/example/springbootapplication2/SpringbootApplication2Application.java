package com.example.springbootapplication2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication2Application {
    @GetMapping("/")
    public String home(){
        return "Hello world";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication2Application.class, args);
    }

}
