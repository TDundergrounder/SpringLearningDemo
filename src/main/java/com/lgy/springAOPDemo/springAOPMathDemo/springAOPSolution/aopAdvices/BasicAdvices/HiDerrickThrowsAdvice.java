package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices;

import org.springframework.aop.ThrowsAdvice;

public class HiDerrickThrowsAdvice implements ThrowsAdvice {
    public void afterThrowing(IllegalArgumentException e) throws Throwable{
        System.out.println("throw exception here!!!");
    }
}
