package com.ambow.controller;

import com.ambow.entity.ProvinceEntity;
import com.ambow.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping( "addProvince")
    public String addProvince(String name){
        provinceService.addProvinceService(name);
        return "forward:allProvince";

    }

    @RequestMapping( "allProvince")
    public String allProvince(HttpServletRequest request){
        List<ProvinceEntity> provinceList = provinceService.findallProvinceService();
        request.setAttribute("provinceList",provinceList);
        return "provinceAll";

    }

    @RequestMapping( "delProvince")
    public String delProvince(int id){
        provinceService.delProvinceService(id);
        return "forward:allProvince";

    }

    @RequestMapping( "byIdProvince")
    public String byIdProvince(int id,HttpServletRequest request){
        ProvinceEntity pro = provinceService.findbyIdProvinceService(id);
        request.setAttribute("province",pro);
        return "provinceUpdate";

    }

    @RequestMapping( "updateProvince")
    public String updateProvince(ProvinceEntity province){
        int pid = province.getPid();
        String pname = province.getPname();
        provinceService.updateProvince(pid,pname);
        return "forward:allProvince";

    }
}
