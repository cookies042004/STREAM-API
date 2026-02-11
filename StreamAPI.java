/**
 * STREAM-API UC6 - Ability to find min and max even number in the number stream.
 *
 In this program:
 * 1. A Stream is created from a List using stream().
 * 2. The filter() intermediate operation is used to select
 *    only even numbers.
 * 3. The findFirst() terminal operation is used to retrieve
 *    the first matching element from the stream.
 *
 * @Developer
 * @version: 2.6
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);

        Optional<Integer> minEven = numbers.stream()
                .filter(x -> x % 2 == 0)
                .min(Integer::compareTo);

        Optional<Integer> maxEven = numbers.stream()
                .filter(x -> x % 2 == 0)
                .max(Integer::compareTo);

        minEven.ifPresent(x -> System.out.println("Minimum Even: " + x));
        maxEven.ifPresent(x -> System.out.println("Maximum Even: " + x));
    }
}
