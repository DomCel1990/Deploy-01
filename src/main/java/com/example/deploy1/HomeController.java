package com.example.deploy1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${devName}")
    String name;
    @GetMapping("/name")
    public String getName(){
        return name;
    }
}
