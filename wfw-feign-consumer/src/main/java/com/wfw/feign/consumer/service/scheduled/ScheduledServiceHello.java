package com.wfw.feign.consumer.service.scheduled;

import com.wfw.feign.consumer.service.scheduled.hystrix.ScheduledServiceHelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by killer9527 on 2018/5/29.
 * 指定服务名称为“service-hello-world”
 */
@FeignClient(value = "service-hello-world", fallback = ScheduledServiceHelloHystrix.class)
@Service
public interface ScheduledServiceHello {

    @RequestMapping(value = "/service/hello", method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/service/version", method = RequestMethod.GET)
    String version();
}
