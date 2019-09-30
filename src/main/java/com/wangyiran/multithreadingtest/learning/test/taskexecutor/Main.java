package com.wangyiran.multithreadingtest.learning.test.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 13:49
 **/
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for(int i = 0; i < 10; i++){
            asyncTaskService.executeAsyncTaskPlus(i);
            asyncTaskService.executorAsyncTask(i);
        }
        context.close();
    }
}
