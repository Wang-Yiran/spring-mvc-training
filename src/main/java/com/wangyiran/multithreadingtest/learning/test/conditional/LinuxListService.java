package com.wangyiran.multithreadingtest.learning.test.conditional;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-27 14:25
 **/
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
