package com.pf.tmpl.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName LoginVo
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/9
 **/
@Data
@ApiModel(value = "登陆表单",description = "登陆表单")
public class LoginVo {
    @ApiModelProperty(value = "名称")
    String name;

    @ApiModelProperty(value = "密码")
    String password;

    @ApiModelProperty(value = "验证码")
    String captcha;
}
