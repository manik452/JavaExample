package filterDesignPatternStructural;

import java.util.List;

/**
 * Created by Manik on 04-Jan-17.
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria oteherCriteria;

    public AndCriteria(Criteria criteria, Criteria oteherCriteria) {
        this.criteria = criteria;
        this.oteherCriteria = oteherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> people) {
        List<Person> personList=criteria.meetCriteria(people);
        return oteherCriteria.meetCriteria(personList);
    }
}
