package test.decorator;

public class DecoratorTest {




    public static void main(String[] args) {
        Shape circle= new RedShapeDecorator(new Circle());
        Shape redRectangle = new YellowShapeDecorator(new Rectangle());

        circle.draw();

        redRectangle.draw();

    }
}
