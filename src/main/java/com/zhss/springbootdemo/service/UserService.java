package com.zhss.springbootdemo.service;

import com.zhss.springbootdemo.domain.User;

import java.util.List;

/**
 * @author liuhao
 * @create 2021/7/8 22:35
 */

public interface UserService {

    List<User> findUser();
}
