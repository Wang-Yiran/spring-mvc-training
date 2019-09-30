package com.wangyiran.multithreadingtest.learning.test.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 11:03
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = (DemoPublisher) context.getBean("demoPublisher");
        demoPublisher.publish("hello application event");
        context.close();
    }
}
