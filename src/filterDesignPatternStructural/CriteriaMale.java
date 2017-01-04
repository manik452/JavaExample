package filterDesignPatternStructural;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manik on 04-Jan-17.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> people) {

        List<Person> personList = new ArrayList<Person>();

        for (Person person:people){
            if("male".equalsIgnoreCase(person.getGender())){
                personList.add(person);
            }
        }
        return personList;
    }
}
