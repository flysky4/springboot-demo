package com.zhss.springbootdemo.web;

import com.zhss.springbootdemo.domain.User;
import com.zhss.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liuhao
 * @create 2021/7/8 22:33
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findUser",method = RequestMethod.POST)
    public List<User> findUser(){
        return userService.findUser();
    }

}
