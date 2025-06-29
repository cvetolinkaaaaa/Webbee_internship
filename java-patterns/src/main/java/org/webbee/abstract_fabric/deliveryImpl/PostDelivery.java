package org.webbee.abstract_fabric.deliveryImpl;

import org.webbee.abstract_fabric.interfaces.Delivery;

/**
 * Реализация доставки почтой.
 * @author Evseeva Tsvetolina
 */
public class PostDelivery implements Delivery {

    public String deliver() {
        return "Доставка почтой";
    }

}
