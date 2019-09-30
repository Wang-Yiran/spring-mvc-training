package com.wangyiran.multithreadingtest.annotations.first;

import java.lang.annotation.*;

/**
 * @program: multithreading-test
 * @description: 测试注解
 * @author: Mr.Wang
 * @create: 2019-09-26 14:42
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface FirstAnnotation {
    long time() default -1;
}
