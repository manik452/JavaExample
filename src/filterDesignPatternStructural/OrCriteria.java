package filterDesignPatternStructural;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manik on 04-Jan-17.
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> firstCriteria= criteria.meetCriteria(people);
        List<Person> otherPersonList=criteria.meetCriteria(people);

        for(Person person: otherPersonList) {
            if (firstCriteria.contains(person)){
                firstCriteria.add(person);
            }
        }
        return firstCriteria;
    }
}
