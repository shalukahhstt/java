public class Main {

    public static void main(String[] args) {
        
        // Shape shape = new Shape();  This doesnt work because Shape is an abstract class
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(7,3);

        circle.display();
        triangle.display();
        rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}