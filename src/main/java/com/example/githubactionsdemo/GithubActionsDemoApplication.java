package com.example.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubActionsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }

}

@RestController
class DemoController {

    public String hello() {
        return "Hello World...";
    }
}