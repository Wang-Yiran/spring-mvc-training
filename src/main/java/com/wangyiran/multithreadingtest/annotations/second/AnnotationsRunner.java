package com.wangyiran.multithreadingtest.annotations.second;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 14:47
 **/
public class AnnotationsRunner {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = (DemoMethodService) context.getBean("demoMethodService");
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
