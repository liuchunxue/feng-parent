package com.feng.module.test.controller;

import com.feng.module.test.aspest.AopPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameAopTest
 * @Description
 * @Author liucx
 * @Date2020/9/17 20:24
 **/
@RestController
@RequestMapping("/aop")
public class AopTestController {
    @GetMapping("/")
    @AopPoint(value = "/")
    public String test(String a){
        return "ok";
    }
}
