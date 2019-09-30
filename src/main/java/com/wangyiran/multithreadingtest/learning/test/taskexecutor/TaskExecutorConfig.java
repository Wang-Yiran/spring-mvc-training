package com.wangyiran.multithreadingtest.learning.test.taskexecutor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @program: multithreading-test
 * @description: spring 任务执行器
 * @author: Mr.Wang
 * @create: 2019-09-27 13:18
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.taskexecutor")
@EnableAsync//利用注解开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {

    //配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法，返回一个ThreadPoolTaskExecutor，获得一个基于线程池的TaskExecutor
    @Override
    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
