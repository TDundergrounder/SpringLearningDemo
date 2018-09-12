package com.lgy.springAOPDemo.springAOPTalkDemo.aopMethods;

import org.springframework.aop.ThrowsAdvice;

public class HiDerrickThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable{
        System.out.println("throw exception here!!!");
    }
}
