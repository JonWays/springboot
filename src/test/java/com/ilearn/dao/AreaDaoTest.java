package com.ilearn.dao;

import com.ilearn.entitys.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
    }

    @Test
    @Ignore
    public void insertArea()
    {
    }

    @Test
    public void updateArea()
    {
    }

    @Test
    public void deleteArea()
    {
    }
}