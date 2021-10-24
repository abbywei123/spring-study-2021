package com.yw.mapper;

import com.yw.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> queryUser() {
        UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
        return userMapper.queryUser();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }
}
