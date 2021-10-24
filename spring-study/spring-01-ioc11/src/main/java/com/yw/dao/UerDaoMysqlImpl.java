package com.yw.dao;

public class UerDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("Mysql 获取用户数据");
    }
}
