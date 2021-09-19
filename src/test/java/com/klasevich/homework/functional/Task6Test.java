package com.klasevich.homework.functional;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @ParameterizedTest
    @MethodSource("getArgumentsForCountingNumber")
    void countNumberTest(Integer a, Integer b, Integer c, Integer expected) {
        Integer actual = Task6.countNumber(a, b, c);
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("getArgumentsForFindingString")
    void findStringTest(String x, String y, String z, String f, String expected) {
        String actual = Task6.findString(x, y, z, f);
        assertEquals(actual, expected);
    }

    static Stream<Arguments> getArgumentsForCountingNumber() {
        return Stream.of(
                Arguments.of(2, 3, 4, 75),
                Arguments.of(1, 5, 3, 53)
        );
    }

    static Stream<Arguments> getArgumentsForFindingString() {
        return Stream.of(
                Arguments.of("j", "v", "a", "a", "jAvA"),
                Arguments.of("l", "v", "o", "e", "lOvE")
        );
    }
}