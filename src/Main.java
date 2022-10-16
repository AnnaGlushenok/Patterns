import Colors.*;
import Figures.*;

public class Main {

    public static void main(String[] args) {
        Circle redCircle = new Circle(new RedColor());
        Rectangle rect = new Rectangle(new BlueColor());
        Rectangle stripedRect = new Rectangle(new StripedRed());
        redCircle.draw();
        rect.draw();
        stripedRect.draw();
    }
}