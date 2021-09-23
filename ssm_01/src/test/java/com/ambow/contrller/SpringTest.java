package com.ambow.contrller;

import com.ambow.dao.ProvinceDao;
import com.ambow.entity.CityEntity;
import com.ambow.entity.ProvinceEntity;
import com.ambow.service.CityService;
import com.ambow.service.ProvinceService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    @Test
    public void test01(){
        CityEntity city=new CityEntity();
        city.setCname("测试");
        System.out.println("原来的"+city.getCname());
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        CityEntity city1 = (CityEntity)app.getBean("cityEntity");
        //city1.setCname("测试2");
        System.out.println("现在的"+city1);

    }

    @Test
    public void test02(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        ProvinceDao provinceDao = app.getBean(ProvinceDao.class);
        List<ProvinceEntity> provinceEntityList = provinceDao.allProvince();
        for (ProvinceEntity pro:provinceEntityList){
            System.out.println(pro.getPname());
        }
    }

    @Test
    public void test03(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        ProvinceService provinceService=(ProvinceService)app.getBean("provinceService");
       // provinceService.addProvinceService("spring-mybatis整合添加");
        List<ProvinceEntity> provinceEntityList = provinceService.findallProvinceService();
        for (ProvinceEntity pro:provinceEntityList){
            System.out.println(pro.getPname());
        }
    }

    @Test
    public void test04(){
        ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        CityService cityService=(CityService)app.getBean("cityService");
        ProvinceEntity provinceEntity=new ProvinceEntity();
        provinceEntity.setPid(1);
        cityService.addCity(new CityEntity("spring-mybatis整合添加城市",provinceEntity));

       /* List<CityEntity> cityEntityList = cityService.findallCityService();
        for (CityEntity city:cityEntityList){
            System.out.println("城市:"+city.getCname()+",省份:"+city.getCproid().getPname());
        }*/

        /*int cid = cityService.findbyCnameByProidCityService(1, "spring-mybatis整合添加城市");
        System.out.println(cid);*/
    }

}
