package Scound_week;

import java.util.Arrays;

// https://adjh54.tistory.com/451 참고고

public class twoarray { // 'two' 메서드 정의

    public static int[][] two(int[] oneArray, int rows, int cols) {
        // 2차원 배열 두 개의 크기를 지정하여 생성 (행: rows, 열: cols)
        int[][] twoArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {// 행을 순차적으로 반복
            for (int j = 0; j < cols; j++) {// 열을 순차적으로 반복

             /* ("i * cols) + j"-> 1차원 배열 인덱스를 계산하는 방식
                1차원 배열 oneArray의 크기를 초가하지 않기 위해서 if를 사용
                2차원 배열에 값을 채울 때, oneArray의 요소들이 모두 채워지면 더 이상 값을 넣을 수 없기 떄문
                초과하는 경우에는 0을 채워 넣음
                */
                if ((i * cols) + j < oneArray.length) {
                    twoArray[i][j] = oneArray[(i * cols) + j];
                } else {
                    twoArray[i][j] = 0;
                    //맨 마지막에 [4,1]을 하고 싶은데 방법을 모르겠어서 0을 입력하도록 했음
                }
            }
        }
        return twoArray;
    }

    public static void main(String[] args) {
        int[] oneArray = {4, 3, 6, 7, 8, 3, 4, 5, 3, 4, 1};
        int rows = 4;
        int cols = 3;

        // 'two' 메서드 호출
        int[][] n = two(oneArray, rows, cols);

        for (int[] k : n) {
            /* 'for-each' 문: n 배열의 각 행을 하나씩 k에 대입
            n.length번 반복, k는 n[0], .args.., n[3]로 번갈아 반복
            k = n[0] -> [4, 3, 6]
            k = n[1] -> [7, 8, 3]
            k = n[2] -> [4, 5, 3]
            k = n[3] -> [4, 1, 0]  */

            System.out.print(Arrays.toString(k));
        }
    }
}
