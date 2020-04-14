package com.company;

public class Sofa {
    private String colour;
    private String material;
    private Dimensions dimensions;
    private int seater;

    public Sofa(String colour, String material, Dimensions dimensions, int seater) {
        this.colour = colour;
        this.material = material;
        this.dimensions = dimensions;
        this.seater = seater;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getSeater() {
        return seater;
    }
}
