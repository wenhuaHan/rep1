package com.ambow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HwhController1 {

    @RequestMapping("otherController")
    public String test12(){
       // model.addAttribute("uname","汪苏泷");
        return  "ii";
    }
}
