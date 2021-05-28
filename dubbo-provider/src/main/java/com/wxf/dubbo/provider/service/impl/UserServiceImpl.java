package com.wxf.dubbo.provider.service.impl;

import com.wxf.api.pojo.User;
import com.wxf.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 用户服务实现类
 */
@DubboService(version = "${dubbo.service.version}")
public class UserServiceImpl implements IUserService {

    @Override
    public User selectUserById(Integer id) {
        User user = new User();
        user.setId(id);
        user.setAge(18);
        user.setUsername("wxf");
        return user;
    }
}
