package toString;

public class toString {
    public static void main(String[] args){


        //.toString() = method inherited from the Object class
        Car car = new Car("Honda", "Cvic", 2024, "Dark Blue");
        Car car2 = new Car("Ford", "Mustang", 2025, "Blue" );

        System.out.println(car);
        System.out.println(car2);

    }
}
