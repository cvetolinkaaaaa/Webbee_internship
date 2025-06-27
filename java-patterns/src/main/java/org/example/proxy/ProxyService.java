package org.example.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Класс ProxyService реализует паттерн Proxy.
 */

public class ProxyService implements Service {

    private static final Logger LOGGER = LogManager.getLogger(ProxyService.class);

    /**
     * Ссылка на реальную реализацию сервиса.
     */
    private ServiceRealisation serviceRealisation;

    /**
     * При первичном вызове метода инициализируется сервис,
     * при последующих вызовах метода новый объект не будет инициализироваться.
     */
    @Override
    public void sendMessage() {
        LOGGER.info("Проверка через прокси");
        if (serviceRealisation == null) {
            serviceRealisation = new ServiceRealisation();
        }
        serviceRealisation.sendMessage();
    }

}
