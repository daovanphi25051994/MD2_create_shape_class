package demo;

public class TestCase {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        rec1.setFilled(false);
        Rectangle rec2 = new Rectangle(3.3, 4.4);
        rec2.setColor("white");
        Rectangle rec3 = new Rectangle("black", false, 6.6, 7.7);
        Circle cir1 = new Circle();
        Circle cir2 = new Circle(9.9);
        Circle cir3 = new Circle("red", false, 2.2);
        Shape h1 = new Rectangle();
        Shape h2 = rec2;
        Shape h3 = new Circle(66.66);
        Square square1 = new Square("grey", false, 5.5);
        Rectangle rec4 = new Square(11.11);
        Shape h4 = new Square(22.22);
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3.toString());
        System.out.println(cir1.toString());
        System.out.println(cir2.toString());
        System.out.println(cir3.toString());
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println(h3.toString());
        System.out.println(square1.toString());
        System.out.println(rec4.toString());
        System.out.println(h4);
    }
}
