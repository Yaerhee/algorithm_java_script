package Programmers.Practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Rectangle extends IOException {
    public static void main(String[] args) {

        int[][] array = {{7,2}, {2,3}, {3, 4}};
        int[] answer = {};
        int[] manyX = new int[array.length], manyY = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            manyX[i] = array[i][0];
            manyY[i] = array[i][1];
        }

        int uniqueX = (int) Arrays.stream(manyX).flatMap(IntStream::of).distinct().count();
        int uniqueY = (int) Arrays.stream(manyY).flatMap(IntStream::of).distinct().count();

        answer = new int[]{uniqueX, uniqueY};

        System.out.println(Arrays.toString(answer));
    }
}
