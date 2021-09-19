package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @ParameterizedTest
    @MethodSource("getArgumentsForTestingIdentityTransformation")
    void identityTransformationTest(List<Integer> numbers, List<Integer> expected) {
        List<Integer> actual = Task7.identityTransformation.apply(numbers);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForTestingMultTwoAndThenAddOneTransformation")
    void multTwoAndThenAddOneTransformationTest(List<Integer> numbers, List<Integer> expected) {
        List<Integer> actual = Task7.multTwoAndThenAddOneTransformation.apply(numbers);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForTestingSquareAndThenGetNextEvenNumberTransformation")
    void squareAndThenGetNextEvenNumberTransformationTest(List<Integer> numbers, List<Integer> expected) {
        List<Integer> actual = Task7.squareAndThenGetNextEvenNumberTransformation.apply(numbers);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForTestingIdentityTransformation() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 1), List.of(1, 1, 1)),
                Arguments.of(List.of(1, 2, 3), List.of(1, 2, 3))
        );
    }

    static Stream<Arguments> getArgumentsForTestingMultTwoAndThenAddOneTransformation() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 1), List.of(3, 3, 3)),
                Arguments.of(List.of(1, 2, 3), List.of(3, 5, 7))
        );
    }

    static Stream<Arguments> getArgumentsForTestingSquareAndThenGetNextEvenNumberTransformation() {
        return Stream.of(
                Arguments.of(List.of(1, 1, 1), List.of(2, 2, 2)),
                Arguments.of(List.of(1, 2, 3), List.of(2, 6, 10))
        );
    }
}