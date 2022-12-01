package com.company;

import com.company.states.OrderedState;
import com.company.states.State;

public class Product {
    private String name;
    private State state = new OrderedState();

    public Product(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
