package five_week;

import java.util.Random;
import java.util.Scanner;

public class sumgame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("다음 문제를 푸시오.");

        while (true) { 
            // 숫자 1 생성
            int [] x= new int [1];
            for (int i = 0; i < 1; i++) {
                x[i] = rand.nextInt(10);
            }

            //숫자 2 생성
            int [] y = new int [1];

            for (int i = 0; i < 1; i++) {
                y[i] = rand.nextInt(10);
            }
            
            System.out.print(x[0] + " + " + y[0] + " = ");
            int my= scanner.nextInt();

            if (answer(x[0], y[0],my)){
                System.out.println("정답입니다.");
                break;
            } else {
                System.out.println("틀렸습니다");
                System.out.println("다시 생각해보세요");
            }

            // 문제

            /* 따로 함수를 안만들고 했을 때
            System.out.print(x[0] + "+" + y[0] + " = ");
            int ansewr = scanner.nextInt();

            if (ansewr == x[0] + y[0]){
                System.out.println("정답입니다.");
                break;
            } 
            else{
                System.out.println("틀렸습니다");
            } */
        }            
    }
    
    public static boolean answer(int a, int b, int u){
        return (a + b) == u;
    }

}