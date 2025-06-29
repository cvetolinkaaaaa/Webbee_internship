package org.webbee.prototype;

/**
 * Класс Stats содержит характеристики игрового персонажа.
 * @author Evseeva Tsvetolina
 */
public class Stats implements Cloneable {

    private int strength;
    public Stats(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Клонирует объект, содержащий характеристики.
     */
    @Override
    public Stats clone() {
        try {
            return (Stats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "[S:" + strength + "]";
    }

}
