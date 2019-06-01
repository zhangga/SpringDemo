package com.abc.springdemo.config;

import com.abc.springdemo.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.abc.springdemo.service"}, basePackageClasses = UserServiceImpl.class)
public class AspectConfig {

    @Bean(name = "myAspect")
    public MyAspect initMyAspect() {
        return new MyAspect();
    }

    @Bean(name = "myAspect2")
    public MyAspect2 initMyAspect2() {
        return new MyAspect2();
    }

    @Bean(name = "myAspect1")
    public MyAspect1 initMyAspect1() {
        return new MyAspect1();
    }

    @Bean(name = "myAspect3")
    public MyAspect3 initMyAspect3() {
        return new MyAspect3();
    }

}
