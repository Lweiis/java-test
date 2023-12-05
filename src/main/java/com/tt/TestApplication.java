package com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.tt.component")
public class TestApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Worldsss!";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}

