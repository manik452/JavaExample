package BridgePattern;

/**
 * Created by Manik on 04-Jan-17.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void draw(double radious, int x, int y) {
        System.out.println("Green circle Radious "+radious);
    }
}
