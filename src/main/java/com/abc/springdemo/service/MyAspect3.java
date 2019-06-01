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
@Order(2)
public class MyAspect3 {

    @Pointcut("execution(* com.abc.springdemo.service.UserServiceImpl.manyAspects(..))")
    public void pointCut() {

    }

    @Before("pointCut()")
    public void before() {
        System.out.println("MyAspect3 before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("MyAspect3 after ......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("MyAspect3 afterReturning ......");
    }

}
