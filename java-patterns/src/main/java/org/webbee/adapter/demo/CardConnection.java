package org.webbee.adapter.demo;

import org.webbee.adapter.MemoryCard;
import org.webbee.adapter.MemoryCardAdapter;
import org.webbee.adapter.USB;

/**
 * Класс для демонстрации работы паттерна "Адаптер".
 * Создает карту памяти, адаптер и показывает, как с помощью адаптера можно использовать
 * {@link MemoryCard} через интерфейс {@link USB}.
 * @author Evseeva Tsvetolina
 */

public final class CardConnection {

    private CardConnection() {
    }

    public static void main(String[] args) {
        MemoryCardAdapter memoryCardAdapter =
                new MemoryCardAdapter(new MemoryCard());
        memoryCardAdapter.connectViaUsb();
    }

}
