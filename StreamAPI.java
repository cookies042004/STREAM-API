/**
 * STREAM-API UC5 - Ability to peak and show the first even number in
 * the number stream.
 *
 In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The filter() intermediate operation is used to select
 *    only even numbers.
 * 3. The findFirst() terminal operation is used to retrieve
 *    the first matching element from the stream.
 *
 * @Developer
 * @version: 2.5
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Storing only even numbers into a new optional
        Optional<Integer> even = numbers.stream()
                .filter(x -> x % 2 == 0)
                .findFirst();

        System.out.println(even);
    }
}
