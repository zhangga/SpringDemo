package com.abc.springdemo.controller;

import com.abc.springdemo.pojo.User;
import com.abc.springdemo.service.UserService;
import com.abc.springdemo.service.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by U-Demon
 * Date: 2019/6/1
 */
@Controller
@RequestMapping("/user")
public class UserController {

    // 注入用户服务
    @Autowired
    private UserService userService = null;

    @RequestMapping("/print")
    @ResponseBody
    public User printUser(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        userService.printUser(user);
        return user;
    }

    @RequestMapping("/vp")
    @ResponseBody
    public User validateAndPrint(Long id, String userName, String note) {
        User user = new User();
        user.setId(id);
        user.setUserName(userName);
        user.setNote(note);
        // 强制转换
        UserValidator userValidator = (UserValidator) userService;
        // 验证用户是否为空
        if (userValidator.validate(user)) {
            userService.printUser(user);
        }
        return user;
    }

    @RequestMapping("/many")
    @ResponseBody
    public String manyAspects() {
        userService.manyAspects();
        return "manyAspects test";
    }

}
