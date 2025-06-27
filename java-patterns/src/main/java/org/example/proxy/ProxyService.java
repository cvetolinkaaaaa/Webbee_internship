package org.example.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProxyService implements Service {

    private static final Logger LOGGER = LogManager.getLogger(ProxyService.class);
    private ServiceRealisation serviceRealisation;

    @Override
    public void sendMessage() {
        LOGGER.info("Проверка через прокси");
        if (serviceRealisation == null) {
            serviceRealisation = new ServiceRealisation();
        }
        serviceRealisation.sendMessage();
    }

}
