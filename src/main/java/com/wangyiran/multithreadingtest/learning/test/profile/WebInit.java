package com.wangyiran.multithreadingtest.learning.test.profile;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @program: multithreading-test
 * @description: Servlet3.0及以上
 * @author: Mr.Wang
 * @create: 2019-09-27 10:28
 **/
public class WebInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("spring.profiles.default", "dev");
    }
    /* servlet2.5及以下
    <servlet>
        <servlet-name>dispathcer</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <param-name>spring.profiles.active</param-name>
            <param-value>production</param-value>
        </init-param>
    </servlet>
     */
}
