package com.wangyiran.multithreadingtest.learning.test.springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: multithreading-test
 * @description: SpringEL和资源调用
 * @author: Mr.Wang
 * @create: 2019-09-26 18:55
 **/
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
