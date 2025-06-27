package org.example.proxy;

public final class MessengerExample {

    private MessengerExample() {
    }

    public static void main(String[] args) {
        Service service = new ProxyService();
        service.sendMessage();
    }

}
