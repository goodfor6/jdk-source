package test2.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedColor();

    }

    public void setRedColor(){
        System.out.println("  border color red !!!");
    }
}
