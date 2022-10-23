import Files.Car;
import Files.JSON;
import Files.Strategy;
import Files.XML;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        Car[] cars = {
                new Car("Mercedes", "E700", 1990),
                new Car("BMW", "i8", 2019),
                new Car("Fiat", "Punto", 2000),
                new Car("Volkswagen", "Turan", 2010),
        };

        String type = "XML";
        strategy.setStrategy(type.equals("JSON") ? new JSON() : new XML());
        strategy.executeWrite(cars);
        Car[] cars1 = strategy.executeRead();
        System.out.println();
        for (Car car : cars1)
            System.out.println(car);
    }
}
