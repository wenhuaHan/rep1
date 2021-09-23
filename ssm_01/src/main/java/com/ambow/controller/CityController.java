package com.ambow.controller;

import com.ambow.entity.CityEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {

    @RequestMapping( "addCity")
    public String addCity(CityEntity city){
        System.out.println(city.getCid());
        System.out.println(city.getCname());
        System.out.println(city.getCproid().getPname());
        //return "index";
        return "redirect:index.jsp";

    }

}
