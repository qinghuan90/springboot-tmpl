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
 * @TableName user_role_ref
 */
@TableName(value ="user_role_ref")
@Data
public class UserRoleRef implements Serializable {
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
    private String roleCode;

    /**
     * 
     */
    private String userCode;

    /**
     * 
     */
    private Integer isDelete;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createUser;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 
     */
    private String updateUser;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}