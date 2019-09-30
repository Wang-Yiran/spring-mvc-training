package com.wangyiran.multithreadingtest.learning.test.init_destroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: multithreading-test
 * @description: 配置类
 * @author: Mr.Wang
 * @create: 2019-09-27 10:22
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.init_destroy")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
