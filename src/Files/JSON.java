package Files;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSON implements Files {
    public Car[] read() {
        System.out.println("read JSON");
        Car[] cars = null;
        try (FileReader reader = new FileReader("cars.json")) {
            cars = new Gson().fromJson(reader, Car[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public void write(Car[] cars) {
        System.out.println("write JSON");
        try (FileWriter writer = new FileWriter("cars.json")) {
            new Gson().toJson(cars, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
