package com.spring.letsplan.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/mypage-main")
    public String mypageMain() {
        return "/user/mypage-main";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @PostMapping("/login")
    public void loginPost() {

    }

    // 회원가입 페이지
    @GetMapping("/signup")
    public String register() {
        return "/user/signup";
    }

    // 아이디 찾기
    @GetMapping("/findId")
    public String findId() {
        return null;
    }

    // 비밀번호 찾기
    @GetMapping("/chngPwd")
    public String chngPwd() {
        return null;
    }


}
