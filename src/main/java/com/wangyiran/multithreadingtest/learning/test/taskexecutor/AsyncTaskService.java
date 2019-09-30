package com.wangyiran.multithreadingtest.learning.test.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @program: multithreading-test
 * @description: 任务执行类
 * @author: Mr.Wang
 * @create: 2019-09-27 13:42
 **/
@Service
public class AsyncTaskService {
    @Async//表明为异步方法
    public void executorAsyncTask(Integer i){
        System.out.println("执行异步任务" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1：" + (i+1));
    }
}
