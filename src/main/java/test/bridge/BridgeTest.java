package test.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(1,2,3,new RedCircle());
        Shape greenCircle = new Circle(4,5,3,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
