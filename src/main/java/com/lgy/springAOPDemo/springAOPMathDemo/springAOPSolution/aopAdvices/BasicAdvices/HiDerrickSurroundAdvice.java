package com.lgy.springAOPDemo.springAOPMathDemo.springAOPSolution.aopAdvices.BasicAdvices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

public class HiDerrickSurroundAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法名:" + methodInvocation.getMethod().toString());
        System.out.println("参数:" + Arrays.toString(methodInvocation.getArguments()));

        System.out.println("环绕通知之前!!!");

        try {
            Object result = methodInvocation.proceed();

            System.out.println("环绕通知之后!!!");
            System.out.println("返回值："+result);
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("throw exception here!!!");
            throw e;
        }
    }
}
