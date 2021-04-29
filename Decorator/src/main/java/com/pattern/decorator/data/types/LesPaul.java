package com.pattern.decorator.data.types;

import com.pattern.decorator.data.Guitar;

public class LesPaul extends Guitar {

    public LesPaul(String name) {
        this.name = name + ", LesPaul";
    }

    @Override
    public double price() {
        return 9999;
    }
}
