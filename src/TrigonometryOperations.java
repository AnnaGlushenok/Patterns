public class TrigonometryOperations extends Decorator {
    public TrigonometryOperations(ICalculator calculator) {
        super(calculator);
    }

    public double sin(int degree) {
        return Math.sin(degree);
    }

    public double cos(int degree) {
        return Math.cos(degree);
    }

    public double tg(int degree) {
        return Math.tan(degree);
    }

    public double ctg(int degree) {
        return 1 / Math.tan(degree);
    }
}
