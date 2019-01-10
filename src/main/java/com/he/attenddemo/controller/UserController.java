package com.he.attenddemo.controller;

import com.github.pagehelper.PageHelper;
import com.he.attenddemo.dao.IUserDao;
import com.he.attenddemo.dao.RedisDao;
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
    private List<User> findAll(PageHelper pageHelper){
        //PageHelper.startPage(1,10);
        return userService.findAll();
    }

    @RequestMapping("/getValue")
    private String getValueFromRedis(){
        String key="username";
        log.error("####redis的value:"+redisDao.getValue(key));
        return redisDao.getValue(key);
    }


}
