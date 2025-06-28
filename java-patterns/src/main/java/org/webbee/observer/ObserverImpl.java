package org.webbee.observer;

import org.webbee.observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретная реализация наблюдателя.
 * Хранит полученные сообщения.
 * @author Evseeva Tsvetolina
 */
public class ObserverImpl implements Observer {

    private String name;
    private List<String> receivedMessages = new ArrayList<>();

    /**
     * Создаёт наблюдателя с указанным именем.
     */
    public ObserverImpl(String name) {
        this.name = name;
    }

    /**
     * Обрабатывает входящее уведомление от субъекта.
     * Сохраняет полученное сообщение.
     */
    @Override
    public void update(String message) {
        receivedMessages.add(message);
        System.out.println(name + " получил сообщение: " + message);
    }

    /**
     * Возвращает список всех полученных сообщений.
     */
    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

}
