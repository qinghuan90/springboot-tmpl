package com.pf.tmpl.controller.vo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

/**
 * @ClassName UserQueryForm
 * @Description TODO
 * @Author pengfei
 * @Date 2023/4/17
 **/
@Data
public class UserQueryForm extends Page {
    String name;
}
