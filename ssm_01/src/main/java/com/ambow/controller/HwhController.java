package com.ambow.controller;

import com.ambow.entity.CityEntity;
import com.ambow.entity.ProvinceEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HwhController {


    @RequestMapping("putongString")
    public String test01(int id,String username){
        System.out.println(id+":"+username);
        return "index";
    }

    @RequestMapping("putongClass")
    public String test02(ProvinceEntity province){
        System.out.println("省份id："+province.getPid()+",省份名："+province.getPname());
        return "index";
    }

    @RequestMapping("ClassForeignkey")
    public String test03(CityEntity city){
        System.out.println("城市id："+city.getCid()+"城市名："+city.getCname()+"省份名："+city.getCproid().getPname());
        return "index";
    }

    @RequestMapping("putongRequest")
    public String test04(HttpServletRequest request){
        request.setAttribute("username","zhang");
        return  "aa";
    }

    @RequestMapping("putongClassRequest")
    public String test05(ProvinceEntity province,HttpServletRequest request){
        province.setPid(1);
        province.setPname("内蒙古");
        request.setAttribute("province",province);
        return  "bb";
    }

    @RequestMapping("ClassForeignkeyRequest")
    public String test06(CityEntity city,HttpServletRequest request){
         city.setCid(1);
         city.setCname("呼和浩特");
         city.setCproid(new ProvinceEntity("内蒙古"));
         request.setAttribute("city",city);
         return  "cc";
    }

    @RequestMapping("ListForeignkeyRequest")
    public String test07(HttpServletRequest request){
        List<CityEntity> citylist=new ArrayList<>();
        ProvinceEntity province1 = new ProvinceEntity(1,"内蒙古");
        ProvinceEntity province2 = new ProvinceEntity(2,"山东");
        ProvinceEntity province3 = new ProvinceEntity(3,"新疆");
        citylist.add(new CityEntity(1,"乌兰察布",province1));
        citylist.add(new CityEntity(2,"济南",province2));
        citylist.add(new CityEntity(3,"乌鲁木齐",province3));
        request.setAttribute("citylist",citylist);
        return  "dd";
    }

    @RequestMapping("putongModel")
    public String test08(Model model){
        model.addAttribute("uname","汪苏泷");
        return  "ee";
    }

    @RequestMapping("putongClassModel")
    public String test09(ProvinceEntity province,Model model){
        province.setPid(2);
        province.setPname("宁夏");
        model.addAttribute("pro",province);
        return  "ff";
    }

    @RequestMapping("ForeignkeyModel")
    public String test10(CityEntity city,Model model){
        city.setCid(1);
        city.setCname("呼和浩特");
        city.setCproid(new ProvinceEntity("内蒙古"));
        model.addAttribute("city",city);
        return  "gg";
    }

    @RequestMapping("ListForeignkeyModel")
    public String test11(Model model){
        List<CityEntity> citylist=new ArrayList<>();
        ProvinceEntity province1 = new ProvinceEntity(1,"内蒙古");
        ProvinceEntity province2 = new ProvinceEntity(2,"山东");
        ProvinceEntity province3 = new ProvinceEntity(3,"新疆");
        citylist.add(new CityEntity(1,"乌兰察布",province1));
        citylist.add(new CityEntity(2,"济南",province2));
        citylist.add(new CityEntity(3,"乌鲁木齐",province3));
        model.addAttribute("citylist",citylist);
        return  "hh";
    }

    @RequestMapping("ControllerModel")
    public String test12(Model model){
        model.addAttribute("uname","汪苏泷2");
        return  "forward:otherController";
    }

    @RequestMapping("SessionForeignkey")
    public String test13(CityEntity city,HttpSession session){
        city.setCid(2);
        city.setCname("乌兰察布");
        city.setCproid(new ProvinceEntity("内蒙古"));
        session.setAttribute("city1",city);
        return "jj";
    }

}
