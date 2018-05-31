package com.wfw.ribbon.consumer.controller;

import com.wfw.ribbon.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by killer9527 on 2018/5/29.
 */
@RestController
@RefreshScope
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello-ribbon", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return this.helloService.hello(name);
    }
}
