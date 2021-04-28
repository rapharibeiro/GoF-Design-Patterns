package com.patterns.observer.observers;

import com.patterns.observer.data.Inventory;

import java.util.ArrayList;
import java.util.List;

public class CurrentInventoryValueObserver implements Observer {

    List<Inventory> inventories = new ArrayList<>();

    @Override
    public void update(String productName, Float productValue, Integer productUnits) {
        inventories.add(new Inventory(productName, productValue, productUnits));
        System.out.println("Current Inventory Value");
        System.out.println(inventories.stream().mapToDouble(inventory -> inventory.productValue() * inventory.productUnits()).sum());
    }
}
