package com.example.springcloud.feign.controller.feign;

import com.example.springcloud.feign.controller.hystrix.ClientHelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "EUREKA-CLIENT")
public interface HelloFeign {

    @GetMapping("/client/hello/{name}")
    public String sayHell(@PathVariable("name") String name);
}
