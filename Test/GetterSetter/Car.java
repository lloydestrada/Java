package Test.GetterSetter;

public class Car {

    private String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel(){
        return this.model;
    }

    public String getColor(){
        return this.color;
    }

    public int getPrice(){
        return this.price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
       if(price < 0){
           System.out.println("Insufficient and cannot be less than zero");
       }
       else {
           this.price = price;
       }
    }

}
