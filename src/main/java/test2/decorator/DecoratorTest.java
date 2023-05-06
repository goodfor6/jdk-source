package test2.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        YellowShapeDecorator yellowShapeDecorator = new YellowShapeDecorator(new Circle());
        YellowShapeDecorator yellowShapeDecorator2 = new YellowShapeDecorator(new Rectangle());

        yellowShapeDecorator2.draw();
        yellowShapeDecorator.draw();


        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(new Circle());
        RedShapeDecorator redShapeDecorator2 = new RedShapeDecorator(new Rectangle());

        redShapeDecorator.draw();
        redShapeDecorator2.draw();

    }
}
