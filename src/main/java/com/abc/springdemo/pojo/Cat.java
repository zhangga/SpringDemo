package com.abc.springdemo.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by U-Demon
 * Date: 2019/5/29
 */
@Component
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫【"  + Cat.class.getSimpleName() + "】是抓老鼠的。");
    }

}
