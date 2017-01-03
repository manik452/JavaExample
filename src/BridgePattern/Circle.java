package BridgePattern;

/**
 * Created by Manik on 04-Jan-17.
 */
public class Circle extends Shape {
    DrawAPI drawAPI;
    double radious;
    int x;
    int y;
    public Circle(double radious,int x, int y, DrawAPI drawAPI){
        super(drawAPI);
        this.drawAPI=drawAPI;
        this.radious=radious;
        this.x=x;
        this.y=y;
    }
    @Override
    public void draw() {
        drawAPI.draw(radious,x,y);
    }
}
