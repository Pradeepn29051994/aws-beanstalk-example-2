package com.techprimers.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Pradeep";
    }
    
    @PostMapping("welcome")
    public String welcome() {
        return "Welcome to AWS CICD Pradeep...";
    }
}
