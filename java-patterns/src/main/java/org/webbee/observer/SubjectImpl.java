package org.webbee.observer;

import org.webbee.observer.interfaces.Observer;
import org.webbee.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация субъекта. Хранит список наблюдателей и уведомляет их об изменениях.
 * @author Evseeva Tsvetolina
 */
public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * Подписывает наблюдателя на оповещения.
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Отписывает наблюдателя от оповещений.
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Уведомляет всех подписанных наблюдателей, передавая им сообщение.
     */
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    /**
     * Демонстрационный метод для изменения состояния субъекта.
     */
    public void changeState(String message) {
        notifyObservers(message);
    }

}
