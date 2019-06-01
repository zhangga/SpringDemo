package com.abc.springdemo.service;

import com.abc.springdemo.pojo.User;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
@Aspect
@Component
public class MyAspect {

    @DeclareParents(
            value = "com.abc.springdemo.service.UserServiceImpl",
            defaultImpl = UserValidatorImpl.class
    )
    public UserValidator userValidator;

    @Pointcut("execution(* com.abc.springdemo.service.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("around before ......");
        // 回调目标对象的原有方法
        jp.proceed();
        System.out.println("around after ......");
    }

    @Before("pointCut() && args(user)")
    public void beforeParam(JoinPoint point, User user) {
        Object[] args = point.getArgs();
        System.out.println("beforeParam ......");
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("before ......");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after ......");
    }

    @AfterReturning("pointCut()")
    public void afterReturning() {
        System.out.println("afterReturning ......");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ......");
    }

}
