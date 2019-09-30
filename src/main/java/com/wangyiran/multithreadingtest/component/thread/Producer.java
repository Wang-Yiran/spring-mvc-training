package com.wangyiran.multithreadingtest.component.thread;

import org.springframework.stereotype.Component;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-26 16:08
 **/
@Component
public class Producer extends Thread{
    private Storage storage;

    public Producer(){}

    public Producer(Storage storage , String name){
        this.storage = storage;
    }

    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
                storage.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
