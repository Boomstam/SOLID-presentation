package LiskovSubstitution;

public class Demo {
    public static void doSomething(Rectangle r) {
        r.setHeight(10);
        r.setWidth(5);
        System.out.println(r.getHeight() * r.getWidth() == 50);
    }

    public static void main(String[] args) {
        Square s = new Square(1, 1);
        doSomething(s);
    }
}
