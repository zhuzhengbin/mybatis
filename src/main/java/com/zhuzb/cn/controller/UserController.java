package com.zhuzb.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: com.zhuzb.cn.controller
 * @class: UserController
 * @author: zhuzb
 * @date: 2019/11/19 9:14
 * @Version 0.0.1
 * @description: 略。
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Mybatis.";
    }
}
