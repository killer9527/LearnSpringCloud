package com.wfw.feign.consumer.service.impl;

import com.wfw.feign.consumer.service.HelloService;
import com.wfw.feign.consumer.service.scheduled.ScheduledServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by killer9527 on 2018/5/29.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private ScheduledServiceHello scheduledServiceHello;

    @Override
    public String hello(String name) {
        return this.scheduledServiceHello.hello(name);
    }
}
