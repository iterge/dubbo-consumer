package com.iterge.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.entity.User;
import dubbo.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/4/7.
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/getUser/{name}")
    public User getUser(@PathVariable("name") String name){
        User user = new User();
        user.setName(name);
        return userService.getUser(user);
    }
    //@GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。
    @GetMapping("/getStr")
    public String getStr(){
        return userService.getStr();
    }
    @RequestMapping("/getHello")
    public String getHello(){
        return userService.getStr();
    }
}

