package Test.Composition;

public class Main {

    public static void main(String[] args){


        //Composition = Represents a "part-of" relationship between objects.
        Car car = new Car("Honda Civic Type R",2025, "V6");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
