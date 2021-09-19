package com.klasevich.homework.functional;

import java.util.function.Function;

/**
 * <p>
 * Write a curried form of the function f(x,y,z)=x+y∗y+z∗z∗z using lambda expressions in Java >8 style.
 * The result and x, y, z must be integer numbers.
 * <p>
 * Write a curried function (using lambdas) that accepts four string arguments and concatenated all in one string
 * following the rules:
 * String cases: in the result string, first and second arguments must be in lower cases and third and fourth in
 * upper cases.
 * Order of arguments concatenation: first, third, second, fourth.
 */
public class Task6 {
    public static Integer countNumber(Integer a, Integer b, Integer c) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function1 = x -> y -> z -> x + y * y + z * z * z;
        return function1.apply(a).apply(b).apply(c);
    }

    public static String findString(String x, String y, String z, String f) {
        Function<String, Function<String, Function<String, Function<String, String>>>> function2 = a -> b -> c -> d -> new StringBuilder(a.toLowerCase())
                .append(c.toUpperCase())
                .append(b.toLowerCase())
                .append(d.toUpperCase())
                .toString();
        return function2.apply(x).apply(y).apply(z).apply(f);
    }
}
