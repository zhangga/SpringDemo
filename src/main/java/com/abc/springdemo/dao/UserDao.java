package com.abc.springdemo.dao;

import com.abc.springdemo.pojo.UserDB;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by U-Demon
 * Date: 2019/6/3
 */
@Repository
public interface UserDao {
    /**
     * 返回数据列表
     *
     * @return
     */
    List<UserDB> findAllUsers();

    /**
     * 添加
     *
     * @param User
     * @return
     */
    int insertUser(UserDB User);

    /**
     * 修改
     *
     * @param User
     * @return
     */
    int updUser(UserDB User);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delUser(Long id);
}
