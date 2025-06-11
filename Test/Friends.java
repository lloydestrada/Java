package Test;

public class Friends {
    public static void main(String[] args){

        //static = makes a variable or method belongs to the class rather than to any specific object.

        Friends friend1 = new Friends("JB");
        Friends friend2 = new Friends("Trisha");
        Friends friend3 = new Friends("Charles");

        Friends.showFriends();
    }

    static int numOfFriends;
    String name;


    Friends(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }
}


