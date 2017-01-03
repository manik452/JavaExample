package BridgePattern;

/**
 * Created by Manik on 04-Jan-17.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void draw(double radious, int x, int y) {
        System.out.println("This is Red radious "+ radious);

    }
}
