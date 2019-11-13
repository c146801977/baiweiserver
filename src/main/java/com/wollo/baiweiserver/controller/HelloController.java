package com.wollo.baiweiserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/employee/basic/hello")
    public String basic(){
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String advanced(){
        return "/employee/advanced/hello";
    }
}
