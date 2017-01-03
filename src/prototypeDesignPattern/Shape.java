package prototypeDesignPattern;

/**
 * Created by Manik on 03-Jan-17.
 */
public abstract class Shape implements Cloneable {
    private String Id;
    protected String type;

    abstract void draw();

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object clone(){
        Object clone =null;

        try {
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.getLocalizedMessage();
        }
        return clone;
    }
}
