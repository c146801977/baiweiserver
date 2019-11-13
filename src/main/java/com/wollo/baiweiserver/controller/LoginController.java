package com.wollo.baiweiserver.controller;

import com.wollo.baiweiserver.pojo.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login_p")
    public RespBean login(){
        return RespBean.error("尚未登录，请登录！");
    }
}
