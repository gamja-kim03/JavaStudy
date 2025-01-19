package Secound_week_real;
import java.util.Scanner;

public class top {
    
    public static void main(String[] args) {
        System.out.print("결과");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);{
            System.out.print("input number : ");
            int x = scanner.nextInt();

           /* 1차 시도 실패
           for (int i = 1; i <= x; i++) {
                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print("* "); 
                }
            }*/

            for (int i = 1; i <= x; i++) {
                for (int j = 0; j < x - i; j++) {
                  System.out.print(" ");  // 오른쪽 정렬을 하기 위해 공백백
                }
                for (int j = 0 ; j < i; j++){// 나머지 부분은 * 출력
                  System.out.print("*");
                }
                System.out.println(" ");
            }
        }        
    }
}