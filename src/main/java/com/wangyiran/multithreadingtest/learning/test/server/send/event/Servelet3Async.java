package com.wangyiran.multithreadingtest.learning.test.server.send.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @program: multithreading-test
 * @description: Serverlet3.0异步 可以支持跨浏览器
 * @author: Mr.Wang
 * @create: 2019-09-30 16:33
 **/
@Controller
public class Servelet3Async {
    /*
    当一个请求到达API接口，如果该API接口的return返回值是DeferredResult，在没有超时或者DeferredResult对象设置setResult时，
    接口不会返回，但是Servlet容器线程会结束，DeferredResult另起线程来进行结果处理(即这种操作提升了服务短时间的吞吐能力)，
    并setResult，如此以来这个请求不会占用服务连接池太久，如果超时或设置setResult，接口会立即返回。
     */
    @Autowired
    PushService pushService;

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }

    @RequestMapping("/async")
    public String asyncIndex(){
        return "/async";
    }
}
