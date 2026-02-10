/**
 * STREAM-API UC2 - Ability to Transform Each Element to Double
 * and Store the Result.
 *
 * In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The map() intermediate operation is used to transform
 *    each element by doubling its value.
 * 3. The forEach() terminal operation is used to display
 *    transformed elements directly.
 * 4. The collect() terminal operation is used to store the
 *    transformed elements into a new List.
 *
 * @Developer
 * @version2.2
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // no storing directly processing.
        numbers.stream()
                .map(x -> x * 2)
                .forEach(System.out::println);

        // storing of elements.
        List<Integer> doubled = numbers.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }
}
