package com.wangyiran.multithreadingtest.learning.test.init_destroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description: 测试Bean的获取和销毁
 * @author: Mr.Wang
 * @create: 2019-09-27 10:24
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
