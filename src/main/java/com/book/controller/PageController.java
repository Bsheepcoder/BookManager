package com.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 专用于处理页面响应的控制器
 */
@Controller
public class PageController {
    @RequestMapping("/login")
    public String login(){

        System.out.println("进入login ");
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("进入/user/index ");
        return "/user/index";}

    @RequestMapping("/register")
    public String register(){
        System.out.println("进入register ");
        return "register";
    }

    @RequestMapping("/template")
    public String template(){
        System.out.println("进入template ");
        return "template";
    }
}