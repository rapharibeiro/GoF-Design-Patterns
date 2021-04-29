package com.pattern.decorator.data.types;

import com.pattern.decorator.data.Guitar;

public class Stratocaster extends Guitar {

    public Stratocaster(String name) {
        this.name = name + ", Stratocaster";
    }

    @Override
    public double price() {
        return 12000;
    }
}
