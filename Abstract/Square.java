package Abstract;

public class Square {

    double side;

    Square(double side){
        this.side = side;
    }

    double area(){
        return Math.pow(side, 2);
    }
}
