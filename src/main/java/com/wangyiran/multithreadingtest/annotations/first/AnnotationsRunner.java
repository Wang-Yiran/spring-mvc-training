package com.wangyiran.multithreadingtest.annotations.first;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 14:47
 **/
public class AnnotationsRunner {
    public static void main(String[] args) throws Exception {
        System.out.println("执行自定义注解开始时间："+new Date());
        Class clazz = TestAnnotation.class;
        Method[] ms = clazz.getMethods();
        for (Method method : ms) {
            boolean flag = method.isAnnotationPresent(FirstAnnotation.class);
            if (flag) {
                method.invoke(clazz.newInstance(), null);
            }
        }
    }
}
