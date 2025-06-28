package org.webbee.abstract_fabric.deliveryImpl;

import org.webbee.abstract_fabric.interfaces.Delivery;

public class CourierDelivery implements Delivery {

    public String deliver() {
        return "Доставка курьером";
    }

}
