package com.abc.springdemo.service;

import com.abc.springdemo.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by U-Demon
 * Date: 2019/6/3
 */
@Service
public class TransactionTestService {
    @Resource
    UserDao userDao;

    public Boolean test1() {
        return true;
    }

    @Transactional
    public Boolean test2() {
        return false;
    }

}
