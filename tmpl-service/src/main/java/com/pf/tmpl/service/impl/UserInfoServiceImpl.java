package com.pf.tmpl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pf.tmpl.service.UserInfoService;
import com.pf.tmpl.dto.UserInfo;
import com.pf.tmpl.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author pengfei
* @description 针对表【user_info】的数据库操作Service实现
* @createDate 2023-03-15 16:12:11
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService {

}




