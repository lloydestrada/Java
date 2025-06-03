import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int students = scanner.nextInt();

        int[] grades = new int[students];

        for(int i = 0; i < students; i++){
            System.out.println("Enter grade for Student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = grades[0];
        int min = grades[0];
        int pass = 0;

        for(int i = 0; i < students; i++){
            int grade = grades[i];
            sum += grade;

            if (grade > max){
                max = grade;
            }

            if(grade < min){
                min = grade;
            }

            if(grade >= 60){
                pass++;
            }

        }

        double Average = (double) sum / students;

        System.out.println("/------------Grade Report-------------/");
        System.out.println("Average grade: " + Average);
        System.out.println("Max grade: " + max);
        System.out.println("Min grade " + min);
        System.out.println("Student passed " + pass);

        scanner.close();
    }
}
