package six_week;

import java.util.Random;
import java.util.Scanner;


public class sumgame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("다음 열 문제를 푸시오.");

        while (true) { 
            int x = rand.nextInt(10);
            int y = rand.nextInt(10);

            System.out.print(x + " + " + y+ " = ");
            int my= scanner.nextInt();
        }

    }
}
