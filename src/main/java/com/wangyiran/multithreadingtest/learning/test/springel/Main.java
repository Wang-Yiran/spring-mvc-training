package com.wangyiran.multithreadingtest.learning.test.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URL;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 19:10
 **/
public class Main {
    public static void main(String[] args) {
//        URL systemResource = ClassLoader.getSystemResource("");
//        System.out.println(systemResource.toString());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = (ElConfig) context.getBean("elConfig");
        resourceService.outputResource();
        context.close();
    }
}
