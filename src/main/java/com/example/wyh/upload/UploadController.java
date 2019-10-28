package com.example.wyh.upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


@Controller
@RequestMapping("upload")
@CrossOrigin
public class UploadController {
    @PostMapping("/addImage")
    @ResponseBody
    public Object addImage(@RequestParam(name = "image_data", required = false) MultipartFile file) {

        String fileName = file.getOriginalFilename();
        //文件上传
        if (!file.isEmpty()) {
            try {
                //图片命名
//                String newCompanyImageName = "newPIC";
                String newCompanyImagepath = "H:\\photo\\"+fileName;
                File newFile = new File(newCompanyImagepath);
                if (!newFile.exists()) {
                    newFile.createNewFile();
                }
                file.transferTo(newFile);
                /*BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(newFile));
                out.write(file.getBytes());
                out.flush();
                out.close();*/
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败";
            }
        }
        return "上传成功";
    }
}
