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
@Order(1)
public class MyAspect1 {

    @Pointcut("execution(* com.abc.springdemo.service.UserServiceImpl.manyAspects(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("MyAspect1 before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("MyAspect1 after ......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("MyAspect1 afterReturning ......");
    }

}
