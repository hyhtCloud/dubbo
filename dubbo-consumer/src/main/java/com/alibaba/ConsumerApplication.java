package com.alibaba;

import com.alibaba.model.User;
import com.alibaba.service.ConsumerService;
import com.alibaba.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: lqj
 * @Date: 2020/5/29 22:26
 * @Description:
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        ProviderService providerService = (ProviderService) applicationContext.getBean("providerService");
        String name = providerService.getName(1);
        System.out.println(name);
        System.out.println("调用成功....");
        System.in.read();
    }
}
