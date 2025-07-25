package MiniEntryProjects.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (dd/MM/yyyy): ");
        String inputDate = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(inputDate);

            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            String dayName = dayFormat.format(date);

            System.out.println("Day of the week: " + dayName);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }

        scanner.close();
    }
}