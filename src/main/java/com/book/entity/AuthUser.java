package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 它用于自动生成一个包含所有类字段的构造函数，以简化Java类的开发。
public class AuthUser {
    int id;
    String username;
    String password;
    String role;
    String mail;
}