package com.wangyiran.multithreadingtest.component.thread;

import org.springframework.stereotype.Component;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 16:11
 **/
@Component
public class Consumer extends Thread {
    private Storage storage;

    public Consumer(){}

    public Consumer(Storage storage , String name){
        this.storage = storage;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(3000);
                storage.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
