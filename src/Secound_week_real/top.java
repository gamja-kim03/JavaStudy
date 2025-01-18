package Secound_week_real;
import java.util.Scanner;

public class top {
    
    public static void main(String[] args) {
        System.out.print("결과");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);{
            System.out.print("input number : ");
            int x = scanner.nextInt();
            for (int i = 1; i <= x; i++) {
                System.out.println("");
                for (int j = 0; j < i; j++) {
                    System.out.print("* "); 
                }
            }
        }
           
    }
}