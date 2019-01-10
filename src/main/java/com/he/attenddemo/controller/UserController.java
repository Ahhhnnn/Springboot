package com.he.attenddemo.controller;

import com.he.attenddemo.dao.IUserDao;
import com.he.attenddemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.he.attenddemo.model.User;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/getUser")
    private User getUser(){
        return userService.loadById("1");
    }

    @RequestMapping("/findAll")
    private List<User> findAll(){
        return userService.findAll();
    }
}
