/**
 * STREAM-API UC1 - Ability to Create a Stream and Iterate to show each
 * element of the stream.
 *
 * In this we have created stream using different Sources and stream is created.
 * Also, we have implemented forEach() method on the stream.
 *
 * @Developer
 * @version2.1
* */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Akhil", "Rahul", "Priya", "Sneha");

        // creating stream and iterating it.
        names.stream().forEach(name -> System.out.println(name));

        // Using Method Reference.
        names.stream().forEach(System.out::println);
        // System.out::println is a method reference
        // It does the same as name -> System.out.println(name)

        // Using different Sources and applying stream
        String[] arr = {"C++", "Java", "Python"};
        Arrays.stream(arr).forEach(System.out::println);

        // Using Stream.of()
        Stream.of(10, 20, 30, 40).forEach(System.out::println);

        // Using Set
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4));
        numbers.stream().forEach(System.out::println);
    }
}
