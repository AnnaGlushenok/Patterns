public class Decorator implements ICalculator {
    private ICalculator calculator;

    public Decorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int sum(int a, int b) {
        return calculator.sum(a, b);
    }

    @Override
    public int sub(int a, int b) {
        return calculator.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return calculator.mul(a, b);
    }

    @Override
    public int div(int a, int b) {
        return calculator.div(a, b);
    }
}
