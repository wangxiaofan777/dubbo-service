package com.wxf.dubbo.consumer.service.impl;

import com.wxf.api.pojo.User;
import com.wxf.api.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 用户服务消费者接口
 */
@Component
public class UserConsumer implements CommandLineRunner {

    @DubboReference(version = "${dubbo.service.version}")
    private IUserService userService;

    @Override
    public void run(String... args) throws Exception {
        User user = userService.selectUserById(1);
        System.out.println(user);
    }
}
