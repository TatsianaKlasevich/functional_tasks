package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {


    @ParameterizedTest
    @MethodSource("getArgumentsForTestingIfAllValuesAreDifferent")
    void testIfAllValuesAreDifferent(int a, int b, int c, boolean expected) {
        boolean actual = Task1.allValuesAreDifferentPredicate.test(a, b, c);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForTestingIfAllValuesAreDifferent() {
        return Stream.of(
                Arguments.of(2, 4, 5, true),
                Arguments.of(2, 4, 4, false)
        );
    }

}