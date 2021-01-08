package com.spring.ioc.service.impl;

import com.spring.ioc.annotation.SystemLog;
import com.spring.ioc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }
    @SystemLog
    public void update() {
        System.out.println("更新用户");
    }

}
