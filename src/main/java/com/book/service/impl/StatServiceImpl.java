package com.book.service.impl;

import com.book.entity.GlobalStat;
import com.book.mapper.BookMapper;
import com.book.mapper.UserMapper;
import com.book.service.StatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StatServiceImpl implements StatService {

    @Resource
    UserMapper userMapper;
    @Resource
    BookMapper bookMapper;

    @Override
    public GlobalStat getGlobalStat() {
        return new GlobalStat(userMapper.getStudentCount(),
                bookMapper.getBookCount(),
                bookMapper.getBorrowCount());
    }
}
