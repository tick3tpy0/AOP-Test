package com.score.controller;

import com.score.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private TestService service;

    @GetMapping(value = "/noAop")
    public String noAop(){
        return service.test();
    }

    @GetMapping(value = "/aop")
    public String aop(){
        return service.testAop();
    }
}
