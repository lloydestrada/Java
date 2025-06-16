package MiniEntryProjects.StudentRecordManagementSystem;

public class Student {

    private String name;
    private int rollNumber;
    private String department;
    private double gpa;


    Student(String name, int rollNumber, String department, double gpa){

        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.gpa = gpa;

    }

    public String getName(){
        return this.name;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public String getDepartment(){
        return this.department;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setName(String name){
         this.name = name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }
}
