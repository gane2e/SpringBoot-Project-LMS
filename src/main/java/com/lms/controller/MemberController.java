package com.lms.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/members/")
public class MemberController {

    @GetMapping(value = "/login")
    public String memberLogin() {
        log.info("요청 받았으면 로그찍어줘...제발ㄹㄹㄹㄹ");
        return "member/memberLoginForm";
    }

    //로그인실패시 Get요청으로 실패메시지 전달
    @GetMapping(value = "/login/error")
    public String loginError(Model model){
        model.addAttribute("loginErrorMsg", "아이디 또는 비밀번호를 확인해 주십시오.");
        return "member/memberLoginForm";
    }

}
