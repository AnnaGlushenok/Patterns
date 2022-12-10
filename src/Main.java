public class Main {
    public static void main(String[] args) {
        Сalculator simpleCalculator = new Сalculator();

        BinaryOperations binCalculator = new BinaryOperations(simpleCalculator);
        TrigonometryOperations trigCalculator = new TrigonometryOperations(simpleCalculator);
    }
}
