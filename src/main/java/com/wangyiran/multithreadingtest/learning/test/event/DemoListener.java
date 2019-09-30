package com.wangyiran.multithreadingtest.learning.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @program: multithreading-test
 * @description: 02定义事件监听器，实现ApplicationListener
 * @author: Mr.Wang
 * @create: 2019-09-27 10:54
 **/
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息：" + msg);
    }
}
