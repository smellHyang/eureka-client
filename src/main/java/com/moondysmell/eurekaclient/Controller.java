package com.moondysmell.eurekaclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class Controller {


    @GetMapping("/spring-service")
    public String springController(){
        return "This is spring boot(eureka client) response";
    }

    //CircuitBreaker Test용
    //private final String profile;

//    Controller(String profile) {
//        this.profile = profile;
//    }

//    @GetMapping("/")
//    public ResponseJson home() {
//        return new ResponseJson("Hello world from " + profile);
//    }

    @GetMapping("/spring-service/exception")
    public ResponseJson exception() throws Exception {

        Thread.sleep(10000);

        return new ResponseJson("Success!");
    }

    private class ResponseJson {

        private final String msg;
        private ResponseJson(String msg) {
            this.msg = msg;
        }
        public String getMsg() {
            return msg;
        }
    }




}
