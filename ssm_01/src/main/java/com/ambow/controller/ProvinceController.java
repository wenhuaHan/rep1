package com.ambow.controller;

import com.ambow.entity.ProvinceEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProvinceController {

    @RequestMapping( "addProvince")
    public String addProvince(int id,String name){
        System.out.println(id+"第一次。。。。"+name);
        //return "index";
        return "redirect:index.jsp";

    }

    @RequestMapping( "addProvince2")
    public String addProvince2(ProvinceEntity province){
        System.out.println(province.getPid()+"...自定义类..."+province.getPname());
        //return "index";
        return "redirect:index.jsp";

    }
}
