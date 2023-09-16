package com.book.service.impl;

import com.book.entity.AuthUser;
import com.book.mapper.UserMapper;
import com.book.service.AuthService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    UserMapper mapper;

    @Override
    public void register(String name, String password, String mail){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        AuthUser user = new AuthUser(0,name,encoder.encode(password),"user",mail);
        if(mapper.registerUser(user) <= 0){
            throw new RuntimeException("用户基本信息添加失败！");
        }
    }

    @Override
    public AuthUser findUser(HttpSession session) {
        AuthUser user = (AuthUser) session.getAttribute("user");
        if(user == null) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            user = mapper.getPasswordByUsername(authentication.getName());
            session.setAttribute("user", user);
        }
        return user;
    }
}
