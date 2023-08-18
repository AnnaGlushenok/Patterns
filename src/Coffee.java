public class Coffee {
    private final int countCoffee;
    private final int countDoubleCoffee;
    private final int countMilk;
    private final boolean isCream;
    private final boolean isSugar;
    private final boolean isCinnamon;
    private final boolean isSyrup;

    public Coffee(int countCoffee, int countDoubleCoffee, int countMilk, boolean isCream, boolean isSugar, boolean isCinnamon, boolean isSyrup) {
        this.countCoffee = countCoffee;
        this.countDoubleCoffee = countDoubleCoffee;
        this.countMilk = countMilk;
        this.isCream = isCream;
        this.isSugar = isSugar;
        this.isCinnamon = isCinnamon;
        this.isSyrup = isSyrup;
    }

    @Override
    public String toString() {
        return "Recipe:\n" +
                "Count coffee: " + countCoffee +
                "\nCount double coffee: " + countDoubleCoffee +
                "\nCount milk: " + countMilk +
                "\nCream: " + (isCream ? "yes" : "no") +
                "\nSugar: " + (isSugar ? "yes" : "no") +
                "\nCinnamon: " + (isCinnamon ? "yes" : "no") +
                "\nSyrup: " + (isSyrup ? "yes" : "no") +
                "\nBon appetit :)";
    }
}
