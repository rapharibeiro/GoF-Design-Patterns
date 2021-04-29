package com.pattern.decorator.data.pickups;

import com.pattern.decorator.data.Guitar;

public class Single extends PickupsDecorator {

    private Guitar guitar;

    public Single(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String name() {
        return guitar.name() + ", Single";
    }

    @Override
    public double price() {
        return guitar.price() + 300;
    }
}
