package com.wangyiran.multithreadingtest.learning.test.othercontrollerconfig;

import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-29 15:46
 **/
public class ControllerAdapter implements WebMvcConfigurer {
    /*
    @RequestMapping（"/index")
    public String Hello(){
        return "index";
    }
     */
//    以上可以改写为
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("/index");
    }
    //路径参数中如果带"."带化，"."后面带值将被忽略，通过重写以下方法，可以接受"."以后的参数
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false);
    }
    //更多配置查看WebMvcConfigurerAdapter和WebMvcConfigurer
}
