package Test.AnonymousClass;

public class Main {

    public static void main(String[] args){

        //Anonymous class = a class does not have a name, and cannot be reused.


        Dog dog = new Dog();
        TalkingDog talkingDog = new TalkingDog();

        //Anonymous class
        Dog dog1 = new Dog(){

            @Override
            void speak() {
                System.out.println("Another one barks");
            }
        };

        dog.speak();
        talkingDog.speak();

        dog1.speak();

    }
}
