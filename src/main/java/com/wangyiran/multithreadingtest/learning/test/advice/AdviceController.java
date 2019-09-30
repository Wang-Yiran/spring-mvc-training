package com.wangyiran.multithreadingtest.learning.test.advice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: multithreading-test
 * @description: 演示控制器
 * @author: Mr.Wang
 * @create: 2019-09-29 14:40
 **/
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg,DemoObj obj)
    {
        throw new IllegalArgumentException("非常抱歉，参数有误/"+"来自@ModelAttribute：" + msg);
    }

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
    }
}
