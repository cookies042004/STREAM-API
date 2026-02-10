/**
 * STREAM-API UC3 - Ability to store the Transformed doublevalue into a new List
 *
 * In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The map() intermediate operation is used to transform
 *    each element by doubling its value.
 * 3. The collect() terminal operation is used to store the
 *    transformed elements into a new List.
 *
 * @Developer
 * @version2.3
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // storing of elements.
        List<Integer> doubled = numbers.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(doubled);
    }
}
