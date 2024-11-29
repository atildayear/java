package com.chap06.sub01;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

//계산 기능을 제공하는 클래스
public class Calculator {
    //합계 계산하는 메서드
    double sum(List<BigDecimal>numbers){
        BigDecimal sum = BigDecimal.ZERO; // 합계를 저장할 변수를 초기화
        for (BigDecimal num:numbers){
            sum = sum.add(num);
        }
        return sum.doubleValue(); // double 타입으로 변환하여 변환
    }
}
