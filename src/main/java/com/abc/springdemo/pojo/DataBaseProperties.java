package com.abc.springdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by U-Demon
 * Date: 2019/5/31
 */
@Component
@PropertySource("classpath:jdbc.properties")
@ConfigurationProperties(prefix = "database")
public class DataBaseProperties {

    private String driverName = null;

    private String url = null;

    private String username = null;

    private String password = null;

    public void show() {
        System.out.println("DataBase配置信息：");
        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
