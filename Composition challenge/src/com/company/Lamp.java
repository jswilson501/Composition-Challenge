package com.company;

public class Lamp {
    private int numberOfBulbs;
    private int lumens;
    private int wattage;
    private int height;

    public Lamp(int numberOfBulbs, int lumens, int wattage, int height) {
        this.numberOfBulbs = numberOfBulbs;
        this.lumens = lumens;
        this.wattage = wattage;
        this.height = height;
    }

    public void lampOn() {
        System.out.println("Lamp switched on, brightness at " + lumens + " lumens");
    }

    public int getNumberOfBulbs() {
        return numberOfBulbs;
    }

    public int getLumens() {
        return lumens;
    }

    public int getWattage() {
        return wattage;
    }

    public int getHeight() {
        return height;
    }
}
