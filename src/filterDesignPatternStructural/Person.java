package filterDesignPatternStructural;

/**
 * Created by Manik on 04-Jan-17.
 */
public class Person {
    private String name;
    private String gender;
    private String maritialStatus;

    public Person(String name, String gender, String maritialStatus) {
        this.name = name;
        this.gender = gender;
        this.maritialStatus = maritialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritialStatus() {
        return maritialStatus;
    }

    public void setMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
    }
}
