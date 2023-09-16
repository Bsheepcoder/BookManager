package com.book.service;

import com.book.entity.AuthUser;

import javax.servlet.http.HttpSession;

public interface AuthService {
    void register(String name, String password, String mail);
    AuthUser findUser(HttpSession session);
}
