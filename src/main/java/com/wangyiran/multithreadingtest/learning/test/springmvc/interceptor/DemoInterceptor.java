package com.wangyiran.multithreadingtest.learning.test.springmvc.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: multithreading-test
 * @description: 示例拦截器
 * @author: Mr.Wang
 * @create: 2019-09-27 15:55
 **/
public class DemoInterceptor extends HandlerInterceptorAdapter {//配置拦截器的Bean
    //重写addIntercepetors方法，注册拦截器
    //请求发生前执行
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Handler) throws Exception{
        Long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }
    //请求完成后执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object Handler,
                            ModelAndView modelAndView) throws Exception {
        Long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        Long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为：" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime -startTime);
    }
}
