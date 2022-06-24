package Programmers.Practice;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Rectangle extends IOException {
    public static void main(String[] args) {

        int[][] array = {{1, 4}, {3, 4}, {3, 10}};
        int[] answer = {};
        Integer[] manyX = new Integer[array.length], manyY = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    manyX[i] = array[i][j];
                } else {
                    manyY[i] = array[i][j];
                }
            }
        }

        Set<Integer> uniqueXSet = Arrays.stream(manyX).filter(i -> Collections.frequency(List.of(manyX), i) == 1)
                .collect(Collectors.toSet());
        Set<Integer> uniqueYSet = Arrays.stream(manyY).filter(i -> Collections.frequency(List.of(manyY), i) == 1)
                .collect(Collectors.toSet());

        int uniqueX = uniqueXSet.stream().mapToInt(Integer::intValue).toArray()[0];
        int uniqueY = uniqueYSet.stream().mapToInt(Integer::intValue).toArray()[0];


        answer = new int[]{uniqueX, uniqueY};

        System.out.println(Arrays.toString(answer));
    }
}
