package com.pattern.decorator.data;

public abstract class Guitar {

    protected String name;

    public String name() {
        return name;
    }

    public abstract double price();
}
