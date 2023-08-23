import Delivery.DeliveryFactory;
import Delivery.RailwayDelivery;
import Enums.Countries;

public class Main {
    public static void main(String[] args) {
        RailwayDelivery deliveryRussia = (RailwayDelivery) DeliveryFactory.getDeliveryFromFactory(Countries.RUSSIA);
        deliveryRussia.setTrackSize(10);
        deliveryRussia.setHasBallast(true);
        deliveryRussia.setMaxSize(1000);
        deliveryRussia.setCompanyName("innowise");
        deliveryRussia.setMaxCapacity(10000);
    }
}
