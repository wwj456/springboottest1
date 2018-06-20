package com.gl.springbootagi.controller;

import com.gl.springbootutils.helper.CommenMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/test")
public class TestController {
    /**
     * 测试获取时间
     * @return
     */
    @GetMapping("/date")
    public String getdate(){
       Date date= CommenMethod.getCurDate();
        SimpleDateFormat sf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return "当前时间"+sf.format(date);
    }

}
