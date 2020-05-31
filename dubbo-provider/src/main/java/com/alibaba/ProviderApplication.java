package com.alibaba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Auther: lqj
 * @Date: 2020/5/28 22:08
 * @Description:
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.out.println("provider.....");
        System.in.read();
    }
}
