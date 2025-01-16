package Scound_week;

import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("input number : ");
            int x = scanner.nextInt();

            for (int i = 1; i <= x; i++) { //i를 1부터 x까지 반복
                for (int j = 0; j < x - i; j++) { 
                    //별을 오른쪽으로 정렬해야하니까 왼쪽부분은 공백으로 출력                
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    // j를 사용하여 i만큼 별을 출력
                    System.out.print('*');
                }
                System.out.println();
            }
        }
    }

}
