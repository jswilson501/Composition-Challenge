package com.company;

public class Resolution {
    private int widthPixels;
    private int heightPixels;

    public Resolution(int widthPixels, int heightPixels) {
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
    }

    public int getWidthPixels() {
        return widthPixels;
    }

    public int getHeightPixels() {
        return heightPixels;
    }
}
