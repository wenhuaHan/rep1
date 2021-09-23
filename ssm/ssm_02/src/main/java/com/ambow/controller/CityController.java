package com.ambow.controller;

import com.ambow.entity.CityEntity;
import com.ambow.entity.ProvinceEntity;
import com.ambow.service.CityService;
import com.ambow.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CityController {

    @Autowired
    CityService cityService;
    @Autowired
    ProvinceService provinceService;

    @RequestMapping( "findAllPro")
    public String findAllPro(HttpServletRequest request){
        List<ProvinceEntity> provinceList = provinceService.findallProvinceService();
        request.setAttribute("provinceList",provinceList);
        //System.out.println("............"+provinceList);
        return "cityAdd";

    }

    @RequestMapping( "addCity")
    public String addCity(CityEntity city){
        cityService.addCity(city);
        return "forward:allCity";

    }

    @RequestMapping( "allCity")
    public String allCity(CityEntity city, Model model){
        List<CityEntity> cityList = cityService.findallCityService();
        model.addAttribute("cityList",cityList);
        return "cityAll";

    }

    @RequestMapping( "delCity")
    public String delCity(int id){
        cityService.delCityByIdService(id);
        return "forward:allCity";

    }

    @RequestMapping( "byIdCity")
    public String byIdCity(int id,Model model){
        CityEntity city = cityService.findbyIdCityService(id);
        model.addAttribute("city",city);
        model.addAttribute("provinceList",provinceService.findallProvinceService());
        return "cityUpdate";

    }

    @RequestMapping( "updateCity")
    public String updateCity(CityEntity city){
        cityService.updateCityById(city);
        return "forward:allCity";

    }


}
