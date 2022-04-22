package com.example.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class HelloController {

    @Value("${msg}")
    private String msg;


    @GetMapping("/hello/{name}")
    public String sayHell(@PathVariable("name") String name){
        return "hello:"+name+";message from eureka-client";
    }

    @GetMapping("/msg")
    public String getMsg(){
        return "client:"+msg;
    }
}
