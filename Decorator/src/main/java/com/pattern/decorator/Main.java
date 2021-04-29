package com.pattern.decorator;

import com.pattern.decorator.data.Guitar;
import com.pattern.decorator.data.pickups.Humbucker;
import com.pattern.decorator.data.pickups.Single;
import com.pattern.decorator.data.types.LesPaul;
import com.pattern.decorator.data.types.Stratocaster;
import com.pattern.decorator.data.types.Telecaster;

public class Main {

    public static void main(String[] args) {

        Guitar fender = new Stratocaster("Fender Deluxe");
        fender = new Single(fender);
        fender = new Humbucker(fender);

        Guitar gibson = new LesPaul("Explorer");
        gibson = new Humbucker(gibson);

        Guitar tagima = new Telecaster("SX");
        tagima = new Single(tagima);

        System.out.println("Display Guitars");
        System.out.println(fender.name() + " Price: " + fender.price());
        System.out.println(gibson.name() + " Price: " + gibson.price());
        System.out.println(tagima.name() + " Price: " + tagima.price());

    }
}
