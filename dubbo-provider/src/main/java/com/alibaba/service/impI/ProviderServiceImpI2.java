package com.alibaba.service.impI;

import com.alibaba.service.ProviderService;

/**
 * @Auther: lqj
 * @Date: 2020/5/28 15:26
 * @Description:
 */
public class ProviderServiceImpI2 implements ProviderService {
    public String getName(int id) {
        System.out.println("version2.0.0");
        if(id == 1){
            return "zhangsan";
        }else {
            return "lisi";
        }

    }



}
