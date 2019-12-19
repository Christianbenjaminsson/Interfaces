package com.example.interfaces;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(String inOurOut) {
        this.clutchIsIn = inOurOut.equalsIgnoreCase("in");
    }
}
