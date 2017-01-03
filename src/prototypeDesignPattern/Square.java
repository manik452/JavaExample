package prototypeDesignPattern;

/**
 * Created by Manik on 03-Jan-17.
 */
public class Square extends Shape {

    public Square(){
        //setType("Square");
        type="square";
    }
    @Override
    void draw() {
        System.out.println("This is inside in Square");
    }
}
