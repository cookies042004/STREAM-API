/**
 * STREAM-API UC7 - Ability to find the sum and the average in the number stream.
 *
 In this program:
 *  1. A Stream is created from a List using stream().
 *  2. mapToInt() converts Stream<Integer> to IntStream.
 *  3. sum() calculates total of elements.
 *  4. average() calculates average value.
 *
 * @Developer
 * @version: 2.7
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 10);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();

        System.out.println("Sum: " + sum);
        average.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
