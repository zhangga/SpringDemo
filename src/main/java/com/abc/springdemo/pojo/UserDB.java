package com.abc.springdemo.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Created by U-Demon
 * Date: 2019/6/3
 */
@Alias(value = "userDB")
public class UserDB {

    private Long id = null;

    private String name = null;

    private String password = null;

    // 性别枚举，使用typeHandler进行转换
    private SexEnum sex = null;

    public UserDB() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
