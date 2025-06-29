package org.webbee.prototype;

/**
 * Класс Item представляет игровой предмет для персонажа.
 * @author Evseeva Tsvetolina
 */
public class Item implements Cloneable {

    private String name;

    /**
     * Создает новый предмет с указанным именем.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Клонирует предмет.
     */
    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

}
