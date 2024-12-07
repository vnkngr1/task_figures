public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}