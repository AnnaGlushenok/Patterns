package Delivery;

import Enums.WaterTypes;

public class WaterDelivery extends Delivery {
    private WaterTypes type;

    public WaterTypes getType() {
        return type;
    }

    public void setType(WaterTypes type) {
        this.type = type;
    }

    public WaterDelivery() {
        super();
    }
}
