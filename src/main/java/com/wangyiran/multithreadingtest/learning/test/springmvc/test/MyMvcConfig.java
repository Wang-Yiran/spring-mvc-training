package com.wangyiran.multithreadingtest.learning.test.springmvc.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-30 23:06
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.springmvc.test")
public class MyMvcConfig {
    @Bean
    public DemoService demoService(){
        return new DemoService();
    }
}
