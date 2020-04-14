package com.company;

public class Main {

    public static void main(String[] args) {
        Sofa sofa = new Sofa("grey", "fabric", new Dimensions(100, 250, 90), 3);
        Television tv = new Television("Samsung", "4K QLED", 65, new Resolution(3840, 2160), 6);
        CoffeeTable coffeeTable = new CoffeeTable("oak", "brown", 3, new Dimensions(50, 60, 30));
        Lamp lamp = new Lamp(1, 375, 4, 150);

        Room livingRoom = new Room(new Dimensions(2500, 4500, 5500), "grey", 2,
                "white", sofa, tv, coffeeTable, lamp);

        livingRoom.getTelevision().changeChannel(3);

        livingRoom.switchLampOn();

    }


}
