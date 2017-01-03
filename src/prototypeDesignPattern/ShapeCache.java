package prototypeDesignPattern;

import javafx.scene.shape.Circle;
import sun.security.provider.SHA;

import java.util.Hashtable;

/**
 * Created by Manik on 03-Jan-17.
 */
public class ShapeCache {
    private static Hashtable<String,Shape> hashtable = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape= hashtable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        hashtable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        hashtable.put(rectangle.getId(),rectangle);
    }
}
