package com.patterns.observer.observers;

import com.patterns.observer.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
