package com.he.attenddemo.controller;

import com.github.pagehelper.PageHelper;
import com.he.attenddemo.dao.IUserDao;
import com.he.attenddemo.dao.RedisDao;
import com.he.attenddemo.helper.MessageResult;
import com.he.attenddemo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.he.attenddemo.model.User;
import sun.rmi.runtime.Log;

import java.util.List;
@Slf4j
@RestController
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private RedisDao redisDao;
    @RequestMapping("/getUser")
    private User getUser(){
        return userService.loadById("1");
    }

    @RequestMapping("/findAll")
    private MessageResult findAll(int page,int limit){
        PageHelper.startPage(page,limit);
        List<User> userList=userService.findAll();
        int count=userService.queryCount();
        MessageResult messageResult=new MessageResult(0,"操作成功",count,userList);
        return messageResult;
    }

    @RequestMapping("/getValue")
    private String getValueFromRedis(){
        String key="username";
        log.error("####redis的value:"+redisDao.getValue(key));
        return redisDao.getValue(key);
    }



}
