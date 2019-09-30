package com.wangyiran.multithreadingtest.learning.test.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: multithreading-test
 * @description: @ExceptionHandler 用于全局处理控制器里的异常
 * @author: Mr.Wang
 * @create: 2019-09-29 11:13
 **/
@ControllerAdvice //声明一个控制器建言 @ControllerAdvice组合了@Component注解，所以自动注册为Spring的Bean
public class ExceptionHandlerAdvice {
    @ExceptionHandler(value = Exception.class) //@ExceptionHandler 在此处定义全局处理，通过@ExceptionHandler的value属性属性可过滤拦截条件
    public ModelAndView exception1(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute //使用@ModelAttribute注解将键值对添加到全局，所有注解的@RequestMapping的方法可获得此键值对
    public void addAttributes(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    @InitBinder //通过@InitBinder注解定制WebDataBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setDisallowedFields("id"); //此处演示忽略request参数的id
    }
}
