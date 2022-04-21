package com.example.springcloud.feign.controller.hystrix;

import com.example.springcloud.feign.controller.feign.HelloFeign;
import com.example.springcloud.model.bo.HytrixErrorBo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ClientHelloHystrix implements HelloFeign {

    private String code="EUREKA-CLIENT";

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String sayHell(@PathVariable("name") String name){
        try {
            HytrixErrorBo heb=new HytrixErrorBo(code,"sayHell",name);
            return objectMapper.writeValueAsString(heb);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return code+"服务异常";
        }
    }
}
