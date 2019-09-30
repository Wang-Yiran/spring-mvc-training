package com.wangyiran.multithreadingtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 15:36
 **/
@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = {"/name"}, method = RequestMethod.GET)
    public String sayName(Model model) {
        model.addAttribute("name","WangYiran");
        return "index";
    }
}
