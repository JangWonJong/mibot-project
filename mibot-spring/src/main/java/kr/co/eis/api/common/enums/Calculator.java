package kr.co.eis.api.common.enums;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

/**
 * packageName: kr.co.eis.api.common.enums
 * fileName   : Calculator
 * author     : Jangwonjong
 * date       : 2022-05-13
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-05-13     Jangwonjong       최초 생성
 */
public class Calculator {

    @RequiredArgsConstructor
    enum Operation{
        PLUS("+", (x,y)->(x + y)),
        MINUS("-", (x,y)->(x - y)),
        MULTI("*", (x,y)->(x * y)),
        DIVIDE("/", (x,y)->(x / y))
        ;
        private final String opcode;
        private final BiFunction<Integer,Integer,Integer> f;

        @Override public String toString() { return opcode;}
        public int apply(int a, int b){return f.apply(a,b);}
    }
    @Test
    void calculatorTest(){
        System.out.println("+: "+Operation.PLUS.apply(10,5));
        System.out.println("-: "+Operation.MINUS.apply(10,5));
        System.out.println("*: "+Operation.MULTI.apply(10,5));
        System.out.println("/: "+Operation.DIVIDE.apply(10,5));
    }
}
