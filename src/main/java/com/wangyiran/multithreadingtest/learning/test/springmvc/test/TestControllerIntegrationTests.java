package com.wangyiran.multithreadingtest.learning.test.springmvc.test;

import com.wangyiran.multithreadingtest.learning.test.springmvc.test.MyMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @program: multithreading-test
 * @description: 测试SprinMVC
 * @author: Mr.Wang
 * @create: 2019-09-30 22:27
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class}) //用来声明加载的ApplicationContext时一个WebApplicationContext
@WebAppConfiguration("src/main/resources") //默认为src/main/webapp 修改为src/main/resources
public class TestControllerIntegrationTests {
    private MockMvc mockMvc;

    //在测试类中注入spring的类
    @Autowired
    private DemoService demoService;

    //可注入WebApplicationContext
    @Autowired
    WebApplicationContext wac;

    //可注入模拟的http session 此处未使用
    @Autowired
    MockHttpSession session;
    //可注入模拟的http request 此处未使用
    @Autowired
    MockHttpServletRequest request;

    //初始化工作
    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormalController() throws Exception{
        mockMvc.perform(get("/normal")) //模拟get请求
                .andExpect(status().isOk()) //预期控制返回状态为200
                .andExpect(view().name("page")) //预期view的名称为page
//                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp")) //预期页面转向的真正路径为/WEB-INF/classes/views/page.jsp
                .andExpect(forwardedUrl("page"))
                .andExpect(model().attribute("msg", demoService.saySomething())); //预期model里的值时demoService.saySomething()返回值Hello
    }

    @Test
    public void testRestController() throws Exception{
        mockMvc.perform(get("/testRest")) //模拟向/testRest进行get请求
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8")) //预期返回值的媒体类型时text/plain;charset=UTF-8
                .andExpect(content().string(demoService.saySomething())); //预期model里的值时demoService.saySomething()返回值Hello
    }
}
