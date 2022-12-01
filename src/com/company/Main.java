package com.company;

import com.company.states.DeliveredState;
import com.company.states.ReceivedState;
import com.company.states.State;

public class Main {

    public static void main(String[] args) {
        State delivered = new DeliveredState();
        State received = new ReceivedState();
        Product phone = new Product("iPhone");
        phone.getState().getCurrentState();

        phone.setState(delivered);
        phone.getState().getCurrentState();

        phone.setState(received);
        phone.getState().getCurrentState();
    }
}
