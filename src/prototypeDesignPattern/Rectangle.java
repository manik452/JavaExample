package prototypeDesignPattern;

/**
 * Created by Manik on 03-Jan-17.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        //setType("rectangle");
        type="Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Shape inside Rectangle");
    }
}
