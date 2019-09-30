package com.wangyiran.multithreadingtest.learning.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @program: multithreading-test
 * @description: 03使用容器发布事件
 * @author: Mr.Wang
 * @create: 2019-09-27 11:00
 **/
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;//用来发布事件

    public void publish(String msg){
        applicationContext.publishEvent(new DemoEvent(this, msg));//使用ApplicationContext的publishEvent方法来发布事件
    }
}
