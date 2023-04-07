package com.pf.tmpl.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 功能归属组
 * @TableName ability_info
 */
@TableName(value ="ability_info")
@Data
public class AbilityInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private String moduleCode;

    /**
     * 功能名称
     */
    private String abilityName;

    /**
     * 功能编码
     */
    private String abilityCode;

    /**
     * 描述
     */
    private String remark;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 权值
     */
    private Long weight;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}