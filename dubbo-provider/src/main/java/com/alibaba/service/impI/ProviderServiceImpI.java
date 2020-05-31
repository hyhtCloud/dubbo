package com.alibaba.service.impI;

import com.alibaba.model.User;
import com.alibaba.service.ProviderService;

/**
 * @Auther: lqj
 * @Date: 2020/5/28 15:26
 * @Description:
 */
public class ProviderServiceImpI implements ProviderService {
    public String getName(int id) {
        System.out.println("version1.0.0");
        if(id == 1){
            return "张三";
        }else {
            return "李四";
        }

    }



}
