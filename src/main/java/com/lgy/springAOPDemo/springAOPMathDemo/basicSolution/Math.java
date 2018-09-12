package com.lgy.springAOPDemo.springAOPMathDemo.basicSolution;

import static java.lang.Thread.sleep;

public class Math implements IMath {
    public int add(int a, int b) {
        int result = a+b;
        System.out.println(a+"+"+b+"="+result);
        return result;
    }

    public int sub(int a, int b) {
        int result = a-b;
        System.out.println(a+"-"+b+"="+result);
        return result;
    }

    public int mul(int a, int b) {
        int result = a*b;
        System.out.println(a+"x"+b+"="+result);
        return result;
    }

    public int div(int a, int b) {
        int result = a/b;
        System.out.println(a+"/"+b+"="+result );
        return result;
    }
}
