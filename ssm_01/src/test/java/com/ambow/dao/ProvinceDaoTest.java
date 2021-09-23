package com.ambow.dao;

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

public class ProvinceDaoTest {
    SqlSession session=null;
    @Before
    public void testBefore() throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession() ;
    }

    @Test
    public void testAllPro() throws IOException {

        ProvinceDao mapper = session.getMapper(ProvinceDao.class);//创建了ProvinceDao这个类
        List<ProvinceEntity> list = mapper.allProvince();
        for (ProvinceEntity pro:list){
            System.out.println("所有省份名如下:"+pro.getPname());
        }

    }

    @Test
    public void testAddPro() throws IOException {
        ProvinceDao mapper = session.getMapper(ProvinceDao.class);//创建了ProvinceDao这个类
        mapper.addProvince("mybatis添加省份");
        session.commit();
    }

    @Test
    public void testByIdPro() throws IOException {
        ProvinceDao mapper = session.getMapper(ProvinceDao.class);//创建了ProvinceDao这个类
        ProvinceEntity provinceEntity = mapper.byIdProvince(2);
        System.out.println("您查到的省份为:"+provinceEntity.getPname());
    }

    @Test
    public void testUpdatePro() throws IOException {
        ProvinceDao mapper = session.getMapper(ProvinceDao.class);//创建了ProvinceDao这个类
        ProvinceEntity province = mapper.byIdProvince(17);
        province.setPname("mybatis修改省份1");
        mapper.updateProvince(province);
        session.commit();//提交事务

    }

    @Test
    public void testDelPro() throws IOException {
        ProvinceDao mapper = session.getMapper(ProvinceDao.class);//创建了ProvinceDao这个类
         mapper.delProvincebyId(17);
         session.commit();//提交事务

    }

}
