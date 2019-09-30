package com.wangyiran.multithreadingtest.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: multithreading-test
 * @description: 主页
 * @author: Mr.Wang
 * @create: 2019-09-26 11:16
 **/
@RestController
public class MainRestController {

    @RequestMapping(value = {"","index"}, method = RequestMethod.GET)
    public String sayHi() {
        return "Hello Spring Boot";
    }

}
