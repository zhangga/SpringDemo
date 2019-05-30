package com.abc.springdemo.service;

import com.abc.springdemo.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by U-Demon
 * Date: 2019/5/29
 */
@Service
public class UserService {

    public void printUser(User user) {
        System.out.println("编号: " + user.getId());
        System.out.println("用户名称: " + user.getUserName());
        System.out.println("备注: " + user.getNote());
    }

}
