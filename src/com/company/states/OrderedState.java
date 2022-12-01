package com.company.states;

public class OrderedState implements State {
    @Override
    public void getCurrentState() {
        System.out.println("Product is ordered");
    }
}
