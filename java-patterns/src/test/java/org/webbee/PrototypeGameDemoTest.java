package org.webbee;

import org.junit.jupiter.api.Test;
import org.webbee.prototype.GameCharacter;
import org.webbee.prototype.Item;
import org.webbee.prototype.Stats;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест для проверки паттерна Prototype на примере игровых персонажей.
 */
class PrototypeGameDemoTest {

    /**
     * Проверяет, что при клонировании персонажа создаются независимые копии инвентаря и характеристик.
     */
    @Test
    void cloneGameCharacter_independentCopies() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Меч"));
        items.add(new Item("Щит"));

        Stats stats = new Stats(10);
        GameCharacter knight = new GameCharacter("Рыцарь", 1, stats, items);

        GameCharacter npc = knight.clone();
        npc.setName("Стражник");
        npc.getStats().setStrength(7);
        npc.getInventory().add(new Item("Зелье"));

        assertEquals("Рыцарь", knight.getName());
        assertEquals(10, knight.getStats().getStrength());
        assertEquals(2, knight.getInventory().size());
        assertEquals("Меч", knight.getInventory().get(0).getName());

        assertEquals("Стражник", npc.getName());
        assertEquals(7, npc.getStats().getStrength());
        assertEquals(3, npc.getInventory().size());
        assertEquals("Зелье", npc.getInventory().get(2).getName());

        assertNotEquals(knight.getStats().getStrength(), npc.getStats().getStrength());
        assertNotEquals(knight.getInventory().size(), npc.getInventory().size());
    }
}
