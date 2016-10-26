package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigRest {
    @Value("${hello}")
    String hello;

    @Value("${welcome}")
    String welcome;

    @RequestMapping("/hello")
    public String hello() {
        return hello;
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return welcome;
    }

}
