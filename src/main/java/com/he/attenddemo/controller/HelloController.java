package com.he.attenddemo.controller;

import com.he.attenddemo.dao.IUserDao;
import com.he.attenddemo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class HelloController {
    @Autowired
    private IUserDao userDao;
    @RequestMapping("/hi")
    private ModelAndView Hello(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hello");
        User user=userDao.loadById("1");
        modelAndView.addObject(user);
        return modelAndView;
    }
}
