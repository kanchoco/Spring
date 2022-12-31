package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DependencyTest {
    @Autowired
    private Coding coding;
    @Autowired
    private Chef chef;
    @Autowired
    private Restaurant restaurant;

//    실행여부를 밝힘
    @Test
    public void dependencyTest(){
//        최근 버전에서는 NPE를 막기 위해서 문자열화해서 사용하기로 패치됨
//        에러문이 길 때는 맨 마지막줄 확인
        log.info(coding + "");
//        log.warn();
//        log.error();
        log.info( restaurant+ "");
    }
}
