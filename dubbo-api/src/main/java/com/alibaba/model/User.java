package com.alibaba.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: lqj
 * @Date: 2020/5/29 09:44
 * @Description:
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private int age;

    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
}
