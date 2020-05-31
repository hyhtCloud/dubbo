package com.alibaba.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.model.User;
import com.alibaba.service.ConsumerService;
import com.alibaba.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: lqj
 * @Date: 2020/5/29 22:17
 * @Description:
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    ProviderService providerService;

    public String sayHello(int userId) {
        String name = providerService.getName(userId);
        return "你好，" + name;
    }
}
