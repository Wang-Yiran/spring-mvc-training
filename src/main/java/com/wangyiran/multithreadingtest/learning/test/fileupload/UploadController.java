package com.wangyiran.multithreadingtest.learning.test.fileupload;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @program: multithreading-test
 * @description:
 * @author: Mr.Wang
 * @create: 2019-09-29 17:10
 **/
@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file) {
        try {
            //writeByteArrayToFile 快速写文件到磁盘
            FileUtils.writeByteArrayToFile(new File("/Users/wangyiran/upload/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e){
            e.printStackTrace();
            return "wrong";
        }
    }
}
