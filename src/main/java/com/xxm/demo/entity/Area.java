package com.xxm.demo.entity;

import java.util.Date;

/***/

public class Area {
    //主键ID
    private Integer areaId;
    //区域名称
    private String areaName;
    //权重，优先级，越大越靠前
    private Integer priority;
    //创建时间
    private Date creatTime;
    //更新时间
    private Date lastEditTime;

    //定义setter和getter
    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
