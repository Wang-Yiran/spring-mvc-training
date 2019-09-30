package com.wangyiran.multithreadingtest.learning.test.messageconverter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-29 15:46
 **/
@Configuration
public class ControllerAdapter implements WebMvcConfigurer {

//    以上可以改写为
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry){
//        registry.addViewController("/converter").setViewName("/converter");
//    }

    /**
     * configureMessageConverters： 重载会覆盖掉SpringMVC默认注册的多个HttpMessageConverter
     * extendMessageConverters: 仅添加一个自定义的HttpMessageConverter，不覆盖默认注册的HttpMessageConverter
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converter());
    }
    @Bean
    public MyMessageConverter converter(){
        return new MyMessageConverter();
    }
}
