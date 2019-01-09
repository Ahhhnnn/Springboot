package com.he.attenddemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class HelloController {
    @RequestMapping("/hi")
    private String Hello(){
        log.error("");
        return "hello";
    }
}
