package com.example.ex02.controller;

import com.example.ex02.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/product/*")
public class ProductController {
//    외부에서 상품명, 상품가격, 상품재고, 브랜드 전달받아서 화면에 전송
//    화면에서 4개 정보 입력 후 form태그로 전송한다.
    @RequestMapping(value = "task01")
    public String task01(){
        return "/product/task01";
    }
    @RequestMapping(value = "result01")
    public String result01(ProductVO productVO){
        log.info("result01,,......");
        log.info("prductVO: " + productVO);
        return "/product/result01";
    }
//    [실습 2]
//    TaskVO 선언
//    int num, int kor, int eng, int math


}
