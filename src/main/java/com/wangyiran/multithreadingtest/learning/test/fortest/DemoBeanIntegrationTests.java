package com.wangyiran.multithreadingtest.learning.test.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 14:50
 **/
@RunWith(SpringJUnit4ClassRunner.class) // 在JUnit环境下提供Spring TestContext Framework 的功能
@ContextConfiguration(classes = {TestConfig.class}) // 用来加载配置Application， 其中classes属性用来加载配置类
@ActiveProfiles("prod") //用来声明活动的profile
public class DemoBeanIntegrationTests {
    @Autowired //可以使用普通的autowired来注入
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContent();
        assertEquals(expected, actual);
    }
}
