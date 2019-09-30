package com.wangyiran.multithreadingtest.learning.test.messageconverter;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-29 17:29
 **/
public class DemoObj {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DemoObj(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
