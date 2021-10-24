package com.yw.mapper;

import com.yw.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUser();

    int addUser(User user);

    int deleteUser(User user);

}
