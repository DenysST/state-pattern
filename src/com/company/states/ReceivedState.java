package com.company.states;

import com.company.Product;

public class ReceivedState implements State {

    @Override
    public void getCurrentState() {
        System.out.println("Product is received");
    }

    @Override
    public void nextState(Product product) {
        System.out.println("Product is already received by client");
    }
}
