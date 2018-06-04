package com.wfw.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WfwEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfwEurekaServerApplication.class, args);
	}
}
