package com.lgy.springAnnotationDemo;

public class Tiger implements Animals{
    private String eyeColor;

    private int mouthSize;

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getMouthSize() {
        return mouthSize;
    }

    public void setMouthSize(int mouthSize) {
        this.mouthSize = mouthSize;
    }

    @Override
    public String getAnimalName() {
        return "tiger";
    }
}
