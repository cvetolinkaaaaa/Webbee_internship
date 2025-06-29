package org.webbee.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс GameCharacter реализует прототип игрового персонажа.
 * @author Evseeva Tsvetolina
 */
public class GameCharacter implements Cloneable {

    private String name;
    private int level;
    private List<Item> inventory;
    private Stats stats;

    public GameCharacter(String name, int level, Stats stats, List<Item> inventory) {
        this.name = name;
        this.level = level;
        this.stats = stats;
        this.inventory = inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public Stats getStats() {
        return stats;
    }

    public String getName() {
        return name;
    }

    /**
     * Клонирует персонажа.
     */
    @Override
    public GameCharacter clone() {
        try {
            GameCharacter clone = (GameCharacter) super.clone();
            List<Item> clonedInventory = new ArrayList<>();
            for (Item item : this.inventory) {
                clonedInventory.add(item.clone());
            }
            clone.inventory = clonedInventory;
            clone.stats = this.stats.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return name + " (lvl " + level + ") " + stats + ", инвентарь: " + inventory;
    }

}
