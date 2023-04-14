package com.pf.tmpl.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * App服务信息
 * @TableName service_info
 */
@TableName(value ="service_info")
@Data
public class ServiceInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String systemCode;

    /**
     * 
     */
    private String serviceCode;

    /**
     * 
     */
    private String serviceName;

    /**
     * 
     */
    private String remark;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}