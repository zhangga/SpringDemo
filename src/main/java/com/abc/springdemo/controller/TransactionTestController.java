package com.abc.springdemo.controller;

import com.abc.springdemo.service.TransactionTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by U-Demon
 * Date: 2019/6/3
 */
@Controller
public class TransactionTestController {

    @Resource
    private TransactionTestService service;

    // 事务管理测试
    @GetMapping("/tran")
    @ResponseBody
    public String transactionTest() {
        service.test1();
        service.test2();
        return "请求完成";
    }

}
