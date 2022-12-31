package com.example.ex02.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserVO {
    private String userId;
    private String userPw;
}
