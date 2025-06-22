package Test.Abstract;

public class Abstract {
    public static void main(String[] args){

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);
        Square square = new Square(5);


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        System.out.println(square.area());

    }
}
