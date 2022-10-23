package Files;

public interface Files {
     default Car[] read() {
        return new Car[0];
    }

    default void write(Car[] cars) {

    }

}
