package org.example.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceRealisation implements Service {

    private static final Logger LOGGER = LogManager.getLogger(ServiceRealisation.class);

    @Override
    public void sendMessage() {
        LOGGER.info("Отправка сообщения");
    }

}
