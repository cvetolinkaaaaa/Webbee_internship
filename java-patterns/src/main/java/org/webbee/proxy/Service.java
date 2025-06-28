package org.webbee.proxy;

/**
 * Интерфейс для абстрактного сервиса.
 * Используется в паттерне Proxy для определения операций,
 * которые могут иметь другие реализаии в классах, реализующих данный интерфейс .
 * @author Evseeva Tsvetolina
 */

public interface Service {

    /**
     * Выполняет отправку сообщения.
     */
    void sendMessage();

}
