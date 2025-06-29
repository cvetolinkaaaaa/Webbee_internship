package org.webbee.abstract_fabric.deliveryImpl;

import org.webbee.abstract_fabric.interfaces.Delivery;

/**
 * Реализация доставки курьером.
 * @author Evseeva Tsvetolina
 */
public class CourierDelivery implements Delivery {

    public String deliver() {
        return "Доставка курьером";
    }

}
