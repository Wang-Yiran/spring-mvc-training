package com.wangyiran.multithreadingtest.annotations.second;

import org.springframework.stereotype.Service;

/**
 * @program: multithreading-test
 * @description: 编写使用方法规则被拦截类
 * @author: Mr.Wang
 * @create: 2019-09-26 16:49
 **/
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("方法规则已add");
    }
}
