package com.pf.tmpl.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 模块信息
 * @TableName module_info
 */
@TableName(value ="module_info")
@Data
public class ModuleInfo implements Serializable {
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
    private String moduleCode;

    /**
     * 
     */
    private String moduleName;

    /**
     * 
     */
    private String moduleUrl;

    /**
     * 
     */
    private String moduleIcon;

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