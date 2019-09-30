package com.wangyiran.multithreadingtest.learning.test.messageconverter;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @program: multithreading-test
 * @description: 用来处理request和response里的数据，spring内置了大量HttpMessageConverter，这里演示自定义并注册到SpringMVC
 * @author: Mr.Wang
 * @create: 2019-09-29 17:24
 **/
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
    public MyMessageConverter(){
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));//新建一个自定义媒体类型application,x-wisely
    }
    //表明本HttpMessageConverter只处理DemoObj这个类
    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    //处理请求的数据 表明处理由"-"隔开的数据数据，并转成DemoObj的对象
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(), Charset.forName("UTF-8"));
        String []tempArr = temp.split("-");
        return new DemoObj(tempArr[0], tempArr[1]);
    }

    //处理如何输出数据到response， 在原样输出前面加上"hello："
    @Override
    protected void writeInternal(DemoObj demoObj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + demoObj.getId() + "-" + demoObj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
