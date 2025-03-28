package com.spring.letsplan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/mypage-main")
    public String mypageMain() {
        return "/user/mypage-main";
    }

    @GetMapping("/login")
    public String login() {
        return "/user/mypage-main";
    }

    @GetMapping("/register")
    public String register() {
        return "/user/register";
    }
}
