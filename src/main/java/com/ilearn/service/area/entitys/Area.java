/**
 * Author:   Administrator
 * Date:     2018-07-08 下午 2:35
 * Description:
 */
package com.ilearn.service.area.entitys;

import lombok.Data;

import java.util.Date;

@Data
public class Area
{
    //主键ID
    private Integer areaId;

    //区域名称
    private String areaName;

    //权重，越大越排前显示
    private Integer priority;

    //创建时间
    private Date createTime;

    //更新时间
    private Date lastEditTime;
}
