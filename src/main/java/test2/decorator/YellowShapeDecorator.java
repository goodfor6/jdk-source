package test2.decorator;

public class YellowShapeDecorator extends ShapeDecorator{

    public YellowShapeDecorator(Shape shapeDecorator) {
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setYellowColor();
    }

    public void setYellowColor(){
        System.out.println(" border color : yellow");
    }
}
