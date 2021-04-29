package com.pattern.decorator.data.pickups;

import com.pattern.decorator.data.Guitar;

public class Humbucker extends PickupsDecorator {

    private Guitar guitar;

    public Humbucker(Guitar guitar) {
        this.guitar = guitar;
    }

    @Override
    public String name() {
        return guitar.name() + ", Humbucker";
    }

    @Override
    public double price() {
        return guitar.price() + 500;
    }
}
