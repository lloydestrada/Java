package Test.GetterSetter;

public class Main {
    public static void main(String[] args){

        //They help protect object data and add rules for accessing or modifying
        //Getter - makes the field READABLE
        //Setter - makes the field WRITABLE/MODIFY

        Car car = new Car("Honda Civic", "Black", 122222);


        car.setColor("Purple");
        car.setPrice(-600000);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


    }

}
