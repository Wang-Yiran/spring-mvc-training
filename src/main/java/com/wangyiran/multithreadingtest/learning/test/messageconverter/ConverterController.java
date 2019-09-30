package com.wangyiran.multithreadingtest.learning.test.messageconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-29 19:48
 **/
@Controller
public class ConverterController {
    @RequestMapping(value = "/converter", produces = { "application/x-wisely"})
    public @ResponseBody DemoObj converter(@RequestBody DemoObj demoObj){
        return demoObj;
    }
    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    public String converter(){
        return "/converter";
    }
}
