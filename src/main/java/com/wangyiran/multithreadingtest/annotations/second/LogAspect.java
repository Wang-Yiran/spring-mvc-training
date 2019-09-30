package com.wangyiran.multithreadingtest.annotations.second;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @program: multithreading-test
 * @description: 编写切面
 * @author: Mr.Wang
 * @create: 2019-09-26 16:50
 **/
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wangyiran.multithreadingtest.annotations.second.Action)")
    public void annotationPointCut(){

    }
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截" + action.name());
    }

    @Before("execution(* com.wangyiran.multithreadingtest.annotations.second.DemoMethodService.*(..))")
    public  void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
