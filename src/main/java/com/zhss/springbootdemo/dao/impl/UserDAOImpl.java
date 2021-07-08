package com.zhss.springbootdemo.dao.impl;

import com.zhss.springbootdemo.dao.UserDAO;
import com.zhss.springbootdemo.domain.User;
import com.zhss.springbootdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }


    @Override
    public void saveUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }
}
