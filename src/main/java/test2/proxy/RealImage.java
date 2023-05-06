package test2.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void display() {
        System.out.println( " img display " +fileName);
    }

    private void loadFile(String fileName){
        System.out.println(" loading file : "+ fileName);
    }
}
