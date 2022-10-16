package Colors;

public class StripedRed implements Color {
    @Override
    public void paint() {
        char[] str = "Striped red ".toCharArray();
        for (int i = 0; i < str.length - 1; i += 2)
            System.out.print(Colors.RED.getColor() + str[i] + Colors.YELLOW.getColor() + str[i + 1]);
    }
}
