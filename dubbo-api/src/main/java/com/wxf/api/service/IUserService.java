package com.wxf.api.service;

import com.wxf.api.pojo.User;

/**
 * 用户Service
 */
public interface IUserService {

    User selectUserById(Integer id);
}
