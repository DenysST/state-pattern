package com.company.states;

public class DeliveredState implements State{
    @Override
    public void getCurrentState() {
        System.out.println("Product is delivered");
    }
}
