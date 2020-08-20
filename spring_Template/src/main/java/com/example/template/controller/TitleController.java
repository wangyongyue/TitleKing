package com.example.template.controller;

import com.example.template.server.test.Test;
import com.example.template.tool.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.POST)
public class TitleController {

    @Autowired
    Test test;
    @RequestMapping(value = "/title/add")
    public Result add(){

        return  Result.run(test);
    }
    @RequestMapping(value = "/title/update")
    public Result update(){
        return  Result.run(test);
    }
    @RequestMapping(value = "/title/delete")
    public Result delete(){
        return  Result.run(test);
    }
    @RequestMapping(value = "/title/list")
    public Result list(){
        return  Result.run(test);
    }
    

}
