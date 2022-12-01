package com.company.states;

public class ReceivedState implements State {
    @Override
    public void getCurrentState() {
        System.out.println("Product is received");
    }
}
