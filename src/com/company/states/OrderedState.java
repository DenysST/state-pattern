package com.company.states;

import com.company.Product;

public class OrderedState implements State {

    @Override
    public void getCurrentState() {
        System.out.println("Product is ordered");
    }

    @Override
    public void nextState(Product product) {
        product.setState(new DeliveredState());
    }
}
