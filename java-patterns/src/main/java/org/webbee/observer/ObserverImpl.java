package org.webbee.observer;

import org.webbee.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl implements Observer {

    private String name;
    private List<String> receivedMessages = new ArrayList<>();

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        receivedMessages.add(message);
        System.out.println(name + " получил сообщение: " + message);
    }

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

}
