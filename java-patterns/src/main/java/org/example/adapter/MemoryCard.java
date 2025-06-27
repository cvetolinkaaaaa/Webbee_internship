package org.example.adapter;

/**
 * Класс, представляющий карту памяти.
 * Предоставляет методы для вставки карты и чтения данных с неё.
 * @author Evseeva Tsvetolina
 */

public class MemoryCard {

    /**
     * Вставляет карту памяти.
     */
    public void insert() {
        System.out.println("Карта вставлена");
    }

    /**
     * Считывает данные с карты памяти.
     * @return считанные данные в виде строки
     */
    public void readData() {
        System.out.println("Данные прочитаны");
    }

}
