/**
 * STREAM-API UC9 - Ability to Sort Numbers in Ascending Order Using sorted().
 *
 * In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The sorted() intermediate operation sorts elements
 *    in natural (ascending) order.
 * 3. The collect() terminal operation stores the result
 *    into a new List.
 *
 * @Developer
 * @version 2.9
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 4);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending Order: " + sortedNumbers);
    }
}
