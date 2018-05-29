package com.wfw.feign.consumer.service.scheduled.hystrix;

import com.wfw.feign.consumer.service.scheduled.ScheduledServiceHello;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by killer9527 on 2018/5/29.
 */
@Component
public class ScheduledServiceHelloHystrix implements ScheduledServiceHello {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }
}
