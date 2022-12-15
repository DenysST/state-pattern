package com.company.states;

import com.company.Product;

public class DeliveredState implements State {
    @Override
    public void getCurrentState() {
        System.out.println("Product is delivered");
    }

    @Override
    public void nextState(Product product) {
        product.setState(new ReceivedState());
    }
}
