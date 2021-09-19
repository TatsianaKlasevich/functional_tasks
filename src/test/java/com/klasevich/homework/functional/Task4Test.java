package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @ParameterizedTest
    @MethodSource("getArgumentsForCountingProductOfSquaresOfNumbers")
    void countProductOfSquaresOfNumbersTest(List<Integer> numbers, long expected) {
        long actual = Task4.countProductOfSquaresOfNumbers(numbers);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForCountingProductOfSquaresOfNumbers() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3), 36),
                Arguments.of(List.of(2, 3, 4), 576),
                Arguments.of(List.of(3, 5, 7), 11025)
        );
    }
}
