package com.pf.tmpl.config.mybatisplus;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName MybaitsPlusMetaObjectHandler
 * @Description TODO
 * @Author pengfei
 * @Date 2023/3/3
 **/
@Component
public class MybaitsPlusMetaObjectHandler implements MetaObjectHandler {
    //添加数据的时候执行
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    //修改数据的时候执行
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }


}
