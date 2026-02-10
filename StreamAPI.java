/**
 * STREAM-API UC4 - Ability to Filter Even Numbers from a Stream
 * and Store the Result into a New List.
 *
 * In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The filter() intermediate operation is used to select
 *    only even numbers from the stream.
 * 3. The collect() terminal operation is used to store
 *    the filtered elements into a new List.
 *
 * @Developer
 * @version: 2.4
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Storing only even numbers into a new list
        List<Integer> even = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);
    }
}
