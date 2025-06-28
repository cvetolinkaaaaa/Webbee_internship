package org.webbee.adapter;

/**
 * Адаптер, позволяющий использовать {@link MemoryCard} как USB-устройство.
 * Реализует интерфейс {@link USB} и делегирует вызовы методам объекта {@link MemoryCard}.
 * Позволяет подключать карту памяти к устройствам, использующим USB-интерфейс.
 * @author Evseeva Tsvetolina
 */

public class MemoryCardAdapter implements USB {

    private MemoryCard memoryCard;

    /**
     * Конструктор адаптера.
     * @param memoryCard объект карты памяти, который нужно адаптировать к USB-интерфейсу
     */
    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    /**
     * Подключает карту памяти через USB-кабель, используя методы {@link MemoryCard}.
     */
    @Override
    public void connectViaUsb() {
        memoryCard.insert();
        memoryCard.readData();
    }

}
