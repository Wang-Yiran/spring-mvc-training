package com.wangyiran.multithreadingtest.learning.test.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @program: multithreading-test
 * @description: 判定linux条件
 * @author: Mr.Wang
 * @create: 2019-09-27 14:22
 **/
public class LinuxCondion implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("os.name").contains("Linux");
    }
}
