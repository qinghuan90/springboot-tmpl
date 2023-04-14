package com.pf.tmpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pf.tmpl.service.SystemInfoService;
import com.pf.tmpl.dto.SystemInfo;
import com.pf.tmpl.mapper.SystemInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author pengfei
* @description 针对表【system_info】的数据库操作Service实现
* @createDate 2023-03-15 16:12:11
*/
@Service
public class SystemInfoServiceImpl extends ServiceImpl<SystemInfoMapper, SystemInfo>
    implements SystemInfoService {

}




