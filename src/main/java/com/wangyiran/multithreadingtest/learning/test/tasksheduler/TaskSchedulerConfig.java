package com.wangyiran.multithreadingtest.learning.test.tasksheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: multithreading-test
 * @description: 02配置类
 * @author: Mr.Wang
 * @create: 2019-09-27 14:04
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.tasksheduler")
@EnableScheduling//开启对计划任务的支持
public class TaskSchedulerConfig {
}
