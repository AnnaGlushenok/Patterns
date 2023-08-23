package Delivery;

import Enums.Countries;

public class DeliveryFactory {
    private enum DeliveryKind {
        RUSSIA {
            RailwayDelivery createDelivery() {
                return new RailwayDelivery();
            }
        },
        USA {
            WaterDelivery createDelivery() {
                return new WaterDelivery();
            }
        },
        BELARUS {
            MotorDelivery createDelivery() {
                return new MotorDelivery();
            }
        },
        GERMANY {
            AirDelivery createDelivery() {
                return new AirDelivery();
            }
        };

        abstract Delivery createDelivery();
    }

    public static Delivery getDeliveryFromFactory(Countries country) {
        return DeliveryKind.valueOf(country.name()).createDelivery();
    }
}
