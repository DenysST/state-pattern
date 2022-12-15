package com.company;

public class Main {

    public static void main(String[] args) {
        Product phone = new Product("iPhone");
        phone.getState().getCurrentState();

        phone.getState().nextState(phone);
        phone.getState().getCurrentState();

        phone.getState().nextState(phone);
        phone.getState().getCurrentState();
    }
}
