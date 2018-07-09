/**
 * Author:   Administrator
 * Date:     2018-07-09 下午 10:32
 * Description:
 */
package com.ilearn.service.area;

import com.ilearn.common.entitys.CommonRsp;
import com.ilearn.service.area.entitys.Area;
import com.ilearn.service.area.entitys.AreaRsp;
import com.ilearn.service.area.entitys.BatchQueryAreaRsp;

public interface AreaService
{
    BatchQueryAreaRsp queryAreaList();

    AreaRsp queryAreaById(int areaId);

    CommonRsp insertArea(Area area);

    CommonRsp updateArea(Area area);

    CommonRsp deleteArea(int areaId);
}
