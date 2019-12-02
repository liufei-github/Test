package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/8/19.
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @RequestMapping("/list")
    public String list(ModelMap map){
        System.out.println("进来了...");
        map.addAttribute("msg","HELLO WORLD!");
        return "list";
    }
}
