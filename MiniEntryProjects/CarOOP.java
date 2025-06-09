package MiniEntryProjects;

public class CarOOP {

    String make = "Honda";
    String model = "Civic Type R";
    int year = 2024;
    double price = 58000;

    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }

    void brake(){
        System.out.println("You brake the " + model);
    }
}
