package com.abc.springdemo.service;

import com.abc.springdemo.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void printUser(User user) {
        if (user == null) {
            throw new RuntimeException("检查用户参数是否为空......");
        }
        System.out.println("编号: " + user.getId());
        System.out.println("用户名称: " + user.getUserName());
        System.out.println("备注: " + user.getNote());
    }

    @Override
    public void manyAspects() {
        System.out.println("测试多个切面顺序");
    }

}
