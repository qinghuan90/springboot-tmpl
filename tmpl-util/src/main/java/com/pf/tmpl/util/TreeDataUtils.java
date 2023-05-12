package com.pf.tmpl.util;

import com.pf.tmpl.dto.TreeData;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName TreeUtils
 * @Description TODO
 * @Author pengfei
 * @Date 2023/5/6
 **/
public class TreeDataUtils {


    // 树形结构组装
    public static List<? extends TreeData> handleTreeData(List<? extends TreeData> treeInfos) {
        treeInfos.forEach(
                treeData -> {
                    if (treeData.getParentId() != 0) {
                        TreeData data = treeInfos.stream().filter(t -> t.getId() == treeData.getParentId()).findFirst().get();
                        data.getChilds().add(treeData);
                    }
                }
        );
        return treeInfos.stream().filter(x -> x.getParentId() == 0).collect(Collectors.toList());
    }
}
