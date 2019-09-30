package com.wangyiran.multithreadingtest.learning.test.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 10:34
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");//先将活动的profile设置为prod
        context.register(ProfileConfig.class);//后置注册Bean配置类，不然会报Bean未定义的错误
        context.refresh();//刷新容器

        DemoBean demoBean = (DemoBean) context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
