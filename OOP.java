import java.util.Random;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        CarOOP car = new CarOOP();

        car.drive();
        car.stop();
    }
}
