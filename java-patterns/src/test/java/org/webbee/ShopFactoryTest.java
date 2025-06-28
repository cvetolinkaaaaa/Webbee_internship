package org.webbee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.webbee.abstract_fabric.factory.ClothesFactory;
import org.webbee.abstract_fabric.factory.ElectronicsFactory;
import org.webbee.abstract_fabric.interfaces.Package;
import org.webbee.abstract_fabric.interfaces.Delivery;
import org.webbee.abstract_fabric.interfaces.ShopFactory;

/**
 * Тесты для фабрики ShopFactory и связанных продуктов.
 */
public class ShopFactoryTest {

    /**
     * Проверяет, что ElectronicsFactory создаёт правильную упаковку и доставку.
     */
    @Test
    public void testElectronicsFactory() {
        ShopFactory factory = new ElectronicsFactory();
        Package pack = factory.createPackage();
        Delivery delivery = factory.createDelivery();

        Assertions.assertEquals("Упаковываем в коробку для электроники", pack.pack());
        Assertions.assertEquals("Доставка курьером", delivery.deliver());
    }

    /**
     * Проверяет, что ClothesFactory создаёт правильную упаковку и доставку.
     */
    @Test
    public void testClothesFactory() {
        ShopFactory factory = new ClothesFactory();
        Package pack = factory.createPackage();
        Delivery delivery = factory.createDelivery();

        Assertions.assertEquals("Упаковываем в пакет для одежды", pack.pack());
        Assertions.assertEquals("Доставка почтой", delivery.deliver());
    }
}
