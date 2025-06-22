package Test.MethodOverriding;

public class Bird extends Animal{

    @Override
    void move(){
        System.out.println("This animal is flying");
    }
}
