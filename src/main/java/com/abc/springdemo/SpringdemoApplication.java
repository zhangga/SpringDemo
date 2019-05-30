package com.abc.springdemo;

import com.abc.springdemo.pojo.DataBaseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.abc.springdemo.controller", "com.abc.springdemo.pojo"})
public class SpringdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringdemoApplication.class, args);
        DataBaseProperties db = ctx.getBean(DataBaseProperties.class);
        db.show();
    }

}
