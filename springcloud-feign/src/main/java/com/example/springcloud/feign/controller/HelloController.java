package com.example.springcloud.feign.controller;

import com.example.springcloud.feign.controller.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/feign")
public class HelloController {

    @Autowired
    HelloFeign helloFeign;


    @GetMapping("/hello/{name}")
    public String sayHell(@PathVariable("name") String name){
        return helloFeign.sayHell(name);
    }
}
