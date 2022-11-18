package com.ihjycc.demo.controller;


import com.ihjycc.demo.entity.User;
import com.ihjycc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login(User user){
        return userService.login(user);
    }

    @PostMapping("/register")
    public String register(User user){
        return userService.register(user);
    }

    @RequestMapping(value = "/alluser", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<User> findAll(){
        return userService.findAll();
    }

}
