package com.zhss.springbootdemo.mapper;

import com.zhss.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liuhao
 * @create 2021/7/8 22:25
 */

@Mapper
public interface UserMapper {

    /**
     *
     * @return
     * @Result 当数据库名称与实体类对应的名称不一致时,可以使用@Result来进行对应
     *         若名称已一致,则可以不使用
     */
    @Select("select * from user")
    @Results({
            @Result(property = "id",column = "id",id = true),
            @Result(property = "name",column = "name"),
            @Result(property = "age",column = "age")
    })
    List<User> findUser();



}
