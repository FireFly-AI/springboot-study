package com.xq.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: Edward
 * @Date: 2019/4/8 21:06
 * @Company:
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public  String  hello(){
        return "hello spring boot !";
    }
}
