package com.zhss.springbootdemo.dao;

import com.zhss.springbootdemo.domain.User;

import java.util.List;

/**
 * @author liuhao
 */
public interface UserDAO {

    /**
     * 查询用户
     * @param
     * @return
     */
    List<User> findUser();

    User findUserById(Long id);

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
