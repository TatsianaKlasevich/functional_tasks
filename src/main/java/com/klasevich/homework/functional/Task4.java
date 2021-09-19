package com.klasevich.homework.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.
 * <p>
 * Important. You should write only the collector in any valid formats but without ; on the end.
 * It will be passed as an argument to the collect() method of a stream as shown below.
 */
public class Task4 {

    public static long countProductOfSquaresOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.reducing(1, (a, b) -> a * b * b));
    }
}