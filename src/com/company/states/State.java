package com.company.states;

import com.company.Product;

public interface State {
    void getCurrentState();
    void nextState(Product product);
}
