package com.wangyiran.multithreadingtest;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
//关闭特定的自动配置，例如关闭数据源
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.wangyiran.multithreadingtest.mapper")
@EnableCaching
public class MultithreadingTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultithreadingTestApplication.class, args);
    }

}
