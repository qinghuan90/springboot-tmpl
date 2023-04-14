package com.pf.tmpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pf.tmpl.service.ModuleInfoService;
import com.pf.tmpl.dto.ModuleInfo;
import com.pf.tmpl.mapper.ModuleInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author pengfei
* @description 针对表【module_info(模块信息)】的数据库操作Service实现
* @createDate 2023-03-15 16:12:11
*/
@Service
public class ModuleInfoServiceImpl extends ServiceImpl<ModuleInfoMapper, ModuleInfo>
    implements ModuleInfoService {

}




