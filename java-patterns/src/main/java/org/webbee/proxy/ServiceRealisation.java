package org.webbee.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс, реализующий метод сервиса.
 * @author Evseeva Tsvetolina
 */

public class ServiceRealisation implements Service {

    private static final Logger LOGGER = LogManager.getLogger(ServiceRealisation.class);

    /**
     * Реализаия отправления сообщения.
     */
    @Override
    public void sendMessage() {
        LOGGER.info("Отправка сообщения");
    }

}
