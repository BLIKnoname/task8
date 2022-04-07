package com.metanit;

import java.util.Arrays;
import java.util.Comparator;

public class Logic {


    public int[][] customSort(int[][] matrix) {
        return Arrays.stream(matrix)
                .sorted(Comparator.comparing(this::isDecrease))
                .toArray(int[][]::new);
    }

    private boolean isDecrease(int[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] > row[i + 1]) return true;
        }
        return false;
    }

    public void showMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
