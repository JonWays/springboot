package com.ilearn.dao;

import com.ilearn.entitys.Area;

import java.util.List;

public interface AreaDao
{
    List<Area> queryAreaList();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(int areaId);
}
