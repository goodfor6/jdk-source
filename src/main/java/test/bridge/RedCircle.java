package test.bridge;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(" red  x: " + x+" , y :" + y +" radius :"+radius);
    }
}
