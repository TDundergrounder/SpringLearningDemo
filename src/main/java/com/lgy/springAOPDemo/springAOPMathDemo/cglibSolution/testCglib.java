package com.lgy.springAOPDemo.springAOPMathDemo.cglibSolution;

import org.testng.annotations.Test;

public class testCglib {
    Math math = (Math) new DynamicProxy().getProxyObject(new Math());

    @Test
    public void testMath(){
        int a=64,b=8;
        math.add(a,b);
        math.sub(a,b);
        math.mul(a,b);
        math.div(a,b);
    }
}
