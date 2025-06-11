package Test;

public class Car {

    String brand;
    String model;
    int year;
    int seats;

    Car(String brand, String model, int year, int seats){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.seats = seats;

        System.out.println("You are driving the " + brand + model);
        System.out.println("With a model year of " + year + " and " + seats + " seats");

    }
}
