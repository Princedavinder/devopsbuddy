package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Prince on 26-10-2017.
 */
@Controller
public class HelloworldController {
    @RequestMapping("/")
    public String hello(){
        return "index";
    }

}
