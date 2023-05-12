package com.pf.tmpl.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TreeData
 * @Description TODO
 * @Author pengfei
 * @Date 2023/5/6
 **/
@Data
public class TreeData {
    int id;
    int parentId;
    List<TreeData> childs = new ArrayList<>();
}
