package com.ilearn.dao;

import com.ilearn.service.area.entitys.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AreaDaoTest
{
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryAreaList()
    {
        List<Area> areaList = areaDao.queryAreaList();
//        assertEquals(2, areaList.size());
    }

    @Test
    public void queryAreaById()
    {
        System.out.println(areaDao.queryAreaById(1));
    }

    @Test
    public void insertArea()
    {
        Area area = new Area();
        area.setAreaName("韩府山庄");
        area.setCreateTime(new Date());
        area.setLastEditTime(new Date());
        area.setPriority(8);

        int result = areaDao.insertArea(area);
        System.out.println(result);
    }

    @Test
    public void updateArea()
    {
        Area area = new Area();
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        area.setPriority(3);

        int result = areaDao.updateArea(area);
        System.out.println(result);
    }

    @Test
    public void deleteArea()
    {
        System.out.println(areaDao.deleteArea(3));
    }
}