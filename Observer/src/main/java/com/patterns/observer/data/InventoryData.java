package com.patterns.observer.data;

import com.patterns.observer.observers.Subject;
import com.patterns.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class InventoryData implements Subject {

    private Inventory inventory;
    private List<Observer> observers;

    public InventoryData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(inventory.productName(), inventory.productValue(), inventory.productUnits());
        }
    }

    public void dataChanged(String productName, Float productValue, Integer productUnits) {
        inventory = new Inventory(productName, productValue, productUnits);
        notifyObservers();
    }
}
