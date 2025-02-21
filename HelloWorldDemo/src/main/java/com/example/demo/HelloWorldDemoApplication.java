package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldDemoApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/put")
    public String sayHell() {
        return "Hello from BridgeLabz put";
    }
    @GetMapping("/h")
    public String sayHel() {
        return "Hello from BridgeLabz new";
    }
}
