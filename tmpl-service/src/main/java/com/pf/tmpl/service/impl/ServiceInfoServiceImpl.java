package com.pf.tmpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pf.tmpl.service.ServiceInfoService;
import com.pf.tmpl.dto.ServiceInfo;
import com.pf.tmpl.mapper.ServiceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author pengfei
* @description 针对表【service_info(App服务信息)】的数据库操作Service实现
* @createDate 2023-03-15 16:12:11
*/
@Service
public class ServiceInfoServiceImpl extends ServiceImpl<ServiceInfoMapper, ServiceInfo>
    implements ServiceInfoService {

}




