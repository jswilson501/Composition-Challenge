package com.company;

public class Room {
    private Dimensions dimensions;
    private String wallColour;
    private int numberOfWindows;
    private String doorColour;
    private Sofa sofa;
    private Television television;
    private CoffeeTable coffeeTable;
    private Lamp lamp;

    public Room(Dimensions dimensions, String wallColour, int numberOfWindows, String doorColour, Sofa sofa, Television television, CoffeeTable coffeeTable, Lamp lamp) {
        this.dimensions = dimensions;
        this.wallColour = wallColour;
        this.numberOfWindows = numberOfWindows;
        this.doorColour = doorColour;
        this.sofa = sofa;
        this.television = television;
        this.coffeeTable = coffeeTable;
        this.lamp = lamp;
    }

    public void switchLampOn() {
        getLamp().lampOn();
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getWallColour() {
        return wallColour;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public String getDoorColour() {
        return doorColour;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Television getTelevision() {
        return television;
    }

    private CoffeeTable getCoffeeTable() {
        return coffeeTable;
    }

    private Lamp getLamp() {
        return lamp;
    }
}
