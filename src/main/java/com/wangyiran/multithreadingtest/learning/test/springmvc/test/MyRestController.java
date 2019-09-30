package com.wangyiran.multithreadingtest.learning.test.springmvc.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-30 22:58
 **/
@Controller
public class MyRestController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/testRest" , produces = "text/plain;charset=UTF-8")
    public @ResponseBody String testRest() {
        return demoService.saySomething();
    }
}
