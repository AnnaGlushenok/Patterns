public class Decorator implements Paint {
    private Paint paint;
    private String action;

    public Decorator(Paint paint, String action) {
        this.paint = paint;
        this.action = action;
    }

    @Override
    public String draw() {
        return paint.draw() + "\n" + this.action;
    }
}
