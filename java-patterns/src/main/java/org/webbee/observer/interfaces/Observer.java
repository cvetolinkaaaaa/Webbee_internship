package org.webbee.observer.interfaces;

/**
 * Интерфейс для наблюдателей, которые хотят получать уведомления.
 * @author Evseeva Tsvetolina
 */
public interface Observer {

    /**
     * Вызывается для оповещения наблюдателя об изменении состояния.
     */
    void update(String message);

}
