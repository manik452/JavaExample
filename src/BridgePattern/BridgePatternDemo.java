package BridgePattern;

/**
 * Created by Manik on 04-Jan-17.
 */
public class BridgePatternDemo {
    public static void main(String[] agrs){
        Circle circleRed = new Circle(100,10,10,new RedCircle());
        Circle circleGreen = new Circle(120,30,30,new GreenCircle());

        circleRed.draw();
        circleGreen.draw();

    }
}
