public class Menu {
    public Coffee americano(Barista barista) {
        barista.coffee(1);
        return barista.makeCoffee();
    }

    public Coffee flatWhite(Barista barista) {
        barista.doubleCoffee(1);
        barista.milk(1);
        return barista.makeCoffee();
    }

    public Coffee latte(Barista barista) {
        barista.coffee(1);
        barista.milk(1);
        barista.cream(true);
        return barista.makeCoffee();
    }

    public Coffee chief(Barista barista) {
        barista.doubleCoffee(1);
        barista.sugar(true);
        barista.syrup(true);
        barista.cinnamon(true);
        return barista.makeCoffee();
    }
}
