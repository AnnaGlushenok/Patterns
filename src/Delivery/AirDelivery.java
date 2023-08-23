package Delivery;

import Enums.AirTypes;

public class AirDelivery extends Delivery {
    private AirTypes type;

    public AirTypes getType() {
        return type;
    }

    public void setType(AirTypes type) {
        this.type = type;
    }

    public AirDelivery() {
        super();
    }
}
