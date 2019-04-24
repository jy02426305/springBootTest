package com.cyx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@Controller
@RequestMapping(value="/upload")
public class UploadController {
//    @RequestMapping(value="/form")
//    public String form(){
//        return "upload/form";
//    }

    @RequestMapping(value="/uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam(value = "file") MultipartFile file){
        String filePath="D:/reset/springboot-upload/";
        try{
            File targetFile=new File(filePath);
            if(!targetFile.exists()){
                targetFile.mkdirs();
            }
            String fileName=file.getOriginalFilename();
            FileOutputStream fileOutputStream=new FileOutputStream(filePath+fileName);
            fileOutputStream.write(file.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "成功";
    }
}
