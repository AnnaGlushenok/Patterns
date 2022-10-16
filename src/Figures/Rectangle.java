package Figures;

import Colors.Color;

public class Rectangle extends Figure {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint();
        System.out.println("Rectangle");
    }
}
