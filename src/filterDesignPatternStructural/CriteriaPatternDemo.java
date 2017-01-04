package filterDesignPatternStructural;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manik on 04-Jan-17.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Manik","Male","Single"));
        personList.add(new Person("rahim","male","Married"));
        personList.add(new Person("Debi","Female","single"));
        personList.add(new Person("Bashona","Female","Married"));

        Criteria male=new CriteriaMale();
        Criteria female= new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(male,single);
        Criteria singleOrFemale = new OrCriteria(female,single);

        System.out.println("Male");
        printCriteria(male.meetCriteria(personList));
        System.out.println("Female ");
        printCriteria(female.meetCriteria(personList));
        System.out.println("Single");
        printCriteria(single.meetCriteria(personList));
        System.out.println("Single or male ");
        printCriteria(singleOrFemale.meetCriteria(personList));
        System.out.println("single and marrited ");
        printCriteria(singleMale.meetCriteria(personList));

    }

    private static void printCriteria(List<Person> people) {
        for (Person person:people){
            System.out.println("Name "+person.getName()+" gender "+person.getGender()+" Status"+person.getMaritialStatus());
        }

    }
}
