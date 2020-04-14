package com.company;

public class Television {
    private String make;
    private String model;
    private int size;
    private Resolution nativeResolution;
    private int channel;

    public Television(String make, String model, int size, Resolution nativeResolution, int channel) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
        this.channel = channel;
    }

    public void powerOn() {
        System.out.println("Powering on..." + make + " " + model);
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to " + newChannel);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public int getChannel() {
        return channel;
    }
}
