package com.example.ex00.dependency;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Data   --> 기본생성자가 자동으로 생성되므로,  확인이 불가
@Getter
//세터는 필요에따라 사용
//@Setter

//일반 객체, (빈 객체로 등록)
@Component

//기본생성자
//@NoArgsConstructor

//전체초기화
//@AllArgsConstructor

//필요한 경우만 초기화 -> nonnull이 붙은 경우만 초기화, 알아서 Autowired
@RequiredArgsConstructor


public class Coding {
    //필드 주입 - 단위테스트에서만 사용       "지양"
//    굉장히 편하게 주입할 수 있으나 순환 참조시 오류가 발생하지 않기 때문에 StackOverflow 발생
//    final을 붙일 수 없기 때문에 다른 곳에서 변형 가능
    //  주입(주소값)
//    @Autowired
    private final Computer computer;
//    --> 의존할 경우만 final을 붙인다.-> 주입의 필요가 있으므로

//    생성자 주입(순환 참조) -> 필드에 final붙이기 가능  "지향"
//    순환 참조 시 컴파일러 인지 가능, 오류 발생
//    메모리에 할당되면서 초기값으로 주입되므로 final 키워드 사용 가능. 다른 곳에서 변경 불가능
//    의존성 주입이 되지 않으면 객체가 생성되지 않으므로 NPE방어
//    @Autowired  //생략가능, 컴파일러가 인지해서 알아서 주입함
//    public Coding(Computer computer){
//        this.computer = computer;
//    }         --> @RequiredArgsConstructor에서 알아서 생성하기 때문에, 이조차도 직접 선언하지 않아도 된다.
}












