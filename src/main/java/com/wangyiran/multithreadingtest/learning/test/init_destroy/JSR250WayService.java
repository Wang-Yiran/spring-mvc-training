package com.wangyiran.multithreadingtest.learning.test.init_destroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: multithreading-test
 * @description: JSR250形式的Bean
 * @author: Mr.Wang
 * @create: 2019-09-27 09:57
 **/
public class JSR250WayService {
    @PostConstruct //在构造函数执行完之后执行
    public void init(){
        System.out.println("@jsr250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("@jsr250-destroy-method");
    }
}
