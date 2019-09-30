package com.wangyiran.multithreadingtest.learning.test.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @program: multithreading-test
 * @description: 配置类
 * @author: Mr.Wang
 * @create: 2019-09-27 14:26
 **/
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }
    @Bean
    @Conditional({MacCondition.class, LinuxCondion.class})
    public ListService MacListService() {
        return new LinuxListService();
    }
//    @Bean
//    @Conditional(LinuxCondion.class)
//    public ListService LinuxListService(){
//        return new LinuxListService();
//    }
}
