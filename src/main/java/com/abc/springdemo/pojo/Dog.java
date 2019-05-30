package com.abc.springdemo.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by U-Demon
 * Date: 2019/5/29
 */
@Component
@Primary
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】是看门用的。");
    }

}
