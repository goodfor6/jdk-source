package test.proxy;

public class RealImage implements  Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFormDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(" displaying  " + fileName);
    }

    private void loadFormDisk(String fileName){
        System.out.println( " loading " + fileName);
    }
}
