package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRest {
    @Value("${hello}")
    String hello;

    @RequestMapping("/hello")
    public String hello() {
        return hello;
    }
}
