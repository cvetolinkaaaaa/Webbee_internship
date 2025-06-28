package org.webbee.proxy.demo;

import org.webbee.proxy.ProxyService;
import org.webbee.proxy.Service;

public final class MessengerExample {

    private MessengerExample() {
    }

    public static void main(String[] args) {
        Service service = new ProxyService();
        service.sendMessage();
    }

}
