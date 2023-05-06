package test2.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Image image = new ProxyImage("ssss.png");
        image.display();
        System.out.println("==================");
        image.display();

    }
}
