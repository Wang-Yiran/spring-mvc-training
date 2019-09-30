package com.wangyiran.multithreadingtest.learning.test.server.send.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @program: multithreading-test
 * @description: servelet3.0异步支持配置bean
 * @author: Mr.Wang
 * @create: 2019-09-30 16:47
 **/
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.server.send.event")
public class MyServeletConfig {
}
