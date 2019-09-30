package com.wangyiran.multithreadingtest.learning.test.init_destroy;

/**
 * @program: multithreading-test
 * @description: Bean的初始化和销毁
 * @author: Mr.Wang
 * @create: 2019-09-27 09:46
 **/
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }
}
