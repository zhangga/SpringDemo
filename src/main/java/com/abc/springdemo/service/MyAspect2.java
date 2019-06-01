package com.abc.springdemo.service;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
@Aspect
@Component
@Order(3)
public class MyAspect2 {

    @Pointcut("execution(* com.abc.springdemo.service.UserServiceImpl.manyAspects(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("MyAspect2 before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("MyAspect2 after ......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("MyAspect2 afterReturning ......");
    }

}
