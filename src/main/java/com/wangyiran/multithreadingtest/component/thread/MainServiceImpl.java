package com.wangyiran.multithreadingtest.component.thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 16:19
 **/
@Service
public class MainServiceImpl implements MainService {
    @Autowired
    Storage storage;

    @Override
    public void threadRun() throws Exception{
        Thread consumer1 = new Consumer(storage, "Consumer1");
        Thread consumer2 = new Consumer(storage, "Consumer2");
        Thread consumer3 = new Consumer(storage, "Consumer3");
        Thread producer1 = new Producer(storage, "Producer1");
        Thread producer2 = new Producer(storage, "Producer2");
        Thread producer3 = new Producer(storage, "Producer3");
        consumer1.start();
        consumer2.start();
        consumer3.start();
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.join();
        consumer2.join();
        consumer3.join();
        producer1.join();
        producer2.join();
        producer3.join();
    }
}
