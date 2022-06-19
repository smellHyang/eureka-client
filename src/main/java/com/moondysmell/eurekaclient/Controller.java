package com.moondysmell.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/spring-service")
    public String springContriller(){
        return "This is spring boot(eureka client) response";
    }
}
