package com.wangyiran.multithreadingtest.learning.test.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 14:30
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
//        System.out.println(context.getEnvironment().getProperty("os.name"));
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd());
    }
}
