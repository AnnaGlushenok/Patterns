import Files.Car;
import Files.JSON;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Mercedes", "E700", 1990),
                new Car("BMW", "i8", 2019),
                new Car("Fiat", "Punto", 2000),
                new Car("Volkswagen", "Turan", 2010),
        };
        Car car = new Car("Mercedes", "E700", 1990);

        JSON.write(cars);
        JSON.read();
    }
}
