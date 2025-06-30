package Test.Generics;

public class Box <Thing> {

    Thing item;


    public void setItem(Thing item){

        this.item = item;
    }

     public Thing getItem(){
        return this.item;
     }
}
