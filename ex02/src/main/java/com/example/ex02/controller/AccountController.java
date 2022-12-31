package com.example.ex02.controller;

import com.example.ex02.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/account/*")
public class AccountController {
    @GetMapping("/login")
    public String login(){
        return "account/login";
    }

    @PostMapping("/account")
    public String account(UserVO userVO){
        String result;
        log.info(userVO.getUserId());
        if(userVO.getUserId().equals("user")){
            result = "account/user";
        }else{
            result = "account/admin";
        }
        log.info(result);
        return result;
    }
}
