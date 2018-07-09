/**
 * Author:   Administrator
 * Date:     2018-07-09 下午 10:45
 * Description:
 */
package com.ilearn.service.area.impl;

import com.ilearn.common.Constant.ConstantReturnCode;
import com.ilearn.common.entitys.CommonRsp;
import com.ilearn.dao.AreaDao;
import com.ilearn.service.area.AreaService;
import com.ilearn.service.area.entitys.Area;
import com.ilearn.service.area.entitys.AreaRsp;
import com.ilearn.service.area.entitys.BatchQueryAreaRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AreaServiceImpl implements AreaService
{
    @Autowired
    private AreaDao areaDao;

    @Override
    public BatchQueryAreaRsp queryAreaList()
    {
        BatchQueryAreaRsp rsp = new BatchQueryAreaRsp();
        rsp.setAreaList(areaDao.queryAreaList());

        rsp.setErrorCode(ConstantReturnCode.SUCCESS);
        rsp.setErrorMsg("Batch Query Area Success!");
        return rsp;
    }

    @Override
    public AreaRsp queryAreaById(int areaId)
    {
        AreaRsp rsp = new AreaRsp();
        rsp.setArea(areaDao.queryAreaById(areaId));
        rsp.setErrorCode(ConstantReturnCode.SUCCESS);
        rsp.setErrorMsg("Query Area By Id Success!");

        return rsp;
    }

    @Transactional
    @Override
    public CommonRsp insertArea(Area area)
    {
        try
        {
            int effectedNum = areaDao.insertArea(area);
            if(effectedNum > 0)
            {}
        }
        catch(Exception e)
        {
            throw new RuntimeException();
        }
        return null;
    }

    @Override
    public CommonRsp updateArea(Area area)
    {
        return null;
    }

    @Override
    public CommonRsp deleteArea(int areaId)
    {
        return null;
    }
}
