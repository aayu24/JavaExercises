package src;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        ); 

        //Step-1: Sort list by lastName
        people.sort((a,b)-> a.getLastName().compareTo(b.getLastName()));
        
        //Step-2: Create a method that prints all the elements in the list
        printConditionally(people, p -> true);

        //Step-3: Create a method that prints all people having lastName beginning with a C
        printConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    /**
     * Method that takes in a list, applies a condition on that list and prints the result
     * @param persons
     * @param condition
     */
    public static void printConditionally(List<Person> persons, Condition condition){
        for (Person person : persons) {
            if (condition.test(person)){
                System.out.println(person);
            }
        }
    }

}

/**
 * Represents a condition applicable on a Person
 */
@FunctionalInterface
interface Condition {
    boolean test(Person p);
}