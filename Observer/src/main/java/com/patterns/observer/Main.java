package com.patterns.observer;

import com.patterns.observer.data.InventoryData;
import com.patterns.observer.observers.CurrentInventoryValueObserver;
import com.patterns.observer.observers.HistoricalInventoryObserver;

public class Main {

    public static void main(String args[]) {

        InventoryData inventoryData = new InventoryData();

        HistoricalInventoryObserver historicalInventoryObserver = new HistoricalInventoryObserver();
        CurrentInventoryValueObserver currentInventoryValueObserver = new CurrentInventoryValueObserver();

        inventoryData.registerObserver(historicalInventoryObserver);
        inventoryData.registerObserver(currentInventoryValueObserver);

        inventoryData.dataChanged("Edifier Monitor", 499.99f, 1);
        inventoryData.dataChanged("Keyboard Cougar", 259.99f, 2);
        inventoryData.dataChanged("Samsung Printer", 191.99f, 1);

        inventoryData.unregisterObserver(currentInventoryValueObserver);

        inventoryData.dataChanged("Logitech mouse", 149.99f, 2);

        inventoryData.registerObserver(currentInventoryValueObserver);

        inventoryData.dataChanged("Webcam Red Dragon", 99.99f, 3);
    }
}
