/**
 * STREAM-API UC8 - Ability to Check Whether All Numbers or
 * At Least One Number is Even in the Stream.
 *
 * In this program:
 * 1. A Stream is created from a List using stream().
 * 2. allMatch() checks if all elements satisfy the condition.
 * 3. anyMatch() checks if at least one element satisfies the condition.
 *
 * @Developer
 * @version 2.8
 */

import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8);

        boolean allEven = numbers.stream()
                .allMatch(x -> x % 2 == 0);

        boolean anyEven = numbers.stream()
                .anyMatch(x -> x % 2 == 0);

        System.out.println("Are all numbers even? " + allEven);
        System.out.println("Is at least one number even? " + anyEven);
    }
}
