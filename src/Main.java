public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Barista barista = new Barista();
        Coffee americano = menu.americano(barista);
        System.out.println("\n" + americano);
        System.out.println();
        Coffee latte = menu.latte(barista);
        System.out.println("\n" + latte);
    }
}
