//2번
package First_week;
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("결과: "); 
             
            System.out.print("num1 : ");
            int x = scanner.nextInt();
             
            System.out.print("num2 : ");
            int y = scanner.nextInt();
             
            int sum = 0 ;
             
            for ( int i = x; i<= y; i++){
                sum += i;
            }
            System.out.println(sum);
            }
    }
}