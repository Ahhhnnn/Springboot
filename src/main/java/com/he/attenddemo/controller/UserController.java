package com.he.attenddemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.he.attenddemo.model.User;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    private User getUser(){
        return new User("hening",12);
    }
}
