package com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AlgafoodApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodApiApplication.class, args);
    }

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello world!";
    }

}
