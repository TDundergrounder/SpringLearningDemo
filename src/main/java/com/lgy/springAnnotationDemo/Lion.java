package com.lgy.springAnnotationDemo;

import javax.annotation.PostConstruct;

public class Lion implements Animals{
    private String eyeColor;

    private int mouthSize;

    public int getMouthSize() {
        return mouthSize;
    }

    public void setMouthSize(int mouthSize) {
        this.mouthSize = mouthSize;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String getAnimalName() {
        return "lion";
    }

    @PostConstruct
    public void initBean(){
        System.out.println("start init bean ..."+eyeColor+" and "+mouthSize);
    }
}


