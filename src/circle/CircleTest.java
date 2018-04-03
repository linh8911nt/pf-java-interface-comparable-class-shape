package circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("blue", false, 2.4);
        System.out.println(circle);
    }
}
