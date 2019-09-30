package com.wangyiran.multithreadingtest.learning.test.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @program: multithreading-test
 * @description: Profile配置
 * @author: Mr.Wang
 * @create: 2019-09-27 10:32
 **/
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean(){
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return  new DemoBean("from production profile");
    }
}
