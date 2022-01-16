package src;

import java.util.Arrays;
import java.util.List;


/**
 * Example of Streams API with Lambda expressions
 * Reference: https://www.youtube.com/watch?v=1OpAgZvYXLQ&t=2100s
 */

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
            1,2,3,5,4,6,7,8,10,11,9
        );

        numbers.stream()
            .filter(StreamExample::isGT3) // intermediate operations - just build the pipeline of operations
            .filter(StreamExample::isEven)
            .forEach(StreamExample::printMessage); // terminal operation - cause the built pipeline to be executed (lazy execution)
    }

    public static boolean isGT3(Integer number) {
        return number > 3;
    }

    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    public static void printMessage(Integer number) {
        System.out.println("Printing number: " + number.toString());
    }
}
