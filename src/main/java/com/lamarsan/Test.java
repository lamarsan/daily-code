package com.lamarsan;


import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static final int[] VALUES = {1, 2};

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.stream().peek(System.out::println);
    }
}
