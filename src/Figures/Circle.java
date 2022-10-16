package Figures;

import Colors.Color;

public class Circle extends Figure {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.paint();
        System.out.println("Circle");
    }
}
