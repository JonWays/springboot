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
import org.springframework.util.StringUtils;

import java.util.Date;

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
        CommonRsp rsp = new CommonRsp();

        if(StringUtils.isEmpty(area.getAreaName()))
        {
            rsp.setErrorCode(ConstantReturnCode.PARAMS_ERROR);
            rsp.setErrorMsg("Param invalid!");
            return rsp;
        }

        try
        {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            int effectedNum = areaDao.insertArea(area);
            if(effectedNum <= 0)
            {
                throw new RuntimeException("insert failed!");
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException(ConstantReturnCode.SYSTEM_ERROR + " + " + e.getMessage());
        }

        rsp.setErrorMsg(ConstantReturnCode.SYSTEM_ERROR);
        rsp.setErrorMsg("Insert Area Successful!");
        return rsp;
    }

    @Override
    public CommonRsp updateArea(Area area)
    {
        CommonRsp rsp = new CommonRsp();

        if(StringUtils.isEmpty(area.getAreaId()))
        {
            rsp.setErrorCode(ConstantReturnCode.PARAMS_ERROR);
            rsp.setErrorMsg("Param invalid!");
            return rsp;
        }

        try
        {
            area.setLastEditTime(new Date());
            int effectedNum = areaDao.updateArea(area);
            if(effectedNum <= 0)
            {
                throw new RuntimeException("update failed!");
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException(ConstantReturnCode.SYSTEM_ERROR + " + " + e.getMessage());
        }

        rsp.setErrorMsg(ConstantReturnCode.SYSTEM_ERROR);
        rsp.setErrorMsg("Update Area Successful!");
        return rsp;
    }

    @Override
    public CommonRsp deleteArea(int areaId)
    {
        CommonRsp rsp = new CommonRsp();

        if(areaId <= 0)
        {
            rsp.setErrorCode(ConstantReturnCode.PARAMS_ERROR);
            rsp.setErrorMsg("Param invalid!");
            return rsp;
        }

        try
        {
            int effectedNum = areaDao.deleteArea(areaId);
            if(effectedNum <= 0)
            {
                throw new RuntimeException("delete failed!");
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException(ConstantReturnCode.SYSTEM_ERROR + " + " + e.getMessage());
        }

        rsp.setErrorMsg(ConstantReturnCode.SYSTEM_ERROR);
        rsp.setErrorMsg("Delete Area Successful!");
        return rsp;
    }
}
