package org.webbee.observer.interfaces;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(String message);

}
