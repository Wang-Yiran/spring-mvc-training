package com.wangyiran.multithreadingtest.learning.test.server.send.event;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * @program: multithreading-test
 * @description: 服务端推送技术：SSE（Server Send Event 服务端发送事件）需要新式浏览器的支持
 * @author: Mr.Wang
 * @create: 2019-09-30 15:56
 **/
@Controller
public class SseController {
    @RequestMapping(value = "/push", produces = "text/event-stream;charset=UTF-8") //输出的媒体类型为text/event-stream，这是服务器端SSE的支持
    //produces中要添加charset=UTF-8不然会报错
    public @ResponseBody String push(){
        Random r = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + r.nextInt() + "\n\n";
    }

    @RequestMapping("/sse")
    public String sseIndex(){
        return "/sse";
    }
}
