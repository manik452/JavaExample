package BridgePattern;

/**
 * Created by Manik on 04-Jan-17.
 */
public abstract class Shape {
    DrawAPI drawAPI;
    public Shape(DrawAPI drawAPI) {
        this.drawAPI=drawAPI;
    }
    public abstract void draw();
}
