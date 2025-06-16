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
            System.out.println("4. List All Students");
            System.out.println("5. Exit\n");
            System.out.print("Enter your options: ");
            int choices = scanner.nextInt();

            switch (choices){

                case 1 -> addStudent(scanner, students);
                case 2 -> viewStudent(scanner, students);
                case 3 -> updateStudent(scanner, students);
                case 4 -> listStudents(students);
                case 5 -> isRunning = false;
            }
        }

        System.out.println("\nThank you!");
        System.out.println("See you again");
        scanner.close();

    }
    //Add Student
    public static void addStudent(Scanner scanner, ArrayList<Student> students){
        boolean isDuplicate;
        int roll;
        scanner.nextLine();
        System.out.print("Enter The Full Name: ");
        String name = scanner.nextLine();

        do{
            isDuplicate = false;
            System.out.print("Roll Number: ");
            roll = scanner.nextInt();
            scanner.nextLine();

            for(Student student : students){
                if(student.getRollNumber() == roll){
                    isDuplicate = true;
                    System.out.println("Roll Number already exist");
                    break;
                }
            }
        }while(isDuplicate);

        System.out.print("Department: ");
        String department = scanner.nextLine();

        System.out.print("GPA: ");
        double gpa = scanner.nextDouble();

        Student student = new Student(name, roll, department, gpa);

        students.add(student);

        System.out.println("\nStudent Added Successfully!\n");
    }
    //View Student
    public static void viewStudent(Scanner scanner, ArrayList<Student> students){

        boolean isfound = false;
        System.out.print("Enter the roll number: ");
        int roll = scanner.nextInt();

        for(Student student : students) {
            if (student.getRollNumber() == roll) {
                isfound = true;
                System.out.println("\n------------------");
                System.out.println("-----Details----");
                System.out.println("------------------");
                System.out.println("Name: " + student.getName());
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Department: " + student.getDepartment());
                System.out.println("GPA: " + student.getGpa());
                System.out.println(" ");

            }
        }
        if(!isfound){
            System.out.println("Student not found");
        }
    }
    //Update Student
    public static void updateStudent(Scanner scanner, ArrayList<Student> students){

        boolean isFound = false;
        System.out.print("Enter the roll number: ");
        int roll =  scanner.nextInt();

        for(Student student : students){
            if(student.getRollNumber() == roll){
                isFound = true;
                while(isFound){

                    System.out.println("\nWhat do you want to update?");
                    System.out.println("1. Name");
                    System.out.println("2. Department");
                    System.out.println("3. GPA");
                    System.out.println("4. Back to menu");
                    System.out.print("Enter your options: ");
                    int choice = scanner.nextInt();

                    switch (choice){

                        case 1 -> {
                            scanner.nextLine();
                            System.out.print("Enter the Name: ");
                            String newName = scanner.nextLine();
                            student.setName(newName);
                            System.out.println("Updated successfully.");
                        }


                        case 2 -> {

                            scanner.nextLine();
                            System.out.print("Enter the department: ");
                            String newDepartment = scanner.nextLine();
                            student.setDepartment(newDepartment);
                            System.out.println("Updated successfully.");
                        }


                        case 3 -> {

                            System.out.print("Enter the GPA: ");
                            double newGpa = scanner.nextDouble();
                            student.setGpa(newGpa);
                            System.out.println("Updated successfully.");
                        }


                        case 4 -> isFound = false;
                    }
                }
            }
        }

        if(!isFound){
            System.out.println("Student not found");
        }

    }
    //list Student
    public static void listStudents(ArrayList<Student> students){

        if(students.isEmpty()){
            System.out.println("\nNo Student found");
        }


        System.out.println("\n----- ALL LISTED STUDENTS -----\n");
        for(Student student : students){
            System.out.println("---------------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number : " + student.getRollNumber());
            System.out.println("Department :" + student.getDepartment());
            System.out.println("GPA: " + student.getGpa());
            System.out.println(" ");
        }
    }
}
