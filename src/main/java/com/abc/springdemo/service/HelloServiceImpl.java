package com.abc.springdemo.service;

/**
 * Created by U-Demon
 * Date: 2019/5/31
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello(String name) {
        if (name == null || name.trim() == "") {
            throw new RuntimeException("parameter is null!!");
        }
        System.out.println("hello " + name);
    }

}
