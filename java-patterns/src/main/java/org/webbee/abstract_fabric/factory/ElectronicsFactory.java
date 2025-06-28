package org.webbee.abstract_fabric.factory;

import org.webbee.abstract_fabric.deliveryImpl.CourierDelivery;
import org.webbee.abstract_fabric.packageImpl.ElectronicsPackage;
import org.webbee.abstract_fabric.interfaces.Delivery;
import org.webbee.abstract_fabric.interfaces.Package;
import org.webbee.abstract_fabric.interfaces.ShopFactory;

/**
 * Конкретная реализация фабрики для электроники.
 * Создаёт соответствующую упаковку и доставку.
 * @author Evseeva Tsvetolina
 */
public class ElectronicsFactory implements ShopFactory {

    public Package createPackage() {
        return new ElectronicsPackage();
    }

    public Delivery createDelivery() {
        return new CourierDelivery();
    }

}
