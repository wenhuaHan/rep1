package com.ambow.dao;

import com.ambow.entity.ProvinceEntity;

import java.util.List;

public interface ProvinceDao {
    //查询所有省份
    public List<ProvinceEntity> allProvince();

    //添加省份
    public void addProvince(String name);

    //根据id查询到对应的省份
    public ProvinceEntity byIdProvince(int id);

    //修改省份
    public void updateProvince(ProvinceEntity provinceEntity);

    //根据id删除对应省份

    public void delProvincebyId(int pid);


}
