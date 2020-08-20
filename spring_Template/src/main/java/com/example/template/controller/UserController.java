package com.example.template.controller;

import com.example.template.server.test.Test;
import com.example.template.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.POST)
public class UserController {

    @Autowired
    Test test;
    @RequestMapping(value = "/user/login")
    public Result login(){
        return  Result.run(test);
    }

    @RequestMapping(value = "/user/loginOut")
    public Result loginOut(){
        return  Result.run(test);
    }
    @RequestMapping(value = "/user/register")
    public Result register(){
        return  Result.run(test);
    }
    @RequestMapping(value = "/user/sendCode")
    public Result sendCode(){
        return  Result.run(test);
    }
    @RequestMapping(value = "/user/info")
    public Result info(){
        return  Result.run(test);
    }

}
