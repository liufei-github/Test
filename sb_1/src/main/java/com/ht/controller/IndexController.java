package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/20.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String hello(){
        System.out.println("---------------");
        return "hello";
    }
}
