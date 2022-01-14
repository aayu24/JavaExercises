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
        printElements lambdaPrint = () -> {
            for (Person person : people) {
                System.out.println(person);
            }
        };

        lambdaPrint.print();
        //Step-3: Create a method that prints all people having lastName beginning with a C
        printElements lambdaPrintC = () -> {
            for (Person person : people) {
                if (person.getLastName().startsWith("C")){
                    System.out.println(person);
                }
            }
        };

        lambdaPrintC.print();
    }

}

interface printElements {
        public void print();
}