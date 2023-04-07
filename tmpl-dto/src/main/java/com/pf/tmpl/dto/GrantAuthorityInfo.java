package com.pf.tmpl.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName grant_authority_info
 */
@TableName(value ="grant_authority_info")
@Data
public class GrantAuthorityInfo implements Serializable {
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
    private String roleCode;

    /**
     * 权限累加值
     */
    private String authValue;

    /**
     * 是否删除
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