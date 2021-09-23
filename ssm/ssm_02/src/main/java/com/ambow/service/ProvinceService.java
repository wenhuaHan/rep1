package com.ambow.service;

import com.ambow.dao.ProvinceDao;
import com.ambow.entity.ProvinceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceService{
    @Autowired
    ProvinceDao provinceDao;

    /*public void setProvinceDao(ProvinceDao provinceDao) {
        this.provinceDao = provinceDao;
    }*/

    public void addProvinceService(String name)
    {
        ProvinceEntity province=new ProvinceEntity();
        province.setPname(name);
        provinceDao.addProvince(name);
    }

    public List<ProvinceEntity> findallProvinceService()
    {
        return provinceDao.allProvince();
    }

    public  void delProvinceService(int id){
        provinceDao.delProvincebyId(id);

    }

    public void updateProvince(int id,String name){
      ProvinceEntity province=new ProvinceEntity();
       province.setPid(id);
       province.setPname(name);
       provinceDao.updateProvince(province);
    }

    public ProvinceEntity findbyIdProvinceService(int id){
        return provinceDao.byIdProvince(id);
    }


}
