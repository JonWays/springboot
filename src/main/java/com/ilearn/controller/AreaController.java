/**
 * Author:   Administrator
 * Date:     2018-07-10 下午 11:22
 * Description:
 */
package com.ilearn.controller;

import com.ilearn.common.entitys.CommonRsp;
import com.ilearn.service.area.AreaService;
import com.ilearn.service.area.entitys.Area;
import com.ilearn.service.area.entitys.AreaRsp;
import com.ilearn.service.area.entitys.BatchQueryAreaRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/area")
public class AreaController
{
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private BatchQueryAreaRsp listArea()
    {
        BatchQueryAreaRsp rsp = areaService.queryAreaList();

        return rsp;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    private AreaRsp getAreaById(Integer areaId)
    {
        AreaRsp rsp = areaService.queryAreaById(areaId);

        return rsp;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private CommonRsp addArea(@RequestBody Area area)
    {
        CommonRsp rsp = areaService.insertArea(area);

        return rsp;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private CommonRsp modifyarea(@RequestBody Area area)
    {
        CommonRsp rsp = areaService.updateArea(area);

        return rsp;
    }

    @RequestMapping(value = "/removearea", method = RequestMethod.GET)
    private CommonRsp removeArea(Integer areaId)
    {
        CommonRsp rsp = areaService.deleteArea(areaId);

        return rsp;
    }
}
