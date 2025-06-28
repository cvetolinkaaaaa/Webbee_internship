package org.webbee.abstract_fabric.deliveryImpl;

import org.webbee.abstract_fabric.interfaces.Delivery;

public class PostDelivery implements Delivery {

    public String deliver() {
        return "Доставка почтой";
    }

}
