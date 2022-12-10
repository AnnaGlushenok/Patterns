public class BinaryOperations extends Decorator {
    public BinaryOperations(ICalculator calculator) {
        super(calculator);
    }

    public String convertToBinaryNum(int num){
        return Integer.toBinaryString(num);
    }
}
