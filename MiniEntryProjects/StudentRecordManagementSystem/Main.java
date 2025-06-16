package MiniEntryProjects.StudentRecordManagementSystem;
import java.util.*;
public class Main {
    public static void main(String[] args){

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (isRunning) {

            System.out.println("***********************");
            System.out.println("Welcome to the system!");
            System.out.println("***********************\n");

            System.out.println("--MENU--\n");

            System.out.println("1. Add New Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student Details");
            System.out.println("4. Exit");
            int choices = scanner.nextInt();

            switch (choices){

                case 1 ->addStudent();
                case 2 ->;
                case 3 -> ;
                case 4 -> isRunning = false;
            }
        }

        System.out.println("Thank you!");
        System.out.println("See you again");
        scanner.close();

    }

    public static void addStudent(Scanner scanner, ArrayList<Student> students){

        System.out.print("Enter The Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.println("GPA: ");
        double gpa = scanner.nextDouble();

        Student student = new Student(name, roll, department, gpa);

        students.add(student);
    }


}
