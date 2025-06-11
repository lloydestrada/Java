package Test;

public class Super {
    public static void main(String[] args){

        //Super - refers to the parent class (superclass).
        // Used in constructors and method overriding.

        Person person = new Person("Lloyd", "Estrada");
        Student student = new Student("Sky", "Baliw", 3.25);
        Employee employee = new Employee("JL", "Estrada", 25000);

        person.showName();

        student.showGPA();

        employee.showSalary();

    }
}

