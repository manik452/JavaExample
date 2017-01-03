package prototypeDesignPattern;

import sun.security.provider.SHA;

/**
 * Created by Manik on 03-Jan-17.
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        System.out.println("Hello world");

        ShapeCache.loadCache();

        Shape cloneShape=(Shape) ShapeCache.getShape("1");
        System.out.println(cloneShape.getType());
    }
}
