package org.webbee.abstract_fabric.factory;

import org.webbee.abstract_fabric.packageImpl.ClothesPackage;
import org.webbee.abstract_fabric.deliveryImpl.PostDelivery;
import org.webbee.abstract_fabric.interfaces.Delivery;
import org.webbee.abstract_fabric.interfaces.Package;
import org.webbee.abstract_fabric.interfaces.ShopFactory;

/**
 * Реализация фабрики для одежды.
 * Создаёт соответствующую упаковку и доставку.
 * @author Evseeva Tsvetolina
 */
public class ClothesFactory implements ShopFactory {

    public Package createPackage() {
        return new ClothesPackage();
    }

    public Delivery createDelivery() {
        return new PostDelivery();
    }

}
