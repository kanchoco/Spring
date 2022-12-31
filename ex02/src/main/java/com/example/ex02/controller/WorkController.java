package com.example.ex02.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Calendar;

@Controller
@Slf4j
@RequestMapping("/work/*")

public class WorkController {
    @GetMapping("checkIn")
    public String checkIn(){return "work/checkIn";}

    @GetMapping("getToWork")
    public String getToWork(@ModelAttribute("name") String name){
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);

        boolean lateCondition1 = hour > 9 && minute >= 0;
        boolean lateCondition2 = hour == 9  && minute > 0;

        if(lateCondition1 || lateCondition2){
            return "work/late";
        }
        return "work/getToWork";
    }

    @GetMapping("leaveWork")
    public String leaveWork(@ModelAttribute("name") String name){
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);

        boolean leaveWorkCondition = hour >= 17 && minute >= 0;

        if(leaveWorkCondition){
            return "work/leaveWork";
        }
        return "work/work";
    }

}
