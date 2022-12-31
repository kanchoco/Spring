package com.example.ex02.controller;

import com.example.ex02.domain.vo.TaskVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/exam/*")
public class ExamController {
    @GetMapping("/exam")
    public String exam(){
        return "exam/exam";
    }

    @PostMapping("/exam")
    public String exam(TaskVO taskVO){
        return "exam/result";
    }
}
