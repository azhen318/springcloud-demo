package com.example.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class HelloController {

    @Autowired
    RestTemplate restTemplate;


    @Value("${msg}")
    private String msg;


    @GetMapping("/hello/{name}")
    public String sayHell(@PathVariable("name") String name){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/client/hello/"+name,String.class).getBody();
    }


    @GetMapping("/msg")
    public String getMsg(){
        return "ribbon:"+msg;
    }
}
