package filterDesignPatternStructural;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manik on 04-Jan-17.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> personList = new ArrayList<Person>();

        for (Person person:people){
            if ("single".equalsIgnoreCase(person.getGender())){
                personList.add(person);
            }
        }
        return personList;
    }
}
