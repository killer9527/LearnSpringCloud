package com.wfw.feign.consumer.service;

/**
 * Created by killer9527 on 2018/5/29.
 */
public interface HelloService {
    String hello(String name);

    String version();
}
