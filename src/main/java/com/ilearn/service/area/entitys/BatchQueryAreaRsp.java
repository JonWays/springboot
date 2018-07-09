/**
 * Author:   Administrator
 * Date:     2018-07-09 下午 10:43
 * Description:
 */
package com.ilearn.service.area.entitys;

import com.ilearn.common.entitys.CommonRsp;
import lombok.Data;

import java.util.List;

@Data
public class BatchQueryAreaRsp extends CommonRsp
{
    private List<Area> areaList = null;
}
