package com.example.interfaces;

public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.print("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.print("Now ringing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.print("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.print("Ring ring");
        } else {

            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
