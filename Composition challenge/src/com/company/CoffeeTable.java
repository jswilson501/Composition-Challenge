package com.company;

public class CoffeeTable {
    private String material;
    private String colour;
    private int legsNumber;
    private Dimensions dimensions;

    public CoffeeTable(String material, String colour, int legsNumber, Dimensions dimensions) {
        this.material = material;
        this.colour = colour;
        this.legsNumber = legsNumber;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
