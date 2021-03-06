package src;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
        printConditionally(people, p -> true, System.out::println);

        //Step-3: Create a method that prints all people having lastName beginning with a C
        printConditionally(people, p -> p.getLastName().startsWith("C"), System.out::println );

    }

    /**
     * Method that takes in a list, applies a condition on that list and prints the result
     * @param persons - List of Person objects
     * @param predicate - default Predicate functional interface that is applied on Person
     */
    public static void printConditionally(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person person : persons) {
            if (predicate.test(person)){
                consumer.accept(person);
            }
        }
    }

}