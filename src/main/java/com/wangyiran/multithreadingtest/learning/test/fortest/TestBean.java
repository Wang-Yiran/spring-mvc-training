package com.wangyiran.multithreadingtest.learning.test.fortest;

/**
 * @program: multithreading-test
 * @description: 测试业务代码
 * @author: Mr.Wang
 * @create: 2019-09-27 14:47
 **/
public class TestBean {
    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
