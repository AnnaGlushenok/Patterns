public class Barista implements Requirements {
    private int countCoffee;
    private int countDoubleCoffee;
    private int countMilk;
    private boolean isCream;
    private boolean isSugar;
    private boolean isCinnamon;
    private boolean isSyrup;

    @Override
    public void coffee(int countCoffee) {
        this.countCoffee = countCoffee;
        System.out.println("Count one coffee: " + countCoffee);
    }

    @Override
    public void doubleCoffee(int countDoubleCoffee) {
        this.countDoubleCoffee = countDoubleCoffee;
        System.out.println("Count double coffee: " + countDoubleCoffee);
    }

    @Override
    public void milk(int countMilk) {
        this.countMilk = countMilk;
        System.out.println("Count milk: " + countMilk);
    }

    @Override
    public void cream(boolean isCream) {
        this.isCream = isCream;
        System.out.println("Cream: " + (isCream ? "yes" : "no"));
    }

    @Override
    public void sugar(boolean isSugar) {
        this.isSugar = isSugar;
        System.out.println("Sugar: " + (isSugar ? "yes" : "no"));
    }

    @Override
    public void cinnamon(boolean isCinnamon) {
        this.isCinnamon = isCinnamon;
        System.out.println("Cinnamon: " + (isCinnamon ? "yes" : "no"));
    }

    @Override
    public void syrup(boolean isSyrup) {
        this.isSyrup = isSyrup;
        System.out.println("Syrup: " + (isSyrup ? "yes" : "no"));
    }

    public Coffee makeCoffee() {
        System.out.println("Pshshshshshshshsh");
        return new Coffee(countCoffee, countDoubleCoffee, countMilk, isCream, isSugar, isCinnamon, isSyrup);
    }
}
