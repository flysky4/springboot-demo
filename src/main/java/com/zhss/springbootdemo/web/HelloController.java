package com.zhss.springbootdemo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 86557
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String hello (@PathVariable("name") String name){
        return "hello" + name;
    }

}
