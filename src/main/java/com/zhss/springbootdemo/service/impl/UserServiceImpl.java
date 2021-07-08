package com.zhss.springbootdemo.service.impl;

import com.zhss.springbootdemo.dao.UserDAO;
import com.zhss.springbootdemo.domain.User;
import com.zhss.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author liuhao
 * @create 2021/7/8 22:36
 */

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> findUser() {
        return userDAO.findUser();
    }
}
