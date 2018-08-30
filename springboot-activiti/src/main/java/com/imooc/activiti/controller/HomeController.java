package com.imooc.activiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhong
 * @Title: HomeController
 * @ProjectName springboot-activiti
 * @Description: TODO
 * @date 2018/8/30 15:00
 */
@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "success";
    }
}
