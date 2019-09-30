package test.com.wangyiran.multithreadingtest.component.thread; 

import com.wangyiran.multithreadingtest.component.thread.*;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** 
* Consumer Tester. 
* 测试多线程的生产与消费
* @author <Authors name> 
* @since <pre>9月 26, 2019</pre> 
* @version 1.0 
*/ 
public class ConsumerTest {
    private AnnotationConfigApplicationContext context;
    MainService mainService;

@Before
public void before() throws Exception {
    context = new AnnotationConfigApplicationContext(DiConfig.class);
    mainService = (MainService) context.getBean("mainServiceImpl");
} 

@After
public void after() throws Exception {
    context.close();
} 

/** 
* 
* Method: run() 
* 
*/ 
@Test
public void testRun() throws Exception {
    mainService.threadRun();


//TODO: Test goes here... 
} 

/** 
* 
* Method: hashCode() 
* 
*/ 
@Test
public void testHashCode() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: equals(Object var1) 
* 
*/ 
@Test
public void testEquals() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: uncaughtException(Thread var1, Throwable var2) 
* 
*/ 
@Test
public void testUncaughtException() throws Exception { 
//TODO: Test goes here... 
} 


} 
