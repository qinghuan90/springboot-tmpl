package com.pf.tmpl.util;

import com.alibaba.fastjson2.JSONObject;
import com.pf.tmpl.dto.TreeData;
import com.pf.tmpl.dto.TreeInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
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
                    if (treeData.getParentId() != 0){
                       TreeData data = treeInfos.stream().filter(t -> t.getId() == treeData.getParentId()).findFirst().get();
                        data.getChilds().add(treeData);
                    }
                }
        );
        return treeInfos.stream().filter(x -> x.getParentId() == 0).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<TreeInfo> treeInfos = new ArrayList<TreeInfo>(){{
            add(new TreeInfo(1,"郑州分公司","ZZ_F",0));
            add(new TreeInfo(2,"北京分公司","BJ_F",0));
            add(new TreeInfo(3,"郑州西区交付","ZZ_FJ",1));
            add(new TreeInfo(4,"北京交付二组","BJ_FJ2",2));
            add(new TreeInfo(5,"北京交付1组","BJ_FJ1",2));
            add(new TreeInfo(6,"郑州交付二组DEV产品线","ZZ_FJD",3));
        }};


        List<TreeInfo> treeInfos1 = (List<TreeInfo>) handleTreeData(treeInfos);

        System.out.println(JSONObject.toJSONString(treeInfos1));

    }
}
