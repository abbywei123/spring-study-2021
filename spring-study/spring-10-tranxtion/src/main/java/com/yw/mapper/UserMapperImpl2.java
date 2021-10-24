package com.yw.mapper;

import com.yw.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> queryUser() {
        User user=new User(4,"小华","3456789");
        User user5=new User(5,"小艾","3456789");

        UserMapper userMapper=getSqlSession().getMapper(UserMapper.class);
        userMapper.addUser(user);
        userMapper.deleteUser(user5);
        return getSqlSession().getMapper(UserMapper.class).queryUser();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(user);
    }
}
