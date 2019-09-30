package com.wangyiran.multithreadingtest.annotations.first;

/**
 * @program: multithreading-test
 * @description: 使用注解
 * @author: Mr.Wang
 * @create: 2019-09-26 14:46
 **/
public class TestAnnotation {

    private DoSomeThing doSomeThing= new DoSomeThing();


    @FirstAnnotation
    public void test(){
        doSomeThing.test();
    }
}
