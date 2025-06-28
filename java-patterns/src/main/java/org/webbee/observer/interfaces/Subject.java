package org.webbee.observer.interfaces;

/**
 * Интерфейс субъекта, за которым могут наблюдать наблюдатели.
 * @author Evseeva Tsvetolina
 */
public interface Subject {

    /**
     * Подписать наблюдателя на оповещения.
     */
    void attach(Observer observer);

    /**
     * Отписать наблюдателя от оповещений.
     */
    void detach(Observer observer);

    /**
     * Уведомить всех подписанных наблюдателей.
     */
    void notifyObservers(String message);

}
