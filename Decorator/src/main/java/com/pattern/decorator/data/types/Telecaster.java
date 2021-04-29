package com.pattern.decorator.data.types;

import com.pattern.decorator.data.Guitar;

public class Telecaster extends Guitar {

    public Telecaster(String name) {
        this.name = name + ", Telecaster";
    }

    @Override
    public double price() {
        return 7900;
    }
}
