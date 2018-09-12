package com.lgy.springAOPDemo.springAOPMathDemo.basicSolution;

import org.testng.annotations.Test;

public class testApp {

    IMath math = new MathProxy();

    @Test
    public void testMath(){
        int a = 1629 ,b = 36;
        math.add(a,b);
        math.sub(a,b);
        math.mul(a,b);
        math.div(a,b);
    }
}
