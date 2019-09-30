package com.wangyiran.multithreadingtest.learning.test.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


/**
 * @program: multithreading-test
 * @description: 演示配置类
 * @author: Mr.Wang
 * @create: 2019-09-26 18:56
 **/
@Configuration
@ComponentScan("com.wangyiran.multithreadingtest.learning.test.springel")
//@PropertySource("classpath:com/wangyiran/multithreadingtest/learning/test/springel/test.properties")
//@PropertySource("#{ T(ClassLoader).getSystemResource(\"\")}" + "com/wangyiran/multithreadingtest/learning/test/springel/test.properties")
public class ElConfig {
    @Value("I Love You! ") //1
    private String normal;
    @Value("#{systemProperties['os.name']}") //2
    private String osName;
    @Value(("#{ T(java.lang.Math).random() * 100.0 }")) //3
    private double randomNumber;
    @Value("#{demoService.another}") //4
    private String fromAnother;
//    @Value("#{ T(ClassLoader).getSystemResource(\"\")}" + "com/wangyiran/multithreadingtest/learning/test/springel/test.properties")
    @Value("classpath:test.properties")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
//    @Value("${book.name}")
//    private String bookName;

    @Autowired
    private Environment environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
    public void outputResource() {
        try{
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
//            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
