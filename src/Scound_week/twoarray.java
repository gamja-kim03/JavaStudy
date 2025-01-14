package Scound_week;

import java.util.Arrays;

public class twoarray {

    public int[][] second(int[] arr, int size) {
        int num = (arr.length + size - 1) / size;
        int[][] x = new int[num][size];

        for (int i = 0; i < arr.length; i++) {
            x[i / size][i % size] = arr[i];
        }

        return x;
    }

    public static void main(String[] args) {
        twoarray y = new twoarray();
        int[] arr = {4, 3, 6, 7, 8, 3, 4, 5, 3, 4, 1};
        int[][] x = y.second(arr, 3);

        for (int i = 0; i < x.length; i++) {
            System.out.print(Arrays.toString(x[i]));
        }

    }
}
