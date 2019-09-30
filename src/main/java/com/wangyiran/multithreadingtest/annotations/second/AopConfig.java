package com.wangyiran.multithreadingtest.annotations.second;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: multithreading-test
 * @description: 配置类
 * @author: Mr.Wang
 * @create: 2019-09-26 16:57
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.annotations.second")
@EnableAspectJAutoProxy
public class AopConfig {
}
