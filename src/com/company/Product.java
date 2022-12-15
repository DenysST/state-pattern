package com.company;

import com.company.states.OrderedState;
import com.company.states.State;

public class Product {
    private final String name;
    private State state;

    public Product(String name) {
        this.name = name;
        this.state = new OrderedState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
