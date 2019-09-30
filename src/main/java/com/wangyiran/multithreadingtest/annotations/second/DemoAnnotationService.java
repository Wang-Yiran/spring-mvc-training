package com.wangyiran.multithreadingtest.annotations.second;

import org.springframework.stereotype.Service;

/**
 * @program: multithreading-test
 * @description: 编写使用注解的被拦截类
 * @author: Mr.Wang
 * @create: 2019-09-26 16:47
 **/
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {
        System.out.println("注解方法已add");
    }
}
