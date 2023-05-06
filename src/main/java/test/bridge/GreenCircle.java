package test.bridge;

public class GreenCircle implements DrawApi{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(" green  x: " + x+" , y :" + y +" radius :"+radius);
    }
}
