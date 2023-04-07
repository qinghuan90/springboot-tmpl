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
 * @TableName user_info
 */
@TableName(value ="user_info")
@Data
public class UserInfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 所属系统
     */
    private String systemCode;

    /**
     * 展示名称
     */
    private String nickName;

    /**
     * 名称编码
     */
    private String code;

    /**
     * 密码
     */
    private String password;

    /**
     * 职称
     */
    private String title;

    /**
     * 手机号
     */
    private String tell;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 个人介绍
     */
    private String profile;

    /**
     * 头像
     */
    private String profilePhoto;

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