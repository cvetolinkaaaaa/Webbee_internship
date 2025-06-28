package org.webbee.abstract_fabric.interfaces;

/**
 * Абстрактная фабрика для создания упаковки и доставки товара.
 * @author Evseeva Tsvetolina
 */
public interface ShopFactory {

    /**
     * Создаёт упаковку для товара.
     */
    Package createPackage();

    /**
     * Создаёт способ доставки товара.
     */
    Delivery createDelivery();

}
