package Test.Interface;

public class Hawk implements Predator{

    @Override
    public void hunt(){
        System.out.println("The hawk is finding a prey to hunt");
    }
}
