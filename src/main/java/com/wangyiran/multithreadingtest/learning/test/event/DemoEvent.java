package com.wangyiran.multithreadingtest.learning.test.event;

import org.springframework.context.ApplicationEvent;

/**
 * @program: multithreading-test
 * @description: 01自定义时间，继承ApplicationEvent
 * @author: Mr.Wang
 * @create: 2019-09-27 10:52
 **/
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;
    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
