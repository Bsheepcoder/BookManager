package com.book.controller;

import com.book.service.impl.AuthServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@RequestMapping("/api/auth")
public class AuthController {
    @Resource
    AuthServiceImpl authService;
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestParam("username") String name,
                           @RequestParam("password") String password,
                           @RequestParam("mail") String mail){
        System.out.println(" " + name + password + mail);
        if(authService.register(name,password,mail))
            return "login";
        return "errorpage";
    }
}
