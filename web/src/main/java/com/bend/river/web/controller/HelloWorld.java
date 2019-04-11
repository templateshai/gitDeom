package com.bend.river.web.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {


    @RequestMapping("/")
    public String helloworld(){
        return "Hello World !";
    }
}
