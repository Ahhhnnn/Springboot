package com.he.attenddemo.controller;

import com.he.attenddemo.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.he.attenddemo.model.User;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserDao userDao;
    @RequestMapping("/getUser")
    private User getUser(){
        return userDao.loadById("1");
    }

    @RequestMapping("/findAll")
    private List<User> findAll(){
        return userDao.findAll();
    }
}
