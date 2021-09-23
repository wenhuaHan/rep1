package com.ambow.dao;

import com.ambow.entity.CityEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityDao {

    //添加城市
    public void addCity(CityEntity cityEntity);

    //查询所有城市
    public List<CityEntity> allCity();

    //删除城市
    public void delCityById(int cid);

    //修改城市
    public void updateCity(CityEntity cityEntity);

    //根据id查询城市
    public CityEntity byIdCity(int id);

    //根据城市名和省份id返回对应城市id
     public int byCnameByProidCity(@Param("cname") String cname,@Param("proid")int proid);
}
