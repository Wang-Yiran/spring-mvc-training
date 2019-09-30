package com.wangyiran.multithreadingtest.learning.test.tasksheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: multithreading-test
 * @description: 01计划任务执行类
 * @author: Mr.Wang
 * @create: 2019-09-27 13:59
 **/
@Service
public class ScheduledTaskService {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) //fixedRate属性：每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次" + dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 28 11 ? * *") //使用cron属性可按照指定时间执行， 每天11点28分执行 cron是Unix和类UNIX系统下的定时任务
    public void fixTimeExecution(){
        System.out.println("在指定时间" + dateFormat.format(new Date() + "执行"));
    }
}
