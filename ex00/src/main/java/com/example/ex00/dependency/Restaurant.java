package com.example.ex00.dependency;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
//빠뜨리지 말것
@ToString
@Getter
@RequiredArgsConstructor

public class Restaurant {
    private final Chef chef;
}
