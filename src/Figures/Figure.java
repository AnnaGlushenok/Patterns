package Figures;

import Colors.Color;

public abstract class Figure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
