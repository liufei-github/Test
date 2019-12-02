package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("Spring MVC进来了 ...");
        return "add";
    }
}
