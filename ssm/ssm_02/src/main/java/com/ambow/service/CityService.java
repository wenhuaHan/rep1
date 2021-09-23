package com.ambow.service;
import com.ambow.dao.CityDao;
import com.ambow.entity.CityEntity;
import com.ambow.entity.ProvinceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {
     @Autowired
     CityDao cityDao;

    public void addCity(CityEntity city){

        cityDao.addCity(city);
    }


    public List<CityEntity> findallCityService(){
        return cityDao.allCity();
    }

    public CityEntity findbyIdCityService(int id){

        return cityDao.byIdCity(id);
    }

    public void delCityByIdService(int id){

        cityDao.delCityById(id);
    }

    public void updateCityById(CityEntity city){
        cityDao.updateCity(city);
    }


    public int findbyCnameByProidCityService(int proid,String cname){
        return cityDao.byCnameByProidCity(cname,proid);
    }


}
