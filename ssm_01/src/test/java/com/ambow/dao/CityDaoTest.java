package com.ambow.dao;

import com.ambow.entity.CityEntity;
import com.ambow.entity.ProvinceEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CityDaoTest {
    SqlSession session=null;
    @Before
    public void testBefore() throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession() ;
    }

    @Test
    public void testAddCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        CityEntity city=new CityEntity();
        city.setCname("mybatis 添加城市");
        ProvinceEntity province=new ProvinceEntity();
        province.setPid(1);
        city.setCproid(province);
        mapper.addCity(city);
        session.commit();
    }

    @Test
    public void testDelCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        mapper.delCityById(7);
        session.commit();
    }

    @Test
    public void testUpdateCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        CityEntity cityEntity=new CityEntity();
        cityEntity.setCname("mybatis修改城市");
        ProvinceEntity provinceEntity=new ProvinceEntity();
        provinceEntity.setPid(1);
        cityEntity.setCproid(provinceEntity);
        cityEntity.setCid(7);
        mapper.updateCity(cityEntity);
        session.commit();
    }

    @Test
    public void testAllCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        List<CityEntity> cityList = mapper.allCity();
        for (CityEntity city:cityList){
            System.out.println("城市名:"+city.getCname()+"，省份名："+city.getCproid().getPname());
        }
    }

    @Test
    public void testByIdCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        CityEntity cityEntity = mapper.byIdCity(2);
        System.out.println("所查询到的城市名为："+cityEntity.getCname()+"，省份名为："+cityEntity.getCproid().getPname());
    }

    @Test
    public void testbyCnameByProidCity() throws IOException {

        CityDao mapper = session.getMapper(CityDao.class);//创建了ProvinceDao这个类
        int cid = mapper.byCnameByProidCity("呼和浩特",1);
        System.out.println(cid);
    }




}
