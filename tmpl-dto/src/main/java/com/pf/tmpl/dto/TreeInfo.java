package com.pf.tmpl.dto;

import lombok.Data;

/**
 * @ClassName TestInfo
 * @Description TODO
 * @Author pengfei
 * @Date 2023/5/6
 **/
@Data
public class TreeInfo extends  TreeData{
    String name;
    String code;

    public TreeInfo(int id, String name, String code, int parentId) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.parentId = parentId;
    }
}
