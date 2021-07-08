package com.zhss.springbootdemo.domain;

import lombok.Data;

/**
 * @author liuhao
 */
@Data
public class User {

    public interface Save {}
    public interface Update {}

    private Long id;

    private String name;

    private Integer age;
}
