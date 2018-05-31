package com.wfw.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class WfwEurekaClientApplication {

    @Value("${server.port}")
    private String port;

    @Value("${application.version}")
    private String version;

    public static void main(String[] args) {
        SpringApplication.run(WfwEurekaClientApplication.class, args);
    }

    @RequestMapping("/service/hello")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    @RequestMapping("/service/version")
    public String version(){
        return this.version;
    }
}
