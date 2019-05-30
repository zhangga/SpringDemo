package com.abc.springdemo.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by U-Demon
 * Date: 2019/5/28
 */
@Configuration
@ComponentScan(basePackages = "com.abc.springdemo.pojo", lazyInit = true,
        excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class AppConfig {

}
