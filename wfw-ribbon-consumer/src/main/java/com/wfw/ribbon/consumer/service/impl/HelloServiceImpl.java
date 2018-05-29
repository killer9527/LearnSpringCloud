package com.wfw.ribbon.consumer.service.impl;

import com.wfw.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by killer9527 on 2018/5/29.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return this.restTemplate.getForObject("http://SERVICE-HELLO-WORLD/service/hello?name=" + name, String.class);
    }
}
