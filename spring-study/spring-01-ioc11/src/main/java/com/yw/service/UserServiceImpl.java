package com.yw.service;

import com.yw.dao.UserDao;
import com.yw.dao.UserDaoImpl;
import com.yw.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set进行动态实现值得注入
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
