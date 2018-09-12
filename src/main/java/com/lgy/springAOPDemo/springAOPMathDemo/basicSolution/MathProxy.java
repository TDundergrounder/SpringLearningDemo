package com.lgy.springAOPDemo.springAOPMathDemo.basicSolution;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MathProxy implements IMath{
    IMath math = new Math();


    public int add(int a, int b) {
        long start = System.currentTimeMillis();
        lazy();
        int res = math.add(a,b);
        long end = System.currentTimeMillis();
        System.out.println("cost time  :"+(end-start)+"ms");
        return res;
    }

    public int sub(int a, int b) {
        long start = System.currentTimeMillis();
        lazy();
        int res = math.sub(a,b);
        long end = System.currentTimeMillis();
        System.out.println("cost time  :"+(end-start)+"ms");
        return res;
    }

    public int mul(int a, int b) {
        long start = System.currentTimeMillis();
        lazy();
        int res = math.mul(a,b);
        long end = System.currentTimeMillis();
        System.out.println("cost time  :"+(end-start)+"ms");
        return res;
    }

    public int div(int a, int b) {
        long start = System.currentTimeMillis();
        lazy();
        int res = math.div(a,b);
        long end = System.currentTimeMillis();
        System.out.println("cost time  :"+(end-start)+"ms");
        return res;
    }

    public void lazy(){
        int time = new Random().nextInt(500);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
