package com.abc.springdemo.service;

import com.abc.springdemo.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
public class UserValidatorImpl implements UserValidator {

    @Override
    public boolean validate(User user) {
        System.out.println("引入新的接口：" + UserValidator.class.getSimpleName());
        return user != null;
    }

}
