package com.lms.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/course/")
public class CourseController {

    @GetMapping(value = "/courses")
    public String memberLogin() {
        log.info("courses 요청 받았으면 로그찍어줘...제발ㄹㄹㄹㄹ");
        return "course/courseList";
    }
}
