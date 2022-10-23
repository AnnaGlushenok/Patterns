package Files;


public class Strategy {
    private Files strategy;

    public void setStrategy(Files strategy) {
        this.strategy = strategy;
    }

    public Car[] executeRead() {
        return strategy.read();
    }

    public void executeWrite(Car[] cars) {
        strategy.write(cars);
    }
}
