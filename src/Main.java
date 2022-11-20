
public class Main {
    public static void main(String[] args) {
        Paint pic = new Canvas();

        Paint pencilStruct = new PencilStruct(pic);
        Paint color = new Color(pencilStruct);
        Paint detail = new Detail(color);

        System.out.println(detail.draw());
    }
}
