package com.wangyiran.multithreadingtest.annotations.first;

import java.util.Date;

/**
 * @program: multithreading-test
 * @description: 注解实现类
 * @author: Mr.Wang
 * @create: 2019-09-26 14:44
 **/
public class DoSomeThing {
    public void test() {
        System.out.println("执行自定义注解");
        System.out.println("执行自定义注解结束时间："+new Date());
    }
}
