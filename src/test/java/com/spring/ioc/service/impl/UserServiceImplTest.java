package com.spring.ioc.service.impl;

import com.spring.ioc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-application1.xml"})
public class UserServiceImplTest {

    @Autowired
    public UserService UserService;
    @Test
    public void addUser() throws Exception {
        UserService.update();
        Object f;

    }

    @Test
    public void update() throws Exception {
    }

}